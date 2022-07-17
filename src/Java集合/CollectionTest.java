package Java集合;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/14 上午 9:37
 * *@Description This is a description of CollectionTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        List list1 = new LinkedList();
        List list2 = new ArrayList();
        List list3 = new Vector();

        list1.add(3);
        list1.add("heihei");
        list1.add(123L);
        list1.add('a');
        list1.add(true);
        list1.add(123.456);

        list2.add('a');
        list2.add(123);
        list2.add(123456L);
        list2.add(123.456);
        list2.add("haha");
        list2.add(false);

        list3.add('c');
        list3.add(1223);
        list3.add("hehe");
        list3.add(true);
        list3.add(123.455);
        list3.add(1234567L);

        System.out.println("list1: " + list1 + "\nlist22: " + list2 + "\nlist3:　" + list3);

        List<Integer> list4 = new ArrayList<Integer>();
        list4.add(4);
        list4.add(5);
        List<Long> list5 = new LinkedList<>();

        Vector<Character> list6 = new Vector<>();
        list6.add('5');

        LinkedList<Double> list7 = new LinkedList<Double>();

        list7.add(123.456);

        List<Long> list8 = Arrays.asList(123L, 456L, 789L);
        list8.set(2, 999L);
        //ArrayList<Long> list9 = (ArrayList<Long>)list8;
        System.out.println(list8);
        System.out.println(list8.get(1));


        //list8.add(910L);

        //list8.set(22,999L);

        List<Long> list9 = new LinkedList<>();
        list9.addAll(list8);
        System.out.println("----------------exquisite segment line--------------");
        System.out.println(list9);

        ArrayList<Long> list10 = new ArrayList<>();
        list10.addAll(list9);
        System.out.println(list10);
        Vector<Long> list11 = new Vector<>();
        list11.addAll(list10);
        System.out.println(list11);
        System.out.println(list11.size());
        System.out.println(list11.isEmpty());
        list11.clear();
        System.out.println(list11.size());
        System.out.println(list11.isEmpty());
        System.out.println(list10.contains(456L));
        System.out.println(list10.contains(145));

        list11.addAll(list10);
        System.out.println(list11);
        list11.removeAll(list10);
        System.out.println(list11);
        List list12 = Arrays.asList(123, 56, 89, 6, 65, 89);

        LinkedList<Integer> list13 = new LinkedList<>();
        list13.add(56);
        list13.add(89);
        list13.add(78);
        list13.add(96);
        list13.add(44);
        list13.add(11);
        list13.add(787);

        ArrayList<Integer> list14 = new ArrayList<>();
        list14.add(78);
        list14.add(44);
        list14.add(11);
        //list13.addAll(list10);
        list13.remove(3);
        System.out.println(list13);
        System.out.println(list13.contains(11));
        System.out.println(list13.containsAll(list14));
        System.out.println(list14.containsAll(list13));
        Object[] array = list13.toArray();
        System.out.println(array.getClass().getName());
        System.out.println(list13.hashCode());
        System.out.println(list14.hashCode());

        System.out.println("--------------exquisite segment line-------------");

        Iterator i = list13.iterator();
        while (i.hasNext()) {

            System.out.println(i.next());

        }
        Iterator ii = list13.iterator();

        while(ii.hasNext()){

            ii.next();
            ii.remove();
            //ii.remove();
            ///System.out.println(ii);

        }
        System.out.println(list13);

        for(Integer integer:list14){

            System.out.println(integer.intValue());

        }

        System.out.println("--------------exquisite segment line-------------");
        String[] str = new String[5];
        for(String s:str){

            s = "atguigu";
            System.out.println(s);

        }

        for(int k = 0;k<str.length;k++){

            System.out.println(str[k]);

        }

        System.out.println("-------------exquisite segment line--------------");

        System.out.println(list.indexOf('b'));


    }

}


