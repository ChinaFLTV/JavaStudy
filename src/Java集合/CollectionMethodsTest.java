package Java集合;

import java.lang.annotation.*;
import java.lang.reflect.Array;
import java.util.*;

import static java.util.Collections.*;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/19 上午 8:53
 * *@Description This is a description of CollectionMethodsTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class CollectionMethodsTest {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>(8);
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);

        System.out.println(a);
        reverse(a);
        System.out.println(a);
        shuffle(a);
        System.out.println(a);
        shuffle(a);
        System.out.println(a);
        //sort(a);
        //System.out.println(a);
        sort(a, new NewComparator());
        System.out.println(a);
        System.out.println(max(a));

        swap(a,0,1);
        System.out.println(a);

        System.out.println(min(a));

        System.out.println("-------------exquisite segment line-------------");

        ArrayList<UnconscionableCelebrity> a1 = new ArrayList<UnconscionableCelebrity>();
        a1.add(new UnconscionableCelebrity("D",30,1));
        a1.add(new UnconscionableCelebrity("D",30,9));
        a1.add(new UnconscionableCelebrity("D",30,13));

        sort(a1,new ComparatorPlus());
        System.out.println(a1);
        for(UnconscionableCelebrity u:a1){

            System.out.println("name: "+u.name+"\t\tage: "+u.age+"\t\tCorruptionMoney: "+u.CorruptionMoney);

        }


        //System.out.println(max(a1),new ComparatorPlus());
        List<Integer> l = new ArrayList<Integer>(Arrays.asList(11,22,33,44,55,66,77,88,99));
        List<Double> l1 = new LinkedList<>();

        copy(l,a);
        System.out.println(l);
        replaceAll(l,88,7);
        System.out.println(l);

        Collections.synchronizedList(l);

        Set s = new HashSet<>();
        Map<String,String> m = new LinkedHashMap<String,String>();
        //Map<String,Integer> m1 = new Sorted<String,Integer>();

        Set s1= Collections.synchronizedSet(s);
        Collections.synchronizedMap(m);
        //Collections.synchronizedSortedMap(m);



    }


}

class NewComparator implements Comparator {

    public int compare(Object o1, Object o2) {

        if (o1 == o2) {

            return 0;

        } else {

            if (o1 instanceof Integer && o2 instanceof Integer) {

                return (int) o1 - (int) o2;

            } else {

                throw new ClassCastException();

            }

        }

    }
}

class UnconscionableCelebrity {

    public String name;
    public int age;
    @FieldAnnotation
    public int CorruptionMoney;

    public UnconscionableCelebrity() {

        ;

    }

    public UnconscionableCelebrity(String name, int age, int CorruptionMoney) {

        this();
        this.name = name;
        this.age = age;
        this.CorruptionMoney = CorruptionMoney;

    }


}

class ComparatorPlus implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {

        if (o1 == o2) {

            return 0;

        } else {

            if (o1 instanceof UnconscionableCelebrity && o2 instanceof UnconscionableCelebrity) {

                UnconscionableCelebrity op1 = (UnconscionableCelebrity) o1;
                UnconscionableCelebrity op2 = (UnconscionableCelebrity) o2;

                if (op1.name == op2.name) {

                    if (op1.age == op2.age) {

                        if (op1.CorruptionMoney == op2.CorruptionMoney) {

                            return 0;

                        } else {


                            return op2.CorruptionMoney - op1.CorruptionMoney;

                        }

                    } else {

                        return op2.age - op1.age;

                    }

                } else {
                    char[] op1_name = op1.name.toCharArray();
                    char[] op2_name = op2.name.toCharArray();
                    if (op1_name.length != op2_name.length) {

                        return op2_name.length - op1_name.length;

                    } else {

                        int totalCount = 0;
                        for (int i = 0; i < op1_name.length; i++) {

                            totalCount += (int) (op2_name[i]) - (int) (op1_name[i]);

                        }

                        return totalCount;

                    }

                }


            } else {

                throw new SecurityException();

            }
        }

    }
}


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface FieldAnnotation {

    //The unit of the field called CorruptionMoney is billon.

}

