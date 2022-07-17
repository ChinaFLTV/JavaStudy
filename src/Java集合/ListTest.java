package Java集合;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/15 上午 11:08
 * *@Description This is a description of ListTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class ListTest {

    public static void main(String[] args) {

        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('f');
        list.add('g');

        List<Character> list1 = new LinkedList<>();
        list1.add('h');
        list1.add('i');
        list1.add('j');
        list1.add('k');
        list.addAll(list1);
        System.out.println(list);
        List<Character> list2 = new Vector<>();

        list2.add('l');
        list2.add('m');
        list2.add('n');
        list2.add('o');
        list2.add('p');
        list2.add('q');
        list.addAll(3, list2);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list);
        list.set(1,'b');
        System.out.println(list);
        System.out.println(list.subList(1,3));
        System.out.println(list.subList(1,1));
        System.out.println(list.subList(0,2));

        System.out.println("---------------exquisite segment line---------------");

        list.add('b');
        list.add('b');
        System.out.println(list.indexOf('b'));
        System.out.println(list.lastIndexOf('b'));
        System.out.println(list);
        list.subList(1,3).clear();
        System.out.println(list);

        //int[ ]x = {5};

    }

}
