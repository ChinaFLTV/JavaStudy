package 面向对象;


/*4.9 关键字—this
        this是什么？
         在Java中，this关键字比较难理解，它的作用和其词义很接近。
         它在方法内部使用，即这个方法所属对象的引用；
         它在构造器内部使用，表示该构造器正在初始化的对象。
         this 可以调用类的属性、方法和构造器
         什么时候使用this关键字呢？
         当在方法内需要用到调用该方法的对象时，就用this。
        具体的：我们可以用this来区分属性和局部变量。
        比如：this.name = name;

        4.9 关键字—this
注意：
 可以在类的构造器中使用"this(形参列表)"的方式，调用本类中重载的其
他的构造器！
 明确：构造器中不能通过"this(形参列表)"的方式调用自身构造器
 如果一个类中声明了n个构造器，则最多有 n - 1个构造器中使用了
"this(形参列表)"
 "this(形参列表)"必须声明在类的构造器的首行！
 在类的一个构造器中，最多只能声明一个"this(形参列表)"
        */
public class This {

    public static void main(String[] args) {

        Person_4 p = new Person_4("Taylor Swift");
        Person_4 p_1 = new Person_4("Alan Walker");

        p.getInfo();
        p_1.getInfo();
        System.out.println("Is Taylor Swift the same person as AlanWalker ? And " + p.compare(p_1) + " is show not yet.");

        System.out.println("------------------exquisite segment line-------------------");

        Person_5 pe = new Person_5("Martoon 5", 36);
        pe.getInfo();


    }


}

class Person_3 {

    private String name;
    private int age;

    public static void invoke(){
        ;
    }

    public Person_3() {

        ;

    }

    public Person_3(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public void getInfo() {

        System.out.println("Name: " + this.name);
        this.speak();

    }

    public void speak() {

        System.out.println("Age: " + this.age);

    }


}

class Person_4 {

    public String name;

    public Person_4() {

        ;

    }

    public Person_4(String name) {

        this.name = name;

    }

    public void getInfo() {

        System.out.println("Person类-> " + this.name);

    }

    public boolean compare(Person_4 p) {

        return this.name == p.name;

    }

}

class Person_5 {

    private String name;
    private int age;

    public Person_5() {

        System.out.println("Instantiate the new object.");

    }

    public Person_5(String name) {

        this();
        this.name = name;


    }

    public Person_5(String name, int age) {

        this(name);
        this.age = age;

    }

    public void getInfo() {

        System.out.print("Name: " + name + ",age: " + age + " .");

    }


}