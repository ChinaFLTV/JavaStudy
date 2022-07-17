package 面向对象_中;


public class inheritance {

    public static void main(String[] args) {

        Student s = new Student("Taylor Swift", 'w', 36, 90, 100, 60, 2021300729);
        System.out.println(s.toString());

        System.out.println("------------------exquisite segment line------------------");

        Kids k = new Kids();
        k.sex = 0;
        k.salary = 0;
        k.manOrWoman();
        k.employeed();
        k.yearsOld = 8;
        k.printAge();
        k.employeed();

        System.out.println("----------------exquisite segment line------------------");

        Cylinder c = new Cylinder(6.6, 6.666666);
        System.out.println("This cylinder's basal area is: "+c.findArea()+"\tAnd its volume is: "+c.findVolume());



    }


}

class Person {

    public String name;
    public char sex;
    public int age;

}

class Student extends Person {

    public long number;
    public int math;
    public int English;
    public int computer;

    public Student() {

        ;

    }

    public Student(String name, char sex, int age) {

        this();
        this.name = name;
        this.sex = sex;
        this.age = age;

    }

    public Student(String name, char sex, int age, int math, int English, int computer, long number) {

        this(name, sex, age);
        this.number = number;
        this.math = math;
        this.English = English;
        this.computer = computer;

    }

    public double average() {

        return (math + English + computer) / 3;

    }

    public int max() {

        return ((((math > English) ? math : English) > computer) ? ((math > English) ? math : English) : computer);

    }

    public int min() {

        return ((((math < English) ? math : English) < computer) ? ((math < English) ? math : English) : computer);

    }

    public String toString() {

        return "The math's score is: " + this.math + "\t\tThe English's score is: " + this.English + "\t\tThe computer's score is: " + this.computer
                + "\nThe maxScore is: " + max() + "\t\tThe minScore is: " + min() + "\t\tThe averageScore is: " + average();

    }


}

class ManKind {

    public int sex;
    public int salary;

    public void manOrWoman() {

        if (this.sex == 1) {

            System.out.println("This person is a man.");

        } else {

            System.out.println("This person is a woman.");

        }

    }

    public void employeed() {

        if (salary <= 0) {

            System.out.println("This person has no job");

        } else {

            System.out.println("This person has jobs.");

        }

    }


}


class Kids extends ManKind {

    public int yearsOld;

    public void printAge() {

        System.out.println("This child's age is: " + this.yearsOld);

    }

    public void employeed(){

        System.out.println("Subclass' method was invoked: Kids should study and no job.");

    }


}

class Circle {

    private double radius;

    public void setRadius(double radius) {

        this.radius = radius;

    }

    public double getRadius() {

        return this.radius;

    }

    public double findArea() {

        return Math.PI * Math.pow(this.radius, 2);

    }


}

class Cylinder extends Circle {

    private double length;

    public Cylinder() {

        ;

    }

    public Cylinder(double radius, double length) {

        this();
        setRadius(radius);
        this.length = length;

    }

    public void setLength(double length) {

        this.length = length;

    }

    public double getLength() {

        return this.length;

    }

    public double findArea(){

        return super.findArea()*+2*Math.PI*super.getRadius()+this.length;

    }

    public double findVolume() {

        return super.findArea() * this.length;

    }


}