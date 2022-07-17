package 泛型;

import java.util.*;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/21 上午 8:30
 * *@Description This is a description of Generic
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class Generic <D>{

    public static void main(String[] args) {

        Map<String, Integer> m = new HashMap<String, Integer>();

        m.put("heihei", 0);
        m.put("hehe", 1);
        m.put("haha", 2);

        Set<Map.Entry<String, Integer>> s = m.entrySet();

        Iterator it = s.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());

        }


        Comparable c = new Date();
        //System.out.println(c.compareTo("red"));

        Comparable<Date> c1 = new Date();
        //System.out.println(c1.compareTo("Red"));


        ArrayList a = new ArrayList();
        a.add("hello");

        ArrayList<String> a1 = new ArrayList<>(a);

        for (String st : a1) {

            System.out.println(st);

        }
        test(a);
        test1(a);

        List<Integer> l2 = new ArrayList<>();

        //System.out.println(l2 instanceof List<Integer>);

        //List<Double>[] l3 = new List<Double>[5];

        List<Float> l3 = new ArrayList<>();

        System.out.println(l2.getClass() == l3.getClass());
        System.out.println(l2.getClass());
        System.out.println("----------------exquisite segment line----------------");

        new Generic().haha('a', 'b', 'c', 'd', 'e', 'f', 'g');

        new Generic().haha(4, 'a', 'b', 'c');

        //new Generic().test5(new Creature());
        new Generic().test5(new Person1());
        new Generic().test5(new Man());
        new Generic().test5(new Child());

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(0);
        a2.add(1);
        a2.add(3);

        LinkedList<String> l = new LinkedList<>();
        l.add("heihei");
        l.add("hehe");
        l.add("xixi");

        new Generic().printCollection(a2);
        //new Generic().printCollection1(a2);

        Person1[] p1 = null;
        Man[] m1 = null;
        p1 = m1;
        List<Person> l4 = null;
        List<Man> l5 = null;

        //l4 = l5;


        List<?> l6 = new ArrayList<Integer>();
        //l6.add(1);
        l6.add(null);
        //l6.add(new Object());

        List<? extends Person1> l7 = Arrays.asList(new Man(), new Child());


        List<? super Child> l8 = new ArrayList<Man>();
        //l8.add(new Man());

        ArrayList<?> a3 = new ArrayList<Double>();

        Son so = new Son();
        Person1 pe = new Person1();

        List<? super Child> l9= Arrays.asList(pe,so);

        Iterator it1 = l9.iterator();

        /*while(it1.hasNext()){

            ((Person1)(it1.next())).father();

        }*/

        System.out.println(l9.contains(l9.get(0)));
        System.out.println(l9.indexOf(so));
        System.out.println(l9.indexOf(pe));
        System.out.println(l9.contains(so));

        HashMap<String,ArrayList<Person1>> h = new HashMap<String,ArrayList<Person1>>();

        ArrayList<Person1> a4 = new ArrayList<Person1>();

        a4.add(new Person1());

        h.put("heihie",a4);

        Set<Map.Entry<String,ArrayList<Person1>>> s1 = h.entrySet();
        Iterator it2 = s1.iterator();
        while(it.hasNext()){

            ((Person1)(it.next())).father();

        }

        new Generic().test4(new Man());

        xixi(new Man());
        xixi(new Child());



    }


    public static <T extends Man> void xixi(T t){

        System.out.println(t.getClass());

    }

    public void addString(List<? extends Person1> l){

        //l.add(new Person1())

    }

    public void addStrings(List<? super Son> l){

        l.add(new Son());
        //l.add(new Father());

    }

    public <T> void test3(T t){

        T tt = t;


    }

    public static <T extends Child> void test6(){

        ;

    }


    public <D extends Person1>void test4(D d){


        ;

    }



    public void printCollection(Collection c) {

        Iterator it = c.iterator();
        while (it.hasNext()) {

            System.out.println(it.next());

        }

    }

    public void printCollection1(Collection<Object> c) {

        for (Object o : c) {

            System.out.println(o);

        }

    }

    public <H extends Person1> void test5(H hehe) {

        System.out.println(hehe);

    }


    public <T> T haha(T azhe, T... heihei) {

        ArrayList<T> a = new ArrayList<T>();
        a.add(azhe);
        for (int i = 0; i < heihei.length; i++) {

            a.add(heihei[i]);
            if (i == 1) {

                System.out.println(heihei[i] instanceof Character);

            }

        }

        for (T t : a) {

            System.out.print(t + " ");

        }
        return azhe;

    }


    public static void test(List<String> l) {

        System.out.println("String");

    }

    public static void test1(List<Integer> l1) {

        System.out.println("Integer");

    }

    public <T> void test2(T heihei) {

        T[] t = (T[]) (new Object[5]);
        T[] t1 = (T[]) new Integer[66];
    }

    /*public static <?> void hehe(ArrayList<?> xixi) {

        ;

    }*/


}

class Father<T1, T2> {

    public static <Y> void father() {

        System.out.println("father");

    }

    ;

}

class Son<T1> extends Father<T1, String> {

    public static void son() {

        System.out.println("son");

    }

    ;

}

class son1<A, B, T1> extends Father<T1, String> {

    ;

}

class son2<A, B> extends Father {

    ;

}

class son3<T2, T1, A, B, C, D> extends Father<T1, T2> {

    ;

}

class Person<T> {

    public T name;
    public T address;

    public Person(T name, T address) {

        this.name = name;
        this.address = address;

    }

    public T test4(T heihei) {

        T hehe = heihei;
        System.out.println(hehe);
        return hehe;

    }


/*    public static T hehehe(T he){

        ;

    }*/

   /* try{

        ;

    }catch(MyException<T> heihei){

        ;

    }finally{

        ;

    }*/


    public <U> U hehe(U enheng) {

        U xixi = enheng;
        return xixi;

    }

}

class MyException extends Exception {

    ;

}

class Creature {

    ;

}

class Person1 extends Creature {

    public static <Y> void father() {

        System.out.println("person1");

    };

}

class Man extends Person1 {

    public static <Y> void father() {

        System.out.println("man");

    };

}

class Child extends Man {

    ;

}

/*
class test6<?> {

    ;

}*/

class heihei<T extends Man>{

    public static <E> void he(E e){

        ;

    }

    public T name;

/*    public heihei(T t){

        ;

    }*/

    public <H> heihei(H h){

        ;

    }


    public void SafetyGeneric(List<? super Man> l){

        l.add(new Man());
        //l.add(new Person1());

    }





}
