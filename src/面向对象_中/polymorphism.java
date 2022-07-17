package 面向对象_中;


import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;

import static sun.awt.image.PixelConverter.UshortGray.instance;

public class polymorphism {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        Actor a = new Singer("dance");
        //a.getInformation();
        System.out.println(a.age);
        a.getInformation(0);
        //System.out.println(a.merit);
        //a.subClassNewMethod();
        Actor aa = new Singer.Dancer();
        a.overloadTest(aa);
        System.out.println(aa instanceof Singer.Dancer);
        System.out.println(aa instanceof Singer);
        System.out.println(aa instanceof Actor);

        System.out.println("------------exquisite segment line-----------");

        double d = 13.4;
        long l = (long) d;
        System.out.println(l);
        int in = 5;
        Object o = "Hello";
        String objstr = (String) o;
        System.out.println(objstr);
        Object objPri = new Integer(5);
        //String str = (String) objPri;

        System.out.println("---------------exquisite segment line--------------");

        Sub s = new Sub();
        System.out.println(s.count);
        s.display();

        Base b = s;
        System.out.println(b.count);
        b.display();

        System.out.println(b == s);
        System.out.println("------------exquisite segment line------------");

        System.out.println(((Person_4) (Graduate.class.getSuperclass().getSuperclass().newInstance())).name);
        System.out.println(((Person_4) (Graduate.class.getSuperclass().getSuperclass().newInstance())).age);
        System.out.println(((Person_4) (Graduate.class.getSuperclass().getSuperclass().newInstance())).getInfo());
        Person_4 p = new Graduate();
        System.out.println(p.getInfo());
        System.out.println("-------------exquisite segment line-------------");

        Person_4 pp = new Graduate();
        pp.getInfo();

        try {
            MethodType mt = MethodType.methodType(String.class);
            Field lookupImpl = MethodHandles.Lookup.class.getDeclaredField("getInfo");
            lookupImpl.setAccessible(true);
            MethodHandles.Lookup lookup = (MethodHandles.Lookup)lookupImpl.get(null);
            MethodHandle mh = lookup.findSpecial(Person_4.class,"getInfo",mt,Person_4.class);
            mh.invoke(new polymorphism());


        } catch (Throwable c) {
            c.printStackTrace();
        }





    }

    public void ObjectTransition(Actor a) {

        //a.subClassNewMethod();

        if (a instanceof Singer) {

            Singer s = (Singer) a;
            s.subClassNewMethod();

        }


    }


}


class Actor {

    public String name;
    public int age;

    public Actor() {

        ;

    }

    public Actor(String name) {

        this();
        this.name = name;

    }

    public Actor(String name, int age) {

        this(name);
        this.age = age;

    }

    public void getInformation(int fakeIndex) {

        System.out.println("SuperClass's method was invoked: The actor's name is:　" + this.name + "\t\tand his or her age is:　" + this.age);

    }

    public void overloadTest(Actor actor) {

        System.out.println("Superclass'method overloaded by the parameter in Actor type was invoked.");

    }

    public void overloadTest(Singer.Dancer dancer) {

        System.out.println("Superclass'method overloaded by the parameter in Dancer type was invoked.");


    }


}

class Singer extends Actor {


    static class Dancer extends Actor {

        ;

    }

    public String merit;

    public Singer() {

        super("JuJingyi", 27);

    }

    public Singer(String merit) {

        this();
        this.merit = merit;

    }

  /*  public void getInformation(){

        System.out.println("SubClass'method was invoked: The singer'name is: "+super.name+"\t\tand heis or her age is: "+super.age+"\t\tAt length,his or her merit is: "+this.merit);

    }*/

    public void getInformation(int fakeIndex) {

        System.out.println("The subClass'method which overloads superclass' homonymic method was invoked.");

    }

    public void subClassNewMethod() {

        System.out.println("This is an exclusive subClass' method.");

    }

}

class Base {

    public int count = 0;

    public Base() {

        ;

    }

    public Base(int count) {

        this();
        this.count = count;

    }

    public void display() {

        System.out.println("Superclass'method was invoked: count: " + this.count);

    }

}

class Sub extends Base {

    public int count = 20;

    public Sub() {

        super();

    }


    public void dispaly() {

        System.out.println("Subclass' method was invoked: count: " + this.count);

    }

}

class Person_4 {

    protected String name = "Person_4";
    protected int age = 50;

    public Person_4() {

        ;

    }

    public String getInfo() {

        return "Superclass'method was invoked: name:　" + this.name + "\t\tage:　" + this.age;

    }

}

class Student_4 extends Person_4 {

    protected String school = "Harvard University";

    public Student_4() {

        super();

    }

    public String getInfo() {

        return "Subclass' method was invoked: name: " + super.name + "\t\tage: " + super.age + "\t\tschool: " + this.school;

    }

}


class Graduate extends Student_4 {

    public String major = "IT";

    public Graduate() {

        super();

    }

    public String getInfo() {

        return "Subclass'subclass'method was invoked: name:　" + Graduate.class.getSuperclass().getSuperclass() + "\t\t";
    }

    public String getInfo(int fakeIndex) throws Throwable {

        MethodType mt = MethodType.methodType(String.class);
        Field f = MethodHandles.Lookup.class.getDeclaredField("getInfo");
        f.setAccessible(true);
        MethodHandles.Lookup lookup = (MethodHandles.Lookup)f.get(null);
        MethodHandle mh = lookup.findSpecial(Person_4.class,"getInfo",mt,Person_4.class);
        mh.invoke(this);


        return "  ";

    }


}


