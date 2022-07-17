package Java8的其他新特性;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparingDouble;
import static java.util.Comparator.comparingInt;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/11 上午 10:31
 * *@Description This is a description of StreamTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class StreamTest {

    public static void main(String[] args) {

        Stream s = Stream.of(new int[]{3, 6, 38, 7, 1, 0, 9});
        //System.out.println(s.count());
/*        s.sorted().forEach(x->{

            System.out.println(x);

        });*/

        //System.out.println(s.getClass());
        Stream s1 = Stream.iterate(1, (x) -> {

            return x = x * 2;

        });

        s1.limit(10).forEach((x) -> {

            System.out.println(x);

        });

        Stream s2 = Stream.iterate(1, (x) -> {

            return x = x * 2;

        });


/*
        s2.limit(64).forEach((x) -> {

            System.out.println(x);

        });

        Stream s3 = Stream.generate(() -> {

            return Math.random();

        });

        s3.limit(10000).forEach((x) -> {

            System.out.println(x);

        });

        Stream s4 = Stream.generate(() -> {

            return Math.random() * 6.666 * Math.random();

        });

        s4.limit(7000000).forEach((x) -> {

            System.out.println((double) x + Math.random());

        });


        Stream s5 = Stream.iterate(1, (x) -> {

            return x = x + 1;

        });

        s5.forEach((x) -> {

            System.out.println("The " + x + " data was printed!");

        });
*/

        HashSet<Integer> h = new HashSet<Integer>();
        h.add(5);
        h.add(5);
        h.add(9);
        h.add(0);
        h.add(6);
        h.add(4);

        Stream s6 = h.stream();
        s6.distinct().forEach((x) -> {

            System.out.println(x);

        });

        int[] i1 = new int[]{3, 5, 4, 7, 7, 4, 9, 2, 1};
        IntStream s7 = Arrays.stream(i1);
        s7.distinct().sorted().forEach((x) -> {

            System.out.println(x);

        });

        Stream s8 = Stream.iterate(0, (x) -> {

            return x = x + 1;

        });

        s8.limit(20).filter((x) -> {

            return (int) x > 10;

        }).forEach((x) -> {

            System.out.println(x);

        });


        Stream s9 = Stream.generate(() -> {

            return (int) (Math.random() * 100);

        });

        System.out.println("---------------exquisite segment line---------------");
/*        s9.sorted().forEach((x)->{

            System.out.println(x);

        });*/


        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(5);
        a.add(0);
        a.add(6);
        a.add(8);

        Stream s10 = a.stream();
        s10.map((x) -> {

            return (int) x * 10000;

        }).forEach(

                System.out::println

        );

        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);

/*        Stream s11 = l2.stream();
        s11.sorted().mapToDouble((x)->{

            return (double)x;

        }).forEach(

                System.out::println

        );*/

        Stream s12 = l2.stream();
        s12.sorted().mapToLong((x) -> {

            return (long) ((int) (x));

        }).forEach(

                System.out::println

        );

        int[] i3 = new int[]{3, 6, 3, 9, 3, 0};
        IntStream s14 = Arrays.stream(i3);
        s14.sorted().distinct().flatMap((x) -> {

            return IntStream.of((int) (Math.random() * 10000) * x);

        }).forEach(

                System.out::println

        );

        IntStream s15 = Arrays.stream(i3);
        //System.out.println(s15.sorted().distinct().max());
        //System.out.println(s15.min());
        //System.out.println(s15.count());


/*        System.out.println(s15.reduce(4,(x,y)->{

            return x-y;

        }));*/

/*        System.out.println(s15.reduce((x,y)->{

            return x-y;

        }));*/

        ArrayList<Integer> al = new ArrayList<>();

        al.add(6);
        al.add(1);
        al.add(3);
        al.add(5);
        al.add(4);
        al.add(5);
        al.add(0);
        al.add(22);
        al.add(8);
        al.add(7);

        Stream s16 = al.stream();
        System.out.println(s16.sorted().limit(3).distinct().min((x, y) -> {

            return (int) x - (int) y;

        }));

        Stream s17 = al.stream();
        System.out.println(s17.sorted().distinct().limit(9).allMatch((x) -> {

            return (int) x > 6;

        }));

        System.out.println(al.stream().sorted().distinct().allMatch((x) -> {

            return x > -1;

        }));


        System.out.println(al.stream().sorted().distinct().anyMatch((x) -> {

            return x > 6;

        }));


        System.out.println(al.stream().sorted().distinct().noneMatch((x) -> {

            return x > 6;

        }));

        System.out.println(al.stream().sorted().distinct().limit(10).noneMatch((x) -> {

            return x > 999;

        }));


        System.out.println(al.stream().sorted().distinct().findFirst());
        System.out.println(al.stream().findAny());
        System.out.println(al.stream().reduce(9, (x, y) -> {

            return x + y;

        }));

        System.out.println(al.stream().reduce((x, y) -> {

            return x + y;

        }));

        Set s3 = al.stream().collect(Collectors.toSet());
        System.out.println(s3);

        Set s4 = al.stream().sorted().limit(4).collect(Collectors.toSet());
        System.out.println(s4);

        List l = al.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(l);

        Integer i = al.stream().sorted().limit(3).collect(Collectors.summingInt((x) -> {

            return (int) x;

        }));

        System.out.println(i.intValue());

        Integer i2 = al.stream().sorted().limit(4).collect(Collectors.summingInt((x) -> {

            System.out.println((int) x);
            return (int) x;

        }));

        System.out.println(i2);


        Double d = al.stream().sorted().limit(4).collect(Collectors.averagingInt((x) -> {

            return (int) x;

        }));

        System.out.println(d);

        System.out.println(al.stream().sorted().limit(4).collect(Collectors.summarizingInt((x) -> {

            return (int) x;

        })));

        System.out.println("----------------exquisite segment line--------------");
        System.out.println(al.stream().sorted().collect(Collectors.summarizingInt((x) -> {

            return (int) x;

        })));

        HashSet<Mercury> hm = new HashSet<Mercury>();
        Mercury m = new Mercury("heihei", 45);
        Mercury m1 = new Mercury("haha", 66);
        Mercury m2 = new Mercury("hehe", 99);
        hm.add(m);
        hm.add(m1);
        hm.add(m2);

        Stream s18 = hm.stream();


        //Map<String,ArrayList<Mercury>> m4= hm.stream().collect(Collectors.groupingBy(Mercury::getArea4),Collectors.groupingBy(Mercury::getThis));

        HashMap<String, Double> hm1 = (HashMap<String, Double>) hm.stream().collect(Collectors.groupingBy(Mercury::getArea4, Collectors.averagingInt(Mercury::getAge)));

        System.out.println(hm1);


        HashMap<Integer, Integer> hm2 = (HashMap<Integer, Integer>) hm.stream().collect(Collectors.groupingBy(Mercury::getAge, Collectors.summingInt(Mercury::getAge)));
        System.out.println(hm2);

        hm.add(new Mercury("hetui", 99));

        HashMap<Integer, Optional<Mercury>> hm3 = (HashMap<Integer, Optional<Mercury>>) hm.stream().collect(Collectors.groupingBy(Mercury::getAge, Collectors.maxBy(comparingInt(Mercury::getAge))));

        System.out.println(hm3);

        System.out.println(hm.stream().collect(Collectors.maxBy(comparingDouble((Mercury::getAge)))));

        System.out.println(hm.stream().collect(Collectors.minBy(comparingInt((Mercury::getAge)))));

/*        String ar = hm.stream().collect(Collectors.maxBy(comparingInt(Mercury::getAge)), Optional < Mercury > me -> {

            return
        }));
        })*/

        String s5 = hm.stream().map(Mercury::getArea4).collect(Collectors.joining());
        System.out.println(s5);

        System.out.println(hm.stream().map(Mercury::getAge));
        hm.stream().sorted((x, y) -> {

            return ((Mercury) x).age - ((Mercury) (y)).age;

        }).map(Mercury::getArea4).forEach((x) -> {

            System.out.println(x);

        });

        String s11 = hm.stream().sorted((x, y) -> {

            if (((Mercury) x).age - ((Mercury) y).age == 0) {

                return ((Mercury) (x)).age - ((Mercury) x).age;

            } else {

                return ((Mercury) x).area.toCharArray().length - ((Mercury) y).area.toCharArray().length;


            }

        }).map(Mercury::getArea4).collect(Collectors.joining());

        System.out.println("------------------exquisite segment line-----------------");

        System.out.println(s11);






    }


}


class Mercury {

    public String area;
    public int age;

    public Mercury(String area, int age) {

        this.area = area;
        this.age = age;

    }

    public String getArea4() {

        return this.area;

    }

    public int getAge() {

        return this.age;

    }

    public Mercury getThis() {

        return this;

    }

    @Override
    public String toString() {

        return "area : " + this.area + "\t\tage : " + this.age;

    }

}
