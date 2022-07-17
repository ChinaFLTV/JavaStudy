package Java8的其他新特性;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summingInt;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/12 下午 3:08
 * *@Description This is a description of CollectorsTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class CollectorsTest {

    public static void main(String[] args) {

        Venus[] v = new Venus[8];
        v[0] = new Venus("Liorona", 6, true, 88);
        v[1] = new Venus("Niobo", 1, true, 11);
        v[2] = new Venus("Sogolan", 2, false, 22);
        v[3] = new Venus("Ovda", 2, true, 44);
        v[4] = new Venus("Gegute", 3, true, 66);
        v[5] = new Venus("Aina", 4, true, 86);
        v[6] = new Venus("Lowana", 5, false, 99);
        v[7] = new Venus("Nephere", 5, true, 12);

        Map<Integer, Integer> m = Arrays.stream(v).sorted((x, y) -> {

            return ((Venus) x).value - ((Venus) y).value;

        }).collect(Collectors.groupingBy(Venus::getAge, summingInt(Venus::getValue)));

        System.out.println(m);

        ArrayList<Venus> m1 = (ArrayList<Venus>) Arrays.stream(v).sorted((x, y) -> {

            return ((Venus) x).age - ((Venus) y).age;

        }).distinct().collect(Collectors.collectingAndThen(Collectors.toCollection(() ->
                new TreeSet<>(Comparator.comparing(Venus::getAge))), ArrayList::new));


        System.out.println(m1);

        ArrayList<Venus> h = Arrays.stream(v).sorted((x, y) -> {

            return ((Venus) x).value - ((Venus) y).value;

        }).distinct().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> {

            return new TreeSet<>(Comparator.comparing(Venus::getAge));

        }), ArrayList::new));

        System.out.println(h);


        System.out.println("-------------------exquisite segment line--------------------");
        Map<Boolean, List<Venus>> m2 = Arrays.stream(v).collect(Collectors.partitioningBy((x) -> {

            return x.isArcane == true;

        }));
        System.out.println(m2);

        Map<Boolean,List<Venus>> m3 = Arrays.stream(v).collect(Collectors.partitioningBy((z)->{

            return (z.isArcane) == false;

        }));

        System.out.println("----------------exquisite segment line------------------");

        System.out.println(m3);

        System.out.println(Arrays.stream(v).collect(Collectors.summingInt(Venus::getValue)));






    }





}


class Venus {

    public String name;
    public int age;
    public boolean isArcane;
    public int value;

    public Venus(String name, int age, boolean isArcane, int value) {

        this.name = name;
        this.age = age;
        this.isArcane = isArcane;
        this.value = value;

    }

    public String getName() {

        return this.name;

    }

    public int getAge() {

        return this.age;

    }

    public boolean getIsArcane() {

        return this.isArcane;

    }

    public int getValue() {

        return this.value;

    }

    @Override
    public String toString() {

        return "name : " + this.name + "\tage : " + this.age + "\tisArcane : " + this.isArcane + "\tvalue : " + this.age + "\n";

    }


}
