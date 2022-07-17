package 反射;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.*;
import java.lang.reflect.Field;


/**
 * *@Author LiGuanda
 * *@Data 2022/4/4 上午 9:37
 * *@Description This is a description of ReflectionReview
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class ReflectionReview {


    public static void main(String[] args) throws IOException {

        try {

            Class c = Class.forName("网络编程.SocketPractice4");
            System.out.println(c);
            System.out.println(c.getField("fakeAge"));
            System.out.println(c.getMethod("Server1"));
            System.out.println(c.getClassLoader());
            Class c1 = Class.forName("网络编程.SocketPractice4");
            Object o = c1.newInstance();

            Field f = c1.getField("fakeAge");
            f.set(o, 18);
            Field f1 = c1.getField("fakeName");
            f1.set(o, "Taylor Swift");

            //Field[] f3 = c1.getDeclaredField();
            System.out.println(c1.getSuperclass());

            Class c3 = Class.forName("反射.Person");
            Object o1 = c3.newInstance();

            Field f4 = c3.getField("name");
            f4.set(o1, "Alan Walker");
            Field f5 = c3.getField("age");
            f5.set(o1, 18);
            Field f6 = c3.getField("number");
            f6.set(o1, 123456L);
            System.out.println(o1);

            Class c5 = String.class;
            System.out.println(c5);
            Class c6 = Class.forName("java.lang.String");
            System.out.println(c6);
            Class c7 = "www.atguigu.com".getClass();
            System.out.println(c7);

            ClassLoader cl = new ReflectionReview().getClass().getClassLoader();
            System.out.println(cl);
            ClassLoader cl1 = String.class.getClassLoader();

            //Class c8 = cl1.loadClass("java.lang.String");
            //System.out.println(c8);

            char[] c9 = new char[10];
            Class c10 = c9.getClass();
            System.out.println(c10);

            int[] i = new int[666];
            Class c11 = i.getClass();
            System.out.println(c11);

            double[] d = new double[111];
            Class c12 = d.getClass();
            System.out.println(c12);




/*            System.out.println(e.red.getClass());
            System.out.println(e.values());
            System.out.println(e.valueOf("red"));
            System.out.println(e.red.ordinal());
            System.out.println(e.green.ordinal());
            System.out.println(e.yellow.ordinal());
            for (e h : e.values()) {

                System.out.println(h);

            }*/
            Class c13 = void.class;
            System.out.println(c13);
            Class c14 = int.class;
            System.out.println(c14);
            Class c15 = Class.class;
            System.out.println(c15);
            Class c16 = classAnnotation.class;
            System.out.println(c16);

            float[] f2 = new float[10];
            Class c17 = f2.getClass();
            System.out.println(c17);

            ClassLoader cl4 = ClassLoader.getSystemClassLoader();
            System.out.println(cl4);
            ClassLoader cl5 = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(cl5);
            ClassLoader cl6 = ClassLoader.getSystemClassLoader().getParent().getParent();
            System.out.println(cl6);
            ClassLoader cl7 = Class.forName("反射.ReflectionReview").getClassLoader();
            System.out.println(cl7);
            ClassLoader cl8 = Class.forName("java.lang.Object").getClassLoader();
            System.out.println(cl8);
            ClassLoader cl9 = Object.class.getClassLoader();
            System.out.println(cl9);
            ClassLoader cl10 = String.class.getClassLoader();
            System.out.println(cl10);
            InputStream in = Class.forName("反射.ReflectionReview").getClassLoader().getResourceAsStream("");



/*            class enumImpl{

                public static final enumImpl red = new enumImpl();
                public static final enumImpl green = new enumImpl();
                public static final enumImpl yellow = new enumImpl();

            }


            class enumImpl1{

                public static final enumImpl e1 = new enumImpl();
                public static final enumImpl e2 = new enumImpl();
                public static final enumImpl e3 = new enumImpl();

            }*/


        } catch (ClassNotFoundException cnfe) {

            cnfe.printStackTrace();
            cnfe.getLocalizedMessage();

        } catch (NoSuchFieldException nsfe) {

            nsfe.getLocalizedMessage();
            nsfe.getCause();

        } catch (NoSuchMethodException nsme) {

            nsme.printStackTrace();
            nsme.getSuppressed();

        } catch (InstantiationException ie) {

            ie.getStackTrace();
            ie.getCause();

        } catch (IllegalAccessException iae) {

            iae.fillInStackTrace();
            iae.getCause();

        }


    }


}


enum e {

    green,
    red,
    yellow;

}



@classAnnotation
class Person<T>implements hehe {

    public String name;
    public int age;
    public long number;
    public static final int fakeInt = 666;
    public T fakeGeneric;
    private String fakeStr;

    private static double balance;


    public void walk() {

        System.out.println("WALK");

    }

    private int eat() {

        System.out.println("PRIVATE EAT");
        return 3;

    }

    private long fakeFunc(String str, double dou) throws IllegalAccessException, IOException, InstantiationException {

        System.out.println("The function named fakeFunc was invoked!");
        long l = 666l;
        return l;

    }

    private <T extends Integer> T fakeFunc2(T t) {

        T tt = t;
        System.out.println(t);
        return tt;

    }


    @Override
    public String toString() {

        return "Name : " + this.name + "\nage : " + this.age + "\nnumber : " + this.number;

    }

    public Person() {

        ;

    }

    public Person(int age) {

        this.age = age;

    }

    private Person(String str) {

        this.fakeStr = str;

    }

}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface classAnnotation {

    ;

}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface heihei {

    ;

}


