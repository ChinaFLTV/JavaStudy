package 面向对象_中;


public class ObjectInstantiation {

    public static void main(String[] args) {

        Pig p = new Pig();


        System.out.println("--------------exquisite segment line-------------");

        Cylinder_1 c = new Cylinder_1(6.666666);


    }


}

class Creature {

    public Creature() {

        System.out.println("Creature's constructor whitout any parameters was invoked.");


    }

}

class Animal extends Creature {

    public Animal() {

        //super();

    }

    public Animal(String name) {

        this();
        System.out.println("Aniaml's method with a parameter in String type: " + name);

    }

    public Animal(String name, int age) {

        this("Peppa Pig");
        System.out.println("Aniaml's constructor with two parameters in both String and int was invoked.");

    }


}


class Pig extends Animal {

    public Pig() {

        super("Peppa Pig", 8);

    }


}

class Circle_1 {

    private double radius;

    public Circle_1() {

        System.out.println("The circle's method with no parameters was invoked.");

    }

    public Circle_1(double radius) {

        this();
        this.radius = radius;

    }

    public double getRadius() {

        return this.radius;

    }

    public double getArea() {

        return Math.PI * Math.pow(this.radius, 2);

    }

}

class Cylinder_1 extends Circle_1 {

    private double height;

    public Cylinder_1() {

        super(6.666666);

    }

    public Cylinder_1(double height) {

        this();
        this.height = height;

    }

    public double getVolume() {

        return super.getArea() * height;

    }


}







