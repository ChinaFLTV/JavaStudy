package 面向对象_中;


/*5.2 方法的重写(override/overwrite)
        定义：在子类中可以根据需要对从父类中继承来的方法进行改造，也称
        为方法的重置、覆盖。在程序执行时，子类的方法将覆盖父类的方法。
        要求：
        1. 子类重写的方法必须和父类被重写的方法具有相同的方法名称、参数列表
        2. 子类重写的方法的返回值类型不能大于父类被重写的方法的返回值类型
        3. 子类重写的方法使用的访问权限不能小于父类被重写的方法的访问权限
        子类不能重写父类中声明为private权限的方法
        4. 子类方法抛出的异常不能大于父类被重写方法的异常
         注意：
        子类与父类中同名同参数的方法必须同时声明为非static的(即为重写)，或者同时声明为
        static的（不是重写）。因为static方法是属于类的，子类无法覆盖父类的方法。*/
public class override__overwrite {

    public static void main(String[] args) {

        Student_1 s_1 = new Student_1("Micheal Jackson", 40, "Harvard University");
        System.out.println(s_1.getInfo());
        Person_1 p_1 = new Person_1();
        p_1.name = "Britney Spears";
        p_1.age = 36;
        System.out.println(p_1.getInfo());

        System.out.println("------------exquisite segment line------------");

        Parent p = new Parent();
        //p.fm_1();
        p.fm_2();
        p.fm_3();
        p.fm_4();

        System.out.println("---------------exquisite segment line---------------");

        int i;
        Parent p_2 = new Parent();
        i = p_2.f_2;
        i = p_2.f_3;
        i = p_2.f_4;
        p_2.fm_2();
        p_2.fm_3();
        p_2.fm_4();

        Child c = new Child();
        //i = c.f_1;
        i = c.f_2;
        i = c.f_3;
        i = c.f_4;
        //i = c.c_1;
        i = c.c_2;
        //c.cm_1();
        c.cm_2();




    }


}

class Person_1 {

    public String name;
    public int age;

    public String getInfo() {

        return "Superclass' method was invoked: " + "\tName: " + this.name + "\tAge: " + this.age;

    }


}


class Student_1 extends Person_1 {

    public String school;
    //public int age;

    public Student_1() {

        ;

    }

    public Student_1(String name) {

        this.name = name;

    }

    public Student_1(String name, int age) {

        this(name);
        this.age = age;

    }

    public Student_1(String name, int age, String school) {

        this(name, age);
        this.school = school;

    }


    public String getInfo() {

        return "Subclass' method wes invoked: " + "\tName: " + this.name + "\tAge: " + this.age + "\tSchool: " + this.school;

    }


}


class Parent {

    private int f_1 = 1;
    int f_2 = 2;
    protected int f_3 = 3;
    public int f_4 = 4;

    public Parent() {

        ;

    }

    private void fm_1() {

        System.out.println("The private member variable is: " + this.f_1);


    }

    void fm_2() {

        System.out.println("The default member variable is: " + this.f_2);

    }

    protected void fm_3() {

        System.out.println("The protected member variable is: " + this.f_3);

    }

    public void fm_4() {

        System.out.println("The public member varible is: " + this.f_4);

    }


}

class Child extends Parent {

    private int c_1 = 21;
    public int c_2 = 22;

    private void cm_1() {

        System.out.println("In cm_1(): c_1 = " + this.c_1);

    }

    public void cm_2() {

        System.out.println("In cm_2(): c_2= " + this.c_2);

    }


}