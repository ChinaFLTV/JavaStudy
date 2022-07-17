package Java8的其他新特性;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.*;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/10 下午 6:54
 * *@Description This is a description of LambdaPractice
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class LambdaPractice {

    public static void main(String[] args) {

        Employee e = new Employee("T", 33);
        Employee e1 = new Employee("T", 5);
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(e);
        al.add(e1);


        Collections.sort(al, (x, y) -> {

            if (x instanceof Employee && y instanceof Employee) {

                x = (Employee) x;
                y = (Employee) y;

                if (x.name != y.name) {

                    if (x.name.toCharArray().length != x.name.toCharArray().length) {

                        return x.name.toCharArray().length - x.name.toCharArray().length;

                    } else {
                        char[] c1 = x.name.toCharArray();
                        char[] c2 = y.name.toCharArray();
                        for (int i = 0; i < c1.length; i++) {

                            if (c1[i] != c2[i]) {

                                return c1[i] - c2[i];

                            } else {

                                ;

                            }
                        }

                    }

                } else {

                    return x.age - y.age;

                }

            } else {

                return 0;

            }


            return 0;
        });

        System.out.println(al);

        System.out.println(getValueJacket((x) -> {
            return x.toUpperCase();
        }, "Taylor Swift"));

        System.out.println(getValueJacket((x) -> {
            return x.substring(2, 4);
        }, "能不能给我一首歌的时间？"));

        System.out.println(getValue1((x, y) -> {
            return x + y;
        }, 123L, 456L));

        System.out.println(getValue1((x, y) -> {

            return x * y;

        }, 111L, 222L));

        System.out.println("---------------exquisite segment line--------------");

        Consumer<String> con = (x) -> {

            System.out.println(x);

        };

        con.accept("hehehe");
        Consumer<String> con1 = System.out::println;
        con1.accept("heiheihei");

        Comparator<Integer> con2 = (x, y) -> {

            return Integer.compare(x, y);

        };

        System.out.println(con2.compare(6, 8));

        Supplier<Integer> s = () -> {

            return (int) (Math.random() * 10000);

        };

        System.out.println(s.get());


        System.out.println("");


        Function<Double, Double> func = (x) -> {

            return Math.random() * x;

        };

        System.out.println(func.apply(6.66));

        Predicate<Character> pre = (x) -> {

            return x > 78;

        };

        System.out.println(pre.test('a'));
        BiFunction<Integer, Integer, Boolean> bf = (x, y) -> {

            return x > y;

        };

        System.out.println(bf.apply(6, 9));

        UnaryOperator<Integer> uo = (x) -> {

            return x + 6;

        };

        System.out.println(uo.apply(2));

        BinaryOperator<Float> bo = (x, y) -> {

            return x * y;

        };

        System.out.println(bo.apply(6.0f, 8.0f));
        BiConsumer<String, String> bc = (x, y) -> {

            System.out.println(x + y);

        };

        bc.accept("Can't", "color color!");

        BiPredicate<Double, Integer> bp = (x, y) -> {

            return x > (double) y;

        };

        System.out.println(bp.test(6.0, 1));

        ToDoubleFunction<Float> tif = (x) -> {

            return x;

        };
        System.out.println(tif.applyAsDouble(6.010f));

        LongFunction<String> lf = (x) -> {

            return " " + x;

        };

        System.out.println(lf.apply(666L));


    }

    public static String getValueJacket(StringTest st, String str) {

        return st.getValue(str);

    }

    public static <H> H getValue1(LambdaTest<H, H> lt, H h, H t) {

        return lt.sumLong(h, t);

    }


}


class Employee {

    public String name;
    public int age;

    public Employee() {

        ;

    }

    public Employee(String name) {

        this();
        this.name = name;

    }

    public Employee(String name, int age) {

        this(name);
        this.age = age;

    }

    @Override
    public String toString() {

        return "name : " + this.name + "\t\tage : " + this.age + "\n";

    }


}


@FunctionalInterface
interface StringTest {

    public static final String name = "youGuess";

    public abstract String getValue(String s);

}

@FunctionalInterface
interface LambdaTest<T, U> {

    public static final int i = 666;

    public abstract U sumLong(T t, T h);

}



