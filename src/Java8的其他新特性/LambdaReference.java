package Java8的其他新特性;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/11 上午 9:38
 * *@Description This is a description of LambdaReference
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class LambdaReference {

    public static void main(String[] args) {

        Consumer<Boolean> c = (x) -> {

            System.out.println(x);

        };

        c.accept(false);

        Consumer<Character> c1 = System.out::println;
        c1.accept('a');

        Comparator<Integer> c3 = Integer::compare;
        System.out.println(c3.compare(6, 1));
        BiPredicate<Integer, Float> bp = Integer::equals;
        System.out.println(bp.test(6, 9.0f));

        Function<Integer, Integer> func = (x) -> new Integer(x);
        Function<Double, Double> func1 = Double::new;
        func1.apply(6.666);

        Function<Integer, Float[]> func2 = Float[]::new;
        func2.apply(6);

        Function<String,Moon> func3 = Moon::new;
        Moon m = func3.apply("Taylor Swift");

        System.out.println(m.name);


        HashSet<Integer> h = new HashSet<Integer>();

        h.add(1);
        h.add(2);
        h.add(3);

        Stream st = h.stream();
        //System.out.println(st.count());

        System.out.println(st.count());

        Stream st1 = h.parallelStream();
        System.out.println(st1.count());

        LinkedList<Character> ll = new LinkedList<Character>();
        ll.add('a');
        ll.add('d');
        ll.add('e');
        ll.add('c');


        Stream s1 = ll.parallelStream();
        s1.limit(3).forEach(x->{

            System.out.println(x);

        });

        System.out.println("------------exquisite segment line------------");

        int[] i = new int[]{4,6,8,6,36,3,6,2,7,5};

        IntStream s2 = Arrays.stream(i);
        s2.limit(6).sorted().forEach(x->{

            System.out.println(x);

        });







    }


}

class Moon {

    public String name;
    public int age;

    public Moon() {

        ;

    }

    public Moon(String name) {

        this();
        this.name = name;

    }

    public Moon(String name, int age) {

        this(name);
        this.age = age;

    }

}
