package Java集合;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static java.util.Collections.copy;
import static java.util.Collections.sort;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/19 上午 11:12
 * *@Description This is a description of CollectionsPractices_1
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class CollectionsPractices_1 {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(0);
        a.add(3);
        a.add(1);
        a.add(2);
        a.add(5);
        a.add(4);

        sort(a, new ComparatorMini());
        System.out.println(a);

        LinkedList<Student> l = new LinkedList<Student>();

        l.add(new Student("ZhangFei",88.88,213466L));
        l.add(new Student("GuanYu",99.96,43851L));
        l.add(new Student("LiuBei",60.66,56834L));
        l.add(new Student("ZhugeLiang",100.00,45856451L));
        l.add(new Student("WuYong",150.00,48546L));
        sort(l,new ComparatorPro());
        //l.remove()
        ArrayList<Object> al = new ArrayList<Object>();
        al.add(l.get(0));
        al.add(l.get(1));
        al.add(l.get(2));

        //copy(al,l);
        int i = 1;
        for(Object o:al){

            i++;

        }
            //Student s = (Student)o;
           // System.out.println("The NO."+i+" is: "+s.name+" whoes score is "+s.score+"！！！");

        System.out.println("-------------exquisite segment line------------");

        Properties p = new Properties();
        try {

            p.load(new FileReader("C:\\Users\\Lenovo\\Desktop\\heihei.hei"));
            ArrayList<String> a1 = new ArrayList<String>();
            Map<String,Integer> m = new HashMap<String,Integer>();


            for(String s: p.stringPropertyNames()){

                m.put(s,1);
                a1.add(s);

            }


            Iterator it = a1.iterator();
            int[] count = new int[16];
            while(it.hasNext()){

                it.next();
                //char[]
                //if()
            }










        }catch(FileNotFoundException fnfe){

            fnfe.getMessage();
            fnfe.printStackTrace();

        }catch(IOException ioe){

            ioe.getLocalizedMessage();
            ioe.printStackTrace();


        }finally{

            ;

        }

    }

}

class ComparatorMini implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        int oo1 = (int) o1;
        int oo2 = (int) o2;

        return oo1 - oo2;


    }
}

class Student {

    public String name;
    public Double score;
    public long id;


    public Student() {

        ;

    }

    public Student(String name, Double score, long id) {

        this();
        this.name = name;
        this.score = score;
        this.id = id;

    }


}

class ComparatorPro implements Comparator{

    @Override
    public int compare(Object s1,Object s2){

        if(s1 == s2){

            return 0;

        }else{

            return (int)(((Student)(s2)).score-((Student)s1).score);

        }

    }
}