package 面向对象_下;


public class Abstract {

    public static void main(String[] args) {

        E e = new F();
        e.m_1();
        e.m_2();

        //RiverBarge rb = new RiverBarge();

        CommonEmployee.downLead();


    }
}

abstract class E {

    abstract void m_1();

    public void m_2() {

        System.out.println("The method which was defined in class E was invoked.");

    }

}

class F extends E {

    public void m_1() {

        System.out.println("The method which was overwritten in class F was invoked.");

    }

}

abstract class G {
    public String name;

    public G() {

        ;

    }

}


abstract class Vehicle {

    public abstract double calculateFuelEfficiency();

    public abstract double calculateTripDistance();

}

class Truck extends Vehicle {

    public double calculateFuelEfficiency() {

        return 6.666;

    }

    public double calculateTripDistance() {

        return 8.888;

    }


}

class RiverBarge extends Vehicle {

    public double calculateFuelEfficiency() {

        return 6;

    }

    public double calculateTripDistance() {

        return 8;

    }
}

/*

abstract final class test{

}*/
abstract class Employee {

    public String name;
    public long id;
    public double salary;

    public Employee() {

        ;

    }

    public Employee(String name) {

        this.name = name;

    }

    public Employee(String name, long ID) {

        this(name);
        this.id = ID;

    }

    public Employee(String name, long ID, double salary) {

        this(name, ID);
        this.salary = salary;

    }

    abstract public void work();

    {

        ;

    }

    static {

        ;

    }


}

class Manager extends Employee {

    private static double bonus;
    {

        ;

    }


    static{

        bonus = 10000;

    }


    public Manager(String name, long ID, double salary) {

        super(name, ID, salary);
        Manager.bonus = bonus;

    }

    public void work() {

        System.out.println("Manager is working.");

    }

    public String getName() {

        return super.name;

    }

    public long getID() {

        return super.id;

    }

    public double getSalary(){

        return super.salary;

    }

    public double getBonus(){

        return Manager.bonus;

    }


}
class CommonEmployee extends Employee{

    //public double salary ;

    private double bonus;
    {

        this.bonus = 66666;

    }

    private CommonEmployee(String name,long ID,double salary){

        super(name,ID,salary);

    }




    static{

        CommonEmployee ce = new CommonEmployee("Dage",123456789,66666.66);
        System.out.println(ce.getName());
        System.out.println(ce.getID());
        System.out.println(ce.getSalary());
        System.out.println(ce.getBonus());


    }



    public void work(){

        System.out.println("CommonEmployee is working.");

    }

    public String getName(){

        return super.name;

    }

    public long getID(){

        return super.id;

    }

    public double getSalary(){

        return super.salary;

    }

    public double getBonus(){

        return this.bonus;

    }

    public static void downLead(){

        ;

    }

}


