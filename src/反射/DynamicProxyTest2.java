package 反射;


import java.io.File;
import java.io.IOException;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/7 上午 8:48
 * *@Description This is a description of DynamicProxyTest2
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class DynamicProxyTest2 {

    public static void main(String[] args) throws IOException,ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        youGuess a = new Animal();
        youGuess b = (youGuess) MyProxyFactory4.getProxy(a);
        b.run();

        Class c = Class.forName("反射.Student");
        Constructor c1 = c.getConstructor();
        Student s = (Student) c1.newInstance();
        Constructor c2 = c.getDeclaredConstructor(String.class, int.class);
        Student s1 = (Student) c2.newInstance("Taylor Swift", 33);

        Class c3 = Class.forName("反射.MyText");
        Method m = c3.getDeclaredMethod("myCreate");
        MyText mt = (MyText) c3.newInstance();
        m.invoke(mt);
        System.out.println("-------------------exquisite segment line------------------");
        Class c4 = Class.forName("反射.Student1");
        Student1 s2 = (Student1) c4.newInstance();
        Method m2 = c4.getDeclaredMethod("toString");
        Field f = c4.getDeclaredField("name");
        Field f1 = c4.getDeclaredField("age");
        f.set(s2, "Taylor Swift");
        f1.set(s2, 33);
        System.out.println(m2.invoke(s2));

        Class c5 = Class.forName("反射.PrivateTest");
        PrivateTest pt = (PrivateTest) c5.newInstance();
        Field f3 = c5.getDeclaredField("name");
        f3.setAccessible(true);
        f3.set(pt, "Taylor Swift");
        Method m1 = c5.getDeclaredMethod("getName");
        m1.setAccessible(true);
        System.out.println(m1.invoke(pt));

        System.out.println("------------------exquisite segment line-----------------");

        Class c6 = Class.forName("java.io.File");
        Annotation[] a3 = c6.getDeclaredAnnotations();
        for (Annotation a4 : a3) {

            System.out.println(a4);

        }

        Constructor[] c7 = c6.getDeclaredConstructors();
        for (Constructor c8 : c7) {

            System.out.println(c8);

        }

        Constructor c9 = c6.getDeclaredConstructor(String.class);
        File f5 = (File)c9.newInstance("D:\\mynew.txt");
        if(!f5.exists()){

            f5.createNewFile();

        }


    }


}

class MyInvocationHandler4 implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {

        this.target = target;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException, InvocationTargetException {

        return method.invoke(target, args);

    }


}


class MyProxyFactory4 {

    public static Object getProxy(Object target) {

        MyInvocationHandler4 handler = new MyInvocationHandler4();
        handler.setTarget(target);

        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);

    }

}


class Animal implements youGuess {

    @Override
    public void run() {

        System.out.println("RUNNING MAN!");

    }

}


class Student {

    public String name;
    public int age;

    public Student() {

        System.out.println("the constructor with no parameter was invoked!");

    }

    public Student(String name, int age) {

        this();
        this.name = name;
        this.age = age;
        System.out.println("The constructor with two parameters was invoked!");

    }

}

class MyText {

    public void myCreate() throws IOException {

        Path p = Paths.get("C:\\Users\\Lenovo\\Desktop\\heihei.txt");

        if (Files.notExists(p)) {

            Files.createFile(p);
            System.out.println("The file had been created successfully!");

        }

    }

}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface heihei1Array {

    heihei1[] value();

}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Repeatable(heihei1Array.class)
@interface heihei1 {


}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface hahaArray {

    haha[] value();

}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Repeatable(hahaArray.class)
@interface haha {

    ;

}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface hetui {

    ;

}

@heihei1
@haha
class Student1 {

    @hetui
    public String name;
    @hetui
    public int age;


    @Override
    public String toString() {
        try {

            Class c = Class.forName("反射.Student1");
            Annotation[] a = c.getDeclaredAnnotations();
            for (Annotation b : a) {

                System.out.println(b);

            }


        } catch (ClassNotFoundException cnfe) {

            cnfe.printStackTrace();
            cnfe.getLocalizedMessage();

        } finally {


            return "name : " + this.name + "\nage : " + this.age + "\nAnnotations : ";

        }

    }


}


class PrivateTest {

    private String name;

    private String getName() {

        return this.name;

    }

}




