package Java8的其他新特性;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/12 下午 6:25
 * *@Description This is a description of StreamAPIPractice
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class StreamAPIPractice {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);


        ArrayList<Integer> a1 = (ArrayList<Integer>) a.stream().map((x) -> {

            return (int) (Math.pow((int) x, 2));

        }).collect(Collectors.toList());

        System.out.println(a1);

        HashSet<Jupiter> h = new HashSet<Jupiter>();
        h.add(new Jupiter("Joe Biden", 80, true));
        h.add(new Jupiter("Donald Trump", 76, false));
        h.add(new Jupiter("Johnson", 58, true));
        h.add(new Jupiter("Macron", 45, false));

        System.out.println(h.stream().count());

        int[] i = new int[]{1, 2, 3, 4};
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a2.add(4);
        a2.add(5);
        a2.add(6);
        System.out.println(a2.stream().collect(Collectors.summingInt((x) -> {

            return (int) x;

        })));


        System.out.println(h.stream().map(Jupiter::getAge).reduce((x, y) -> {

            return x / x + y / y + 1;


        }));


        System.out.println(h.stream().map((x) -> {

            return 1;

        }).collect(Collectors.summingInt(Integer::intValue)));

/*        System.out.println(h.stream().sorted((x, y) -> {

            return x.age - y.age;

        }).map(Jupiter::getAge).reduce((x, y) -> {

            //return  ((int) x) / ((int) x) + (int) y / ((int) y);
            return x + y;

        })/(h.stream().map(Jupiter::getAge).collect(()->{

            Collectors.summingInt();

        })));*/

        System.out.println("---------------exquisite segment line---------------");

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2011, 950));

        transactions.stream().filter((x) -> {

            return x.getYear() == 2011;

        }).sorted((x, y) -> {

            return x.getValue() - y.getValue();

        }).forEach(

                System.out::println

        );

        transactions.stream().map(Transaction::getTrader).map(Trader::getCity).forEach((x) -> {

            System.out.println(x);

        });

        transactions.stream().map(Transaction::getTrader).filter((x) -> {

            return x.getCity() == "Cambridge";

        }).sorted((x, y) -> {

            return (x.getName().toCharArray())[0] - (y.getName().toCharArray())[0];

        }).forEach((x) -> {

            System.out.println(x);

        });

        System.out.println(transactions.stream().map((x) -> {

            return x.getTrader();

        }).anyMatch((x)->{

            return x.getCity() == "Milan";

        }));

        System.out.println(transactions.stream().map((x)->{

            return x.getValue();

        }).collect(Collectors.summingInt(Integer::intValue)));


        System.out.println(transactions.stream().map((x)->{

            return x.getValue();

        }).max((x,y)->{

            return x-y;

        }));

        System.out.println(transactions.stream().min((x,y)->{

            return x.getValue()-y.getValue();

        }));


    }


}


class Jupiter {

    public String name;
    public int age;
    public boolean isArcane;

    public Jupiter(String name, int age, boolean isArcane) {

        this.name = name;
        this.age = age;
        this.isArcane = isArcane;

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

    @Override
    public String toString() {

        return "name : " + this.name + "\tage : " + this.age + "\tisArcane : " + this.isArcane + "\n";

    }

}

//交易员类
class Trader {

    private String name;
    private String city;

    public Trader() {
    }

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader [name=" + name + ", city=" + city + "]";
    }

}


//交易类
class Transaction {

    private Trader trader;
    private int year;
    private int value;

    public Transaction() {
    }

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {

        return "Transaction [trader=" + trader + ", year=" + year + ", value="
                + value + "]";
    }

}

