package Java集合;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
**@Author LiGuanda
**@Data 2022/3/16 上午 8:52
**@Description This is a description of LinkedListTest
**@Params
**@Return
**@Since versio-1.0  */



public class LinkedListTest {

    public static void main(String[] args){

        LinkedList<Character> list = new LinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');

        List list1 = new ArrayList();
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add('a');
        System.out.println(list1);
        updateList(list1);

        list.addFirst('4');
        list.addLast('5');

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list);
        System.out.println(list.removeLast());
        System.out.println(list);
        list.addFirst('g');
        list.addFirst('h');
        list.addFirst('i');
        list.addFirst('k');
        list.addFirst('h');
        list.removeFirst();
        list.removeLast();
        list.getFirst();
        list.getLast();
        Vector<Integer> v = new Vector<Integer>();

        v.addElement(0);
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        System.out.println("-----------------exquisite segment line---------------");

        v.insertElementAt(-1,0);

        v.setElementAt(00,0);
        v.removeElement(0);
        v.removeAllElements();
        System.out.println(v);
        v.insertElementAt(666,0);
        v.insertElementAt(777,1);
        v.addElement(44);
        v.addElement(465);
        v.removeElement(44);
        v.remove(456);
        v.removeAllElements();
        v.setElementAt(5456,0);
        v.setElementAt(54656,0);
        v.addElement(1);
        v.addElement(2);
        v.setElementAt(333,1);
        v.setElementAt(666,0);
        v.removeElement(111);
        v.removeAllElements();
        v.insertElementAt(546,0);


    }

    public static void updateList(List list){

        list.remove(2);

    }


}


