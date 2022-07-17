package Java集合;

import java.lang.annotation.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/18 下午 2:32
 * *@Description This is a description of TreeSetTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


@classAnnotation
public class TreeSetTest {

    public static void main(String[] args) {

        Set<Integer> s = new TreeSet<Integer>();
        s.add(0);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        Set<Integer> s1 = new TreeSet<Integer>();
        s1.add(5);
        s1.add(6);
        s1.add(7);
        s1.add(8);
        s.addAll(s1);
        System.out.println(s);
        System.out.println(s.contains(8));
        System.out.println(s.containsAll(s1));
        //s.remove(8);
        System.out.println(s);
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(0);
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        System.out.println(t.ceiling(4));
        System.out.println(t.floor(2));
        System.out.println(t.descendingSet());
        System.out.println(t.first());
        System.out.println(t.last());
        TreeSet<Integer> t2 = new TreeSet<Integer>();
        t2.add(0);
        t2.add(1);
        t2.add(2);
        t2.add(3);

        System.out.println(t.headSet(3, false));
        System.out.println(t.headSet(3, true));
        //t.pollFirst();
        //t.pollFirst();
        System.out.println(t);
        System.out.println(t.last());
        System.out.println(t.lower(4));
        System.out.println(t.floor(4));
        System.out.println(t.higher(4));
        System.out.println(t.ceiling(4));
        System.out.println(t.subSet(0, 3));
        System.out.println(t.tailSet(2, false));
        System.out.println(t.tailSet(2, true));
        System.out.println("---------------exquisite segment line-----------------");

        TreeSet<Person> t3 = new TreeSet<Person>();
        Person ppp  = new Person(1,"haha");
        t3.add(ppp);


    }


}


@classAnnotation
class Person implements Comparable {

    public int Id;
    public String Name;

    public Person() {

        ;

    }

    public Person(int Id, String Name) {

        this();
        this.Id = Id;
        this.Name = Name;

    }


    @methodAnnotation
    @Override
    public int compareTo(Object p) {

        if (p instanceof Person && p != null) {

            Person pp = (Person) p;
            if (this.Id == pp.Id) {

                if (this.Name == pp.Name) {

                    return 0;

                } else {

                    StringBuffer sb = new StringBuffer();
                    char[] c1 = this.Name.toCharArray();
                    char[] c2 = pp.Name.toCharArray();
                    if (c1.length != c2.length) {

                        return c1.length - c2.length;

                    } else {

                        int total = 0;
                        for (int i = 0; i < c1.length; i++) {

                            total += (int) c1[i] - (int) c2[i];

                        }

                        return total;

                    }


                }
            } else {

                return this.Id - pp.Id;
            }
        }
        return 0;

    }


}





@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface classAnnotation {

    ;

}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface methodAnnotation {

    ;

}

/*
interface newComparator implements Comparator{

    @Override
    public int compare(Object p1,Object p2){

        return 0;

    }
}*/
