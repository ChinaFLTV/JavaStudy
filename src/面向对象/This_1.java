package 面向对象;

import static 面向对象.Person_3.*;
import java.util.*;
import java.lang.*;
import java.net.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import java.awt.*;
class Boy {

    public String name;
    public int age;

    public void setName(String name) {

        this.name = name;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public String getName() {

        return name;

    }

    public int getAge() {

        return age;

    }

    public void marry(Girl girl) {

        System.out.println("A harmonious union lasting a hundred years!");

    }

    public void shout() {

        System.out.println("Dear landlady,why is there no water again?");

    }

    public Boy() {

        System.out.println("Instantiate a new object.");

    }

    public Boy(String name) {

        this();
        this.name = name;

    }

    public Boy(String name, int age) {

        this(name);
        this.age = age;

    }


}

class Girl {

    public String name;
    public int age;

    public void setName(String name) {

        this.name = name;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public String getName() {

        return name;

    }

    public int getAge() {

        return age;

    }

    public void marry(Boy boy) {

        System.out.println("A lot happiness!");

    }

    public boolean compare(Girl girl) {

        return (this.name == girl.name) && (this.age == girl.age);


    }

    public Girl() {

        System.out.println("Instantiate a new object.");

    }

    public Girl(int age) {

        this();
        this.age = age;

    }

    public Girl(String name, int age) {

        this(age);
        this.name = name;

    }


}


public class This_1 {

    public static void main(String[] args) {

        Boy boy = new Boy("Xiaochun Chen", 40);
        Girl girl = new Girl("Caier Ying", 37);
        Girl girl_1 = new Girl("Jingyi Ju",27);
        boy.marry(girl);
        boy.shout();

        girl.marry(boy);
        System.out.println("Are they the same person? A: "+girl.compare(girl_1));



    }


}
