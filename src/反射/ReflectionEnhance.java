package 反射;

import java.lang.reflect.*;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/6 上午 8:41
 * *@Description This is a description of ReflectionEnhance
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class ReflectionEnhance {

    public static void main(String[] args) {

        Person target = new Person();
        Person proxy = (Person)MyProxyFactory2.getProxy(target);
        proxy.walk();

    }


}

class MyInvocationHandler2 implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {

        this.target = target;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InstantiationException, InvocationTargetException, IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {

        Person p = new Person();
        p.walk();

        Object result = method.invoke(target, args);

        p.walk();
        Class c = Class.forName("反射.Person");
        Constructor c1 = c.getDeclaredConstructor(int.class);
        Person p1 = (Person) c1.newInstance(666);
        Method m = p1.getClass().getDeclaredMethod("eat");
        m.setAccessible(true);
        System.out.println(m.getModifiers());
        System.out.println(m.getParameterTypes());
        System.out.println(m.getReturnType());

        m.invoke(p1);


        return result;

    }


}

class MyProxyFactory2 {

    public static Object getProxy(Object target) {

        MyInvocationHandler mi = new MyInvocationHandler();
        mi.setTarget(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), mi);

    }


}

