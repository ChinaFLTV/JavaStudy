package 反射;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//import static sun.net.www.protocol.http.AuthCacheValue.Type.Proxy;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/5 上午 11:09
 * *@Description This is a description of DynamicProxy
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class DynamicProxy {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = (Person)MyProxyFactory.getProxy(p1);
        p2.walk();


    }

}

class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {

        this.target = target;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IOException, IllegalAccessException, InvocationTargetException {

        Person p = new Person();
        p.walk();

        Object result = method.invoke(target, args);
        return result;

    }


}

class MyProxyFactory {

    public static Object getProxy(Object target) {

        MyInvocationHandler handler = new MyInvocationHandler();
        handler.setTarget(target);
        return java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);


    }


}

class MyInvocationHandler1 implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {

        this.target = target;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {

        Person p = new Person();
        p.walk();
        Object result = null;

        try {

           result = method.invoke(target, args);

        }catch(Exception ioe){

            ioe.printStackTrace();
            ioe.getLocalizedMessage();

        }finally {

            return result;

        }

    }


}

class MyProxyFactory1{

    public static Object getProxy(Object target){

        MyInvocationHandler handler = new MyInvocationHandler();
        handler.setTarget(target);

        return java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);

    }

}
