package 反射;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/5 上午 8:48
 * *@Description This is a description of ReflectionReview1
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class ReflectionReview1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {


        Class c = Class.forName("反射.Person");
        Field f = c.getField("name");
        Object o = c.newInstance();
        f.set(o, "Michael Jackson");

        Field f1 = c.getField("age");
        f1.set(o, 51);
        /*Field f2 = c.getField("address");
        f2.set(o,"the United States");*/

        Field f3 = c.getField("number");
        f3.set(o, 00112345L);


        Field f4 = c.getDeclaredField("balance");
        f4.setAccessible(true);
        f4.set(o, 666.66);

        Method m = c.getMethod("walk");
        System.out.println(m.getModifiers());

        System.out.println(f4.getModifiers());
        System.out.println(f3.getModifiers());

        Field f5 = c.getField("fakeInt");
        System.out.println(f5.getModifiers());

        System.out.println(f5.getModifiers());
        System.out.println(f5.getType());
        System.out.println(f5.getName());

        Method m1 = c.getMethod("walk");
        m1.invoke(o);

        Method m2 = c.getDeclaredMethod("eat");
        m2.setAccessible(true);
        m2.invoke(o);

        System.out.println(m2.getReturnType());
        System.out.println(m2.getParameterTypes());

        Method m3 = Class.forName("反射.Person").getDeclaredMethod("fakeFunc", String.class, double.class);

        m3.setAccessible(true);
        m3.invoke(new Person(), "hehe", 6.66);
        System.out.println(m3.getReturnType());
        System.out.println(m3.getParameterTypes());
        Class[] c1 = m3.getParameterTypes();
        for (Class c2 : c1) {

            System.out.println(c2.toString());

        }

        System.out.println("------------------exquisite segment line-----------------");
       // System.out.println(m3.getExceptionTypes());
        Class[] c3 = m3.getExceptionTypes();
        for (Class c4 : c3) {

            System.out.println(c4.toString());

        }

        System.out.println(m3.getModifiers());


        Field f6 = c.getDeclaredField("balance");
        f6.setAccessible(true);
        System.out.println(f6.getModifiers());

        Annotation a = c.getAnnotation(classAnnotation.class);
        System.out.println(c.getGenericSuperclass());
        Method m4 = c.getDeclaredMethod("fakeFunc2", Integer.class);
        m4.setAccessible(true);
        m4.invoke(o, 666);
        System.out.println(m4.getModifiers());
        System.out.println(c.getGenericSuperclass());
        Field f7 = c.getDeclaredField("fakeGeneric");
        System.out.println(f7.getGenericType());

        //Person<Integer> p = new Person<>();
        //Class c5 = p.getClass();
        //Field f8 = c5.getDeclaredField("fakeGeneric");
/*        ParameterizedType pt1 = (ParameterizedType) f8.getGenericType();
        ParameterizedType[] pt2 = (ParameterizedType[]) pt1.getActualTypeArguments();
        for (ParameterizedType pt3 : pt2) {

            System.out.println(pt3.toString());

        }*/

        System.out.println(c.getPackage());

        Constructor[] c9 = c.getConstructors();
        for (Constructor con : c9) {

            System.out.println(con.toString());

        }

        Constructor[] c10 = c.getDeclaredConstructors();
        for (Constructor con : c10) {

            System.out.println(con.toString());

        }

        Class c11 = Class.forName("反射.Person");
        Constructor c12 = c11.getConstructor(int.class);
        Person p1 = (Person) c12.newInstance(666);
        Field f9 = p1.getClass().getField("age");
        System.out.println(f9.get(p1));

        Class c13 = Class.forName("反射.Person");
        Constructor c14 = c13.getDeclaredConstructor(String.class);
        c14.setAccessible(true);
        Person p2 = (Person) c14.newInstance("heihei");
        Field f10 = p2.getClass().getDeclaredField("fakeStr");
        f10.setAccessible(true);
        System.out.println(f10.get(p2));



    }


}
