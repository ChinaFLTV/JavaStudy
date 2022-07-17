package 反射;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/6 下午 9:30
 * *@Description This is a description of DynamicReflection
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class DynamicReflection {

    public static void main(String[] args) {

        Person p  =new Person();
        Person p1 = (Person)MyProxyFactory3.getProxy((p));
        p1.walk();

    }

}

class MyInvocationHandler3 implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {

        this.target = target;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException, InvocationTargetException {

        Object result = method.invoke(target, args);
        return result;

    }


}

class MyProxyFactory3 {

    public static Object getProxy(Object target) {

        MyInvocationHandler handler = new MyInvocationHandler();
        handler.setTarget(target);


        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);



    }

}


