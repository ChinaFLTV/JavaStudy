package 面向对象;


import static jdk.nashorn.internal.objects.Global.println;

public class classAndObject {

    public static void main(String[] args) {

        Animal xb = new Animal();
        Animal xh = new Animal();
        xb.legs = 4;
        xh.legs = 0;
        System.out.println(xb.legs);
        System.out.println(xh.legs);
        xb.legs = 2;
        System.out.println(xb.legs);
        System.out.println(xh.legs);


        xb.eat();
        xh.eat();
        xb.move();
        xh.eat();



        Student stu = new Student("李华",18,"计算机科学与技术","打乒乓球");
        Teacher tea = new Teacher("金城武",27,5,"唱歌");

        stu.say();
        tea.say();

        Person_1 pe = new Person_1("Dage",20,1);
        pe.showAge();
        pe.addAge();



    }


}

class Student {

    public String name;
    public int age;
    public String major;
    public String interests;

    public Student() {
        ;
    }

    public Student(String na, int ag, String ma, String in) {

        name = na;
        age = ag;
        major = ma;
        interests = in;

    }

    public void say() {

        System.out.println( "该名童鞋的个人信息是：姓名：" + name + " 年龄：" + age + " 专业：" + major + " 兴趣爱好：" + interests);

    }


}

class Person_1{

    public String name;
    public int age;
    public int sex;

    public Person_1(){

        ;

    }


    public Person_1(String name,int age,int sex){

        this.name = name;
        this.age = age;
        this.sex = sex;

    }

    public void study(){

        System.out.println("Studying");

    }

    public void showAge(){

        System.out.println(age);

    }

    public void addAge(){

        this.age+=2;
        System.out.println(age);

    }





}




class Teacher {

    private String name;
    public int age;
    public int teacherAge;
    public String course;

    public Teacher() {
        ;
    }

    public Teacher(String na, int ag, int te, String co) {

        name = na;
        age = ag;
        teacherAge = te;
        course = co;

    }

    public void say() {

        System.out.println( "该名老师的个人信息是：姓名： " + name + " 年龄： " + age + " 教龄： " + teacherAge + " 所在学科： " + course);


    }


}


class Person {

    String name;
    int age;
    boolean isMarried;

    public Person() {
    }



    public Person(String n, int ag, boolean im) {

        name = n;
        age = ag;
        isMarried = im;

    }

    public void walk() {

        System.out.println("人走路...");

    }


    public String display() {

        return "名字是：" + name + "，婚姻状态：" + isMarried;

    }

    {

        name = "LiGuanda";
        age = 20;
        isMarried = false;


    }

    class Pet {

        String name;
        float weight;

    }


}

class Animal {

    public int legs;

    public void eat() {

        System.out.println("Eating:");

    }

    public void move() {

        System.out.println("Move: ");


    }


}
