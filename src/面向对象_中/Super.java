package 面向对象_中;


import java.util.Date;

public class Super {

    public static void main(String[] args) {

        Student_2 s_2 = new Student_2();
        System.out.println(s_2.getInfo());


    }


}

class Person_2 {

    protected String name = "Britney Spears";
    protected int age = 36;

    public String getInfo() {

        return "The superclass' method wes invoked: " + "\tName: " + this.name + "\tAge: " + this.age;

    }


}

class Student_2 extends Person_2 {

    protected String name = "Small Britney Spears";
    private String school = "Haward University";

    public String getSchool() {

        return school;

    }

    public String getInfo() {

        return "Subclass' method was invoked: " + super.getInfo() + "\tSchool: " + this.school;

    }


}

class Person_3 {

    private String name;
    private int age;
    private Date birthDate;


    public Person_3() {

        ;

    }

    public Person_3(String name, int age, Date d) {

        this.name = name;
        this.age = age;
        this.birthDate = d;


    }

    public Person_3(String name, int age) {

        this(name, age, null);

    }

    public Person_3(String name, Date d) {

        this(name, 30, d);

    }

    public Person_3(String name) {

        this(name, 30);

    }

}

class Student_3 extends Person_3 {

    private String school;

    public Student_3() {

        ;

    }

    public Student_3(String name, int age, String s) {

        super(name, age);
        this.school = s;

    }

    public Student_3(String name, String s) {

        super(name);
        this.school = s;

    }

    public Student_3(String s) {

        super();
        this.school = s;

    }


}










