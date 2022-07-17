package 面向对象_中;


import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.util.concurrent.ThreadLocalRandom;

public class invokeGrandparentMember {


    public static void main(String[] args) throws Throwable {

        TopStudent ts = new TopStudent();
        ts.method();
        System.out.println("--------------exquisite segment line----------------");

        Person_5 p = new TopStudent();
        p.method();
        p.method(1);


        /*Yiyang_Qianxi yyqx = new Yiyang_Qianxi();
        yyqx.walk();*/
        System.out.println("------------------exquisite segment line-----------------");

        Person_6 p_1 = new Person_6();
        Person_6 p_2 = new Student_6();
        Person_6 p_3 = new Graduate_1();

        System.out.println(p_1.getInfo());
        System.out.println(p_2.getInfo());
        System.out.println(p_3.getInfo());

        //Graduate_1 g = new Graduate_1();
        //System.out.println(g.judge());
        System.out.println("------------exquisite segment line--------------");

        System.out.println(p_1.getClass());
        System.out.println(p_2.getClass());
        System.out.println(p_3.getClass());

        System.out.println(Graduate_1.class);
        System.out.println(Student_6.class);
        System.out.println(Person_6.class);

        System.out.println(Class.forName("java.util.Date"));
        System.out.println(Class.forName("面向对象_中.Student_6"));
        System.out.println(Class.forName("面向对象_中.Graduate_1"));
        System.out.println("----------------exquisite segment line----------------");

        Person_5 p_4 = new Person_5();
        Person_5 p_5 = new Student_5();
        Person_5 p_6 = new TopStudent();

        p_4.method();
        p_5.method();
        p_6.method();

        System.out.println("-------------exquisite segment line----------------");

        System.out.println(Student_6.class.getClass());
        System.out.println(Graduate.class.getClass());
        System.out.println(p_5.getClass());
        System.out.println(p_4.getClass());
        System.out.println(p_6.getClass());


    }

}


class Person_5 {

    public String name = "Grandparentclass.name";

    public void method() throws Throwable {

        //System.out.println("Grandparentclass'method was invoked: name: " + this.name);
        System.out.println("a " + Person_5.class.getName());

    }

    public void method(int fakeIndex) {

        System.out.println("GrandParentclass'method overloadded by a integer parameter was invoked:.");

    }

}

class Student_5 extends Person_5 {

    public String name = "Parentclass.name";

    public void method() throws Throwable {

        //System.out.println("Parentclass'method was invoked: name: " + this.name);
        System.out.println("a " + Student_5.class.getName() + "\na " + Student_5.class.getSuperclass().getName());

    }

}

class TopStudent extends Student_5 {

    public String name = "Subclass.name";

    public void method() throws Throwable {

        //Husband h = new Husband();

        //System.out.println("Subclass'method was invoked: name: " + this.name);

       /*
        MethodType mt = MethodType.methodType(void.class);
        Field f = MethodHandles.Lookup.class.getDeclaredField("IMPL_LOOKUP");
        f.setAccessible(true);
        MethodHandles.Lookup lp = (MethodHandles.Lookup)f.get(null);
        MethodHandle mh = lp.findSpecial(Person_5.class,"method",mt,Person_5.class);
        mh.invoke(this);
*/

        System.out.println("a " + Graduate.class.getName() + "\na " + Student_5.class.getSuperclass().getName() + "\na " + Graduate.class.getSuperclass().getName() + "\na " + Graduate.class.getSuperclass().getSuperclass().getName());

    }

    public void method(int fakeIndex) {

        System.out.println("Subclass'method overloadded by integer parameter was invoked:.");

    }

}

/*class Husband {
    ;
}*/
/*
class Yiyang_Qianxi {

    public void walk() throws InterruptedException {
        for (long i = 250250250; i >= 0; i--) {
            Thread.sleep(1000);

            System.out.println("尊敬的易烊千玺先生将在 " + i + " h 时候到达你宿舍");
        }
    }
}*/


class Person_6 {

    protected String name = "Person_5";
    protected int age = 50;

    public String getInfo() {

        return "Name: " + this.name + "\n" + "age: " + this.age;

    }

}

class Student_6 extends Person_6 {

    protected String school = "Harvard University";

    public String getInfo() {

        return "name: " + name + "\nage: " + age + "\nschool: " + this.school;
    }

}

class Graduate_1 extends Student_6 {

    public String major = "IT";

    public String getInfo() {

        return "name: " + name + "\nage: " + age + "\nschool: " + school + "\nmajor: " + major;

    }

    /*public boolean judge() {

        return this.school == super.school;

    }*/


}
