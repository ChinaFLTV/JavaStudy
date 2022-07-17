package 面向对象_下;


import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Static {

    public static void main(String[] args) {

        Circle c_1 = new Circle(1.0);
        Circle c_2 = new Circle(2.0);
        c_1.display();
        c_2.display();

        System.out.println("---------------exquisite srgment line---------------");

        Person p = new Person();
        Person.total = 100;

       /* Account.class.getName();

        Account a = new Account();

        for (int k = 0; k < 3; k++) {

            //accountArray[k].toString();
        }*/

        Account.initialize();


    }/**/

}

class Circle {

    private static double radius;
    public static String name = "This is a circle.";

    public Circle() {

        ;

    }

    public Circle(double Radius) {

        this();
        radius = Radius;

    }

    public static String getName() {

        return name;

    }

    public double findArea() {

        return Math.PI * Math.pow(radius, 2);

    }

    public void display() {

        System.out.println("This circle's radius is: " + radius + "\t\tname: " + name);

    }


}

class Person {

    private int id;
    public static int total = 0;

    public Person() {

        Person.total++;
        this.id = total;

    }

    public static void main(int fakeIndex) {

        //this.id = fakeIndex;

    }


}


class Account {

    public long account;
    private String password;
    private double balance;

    public static double interestRate;
    public static double leastBalance;

    public Account() {

        ;

    }

    public Account(long account, String password) {

        this();
        this.account = account;
        this.password = password;
        this.balance = 0;

    }

    public static void initialize() {

        Account[] accountArray = new Account[3];


        for (int i = 0; i < 3; i++) {
            String password = String.valueOf(1111 + i);
            byte[] password_1 = password.getBytes();
            System.out.println(new String(accountArray[i].encrypt(password_1)));

            //accountArray[i] = new Account((long) (ThreadLocalRandom.current().nextDouble() * 1000000000), accountArray[i].encrypt(password_1));


            //String password = String.valueOf(1111 + i);
            //byte[] password_1 = password.getBytes();

            //accountArray[i].encrypt(password_1);
            //accountArray[i].setPassword(accountArray[i].encrypt(password_1));


        }

        for (int k = 0; k < 3; k++) {

            System.out.println(accountArray[k].toString());

        }

    }

    public void setPassword(String password) {

        this.password = password;

    }

    public void withdraw(long money) {

        if (money > 0) {

            this.balance += money;

        } else {

            System.out.println("What you inputted was wrong.");

        }


    }

    public void deposit(long money) {

        if (this.balance - money >= 0) {

            this.balance -= money;

        } else {

            System.out.println("What you inputted was wrong.");

        }


    }

    public String getPassword() {

        return this.password;

    }


    public byte[] decrypt(String password) throws IOException {

        return (new BASE64Decoder()).decodeBuffer(password);

    }

    public String encrypt(byte[] password) {

        return (new BASE64Encoder()).encodeBuffer(password);

    }

    public String toString() {

        return "Account: " + this.account + "\n" + "Password: " + this.password + "\n" + "Balancce: " + this.balance;

    }


}