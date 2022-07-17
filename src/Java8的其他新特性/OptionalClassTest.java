package Java8的其他新特性;

import java.util.Optional;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/12 下午 4:40
 * *@Description This is a description of OptionalClassTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class OptionalClassTest {

    public static void main(String[] args) throws MyException {

        Optional<Mars> o = Optional.of(new Mars("haha", 666));
        System.out.println(o);

        Optional<Mars> o1 = Optional.of(new Mars("Elon Musk", 51));
        Optional<Mars> o2 = Optional.empty();
        System.out.println(o2);
        Optional<Mars> o3 = Optional.ofNullable(null);
        System.out.println(o3);
        //Optional<Mars> o4 = Optional.of(null);
        //System.out.println(o4);

        Optional<Mars> o5 = Optional.ofNullable(new Mars("Joe Biden", 80));
        System.out.println(o5.isPresent());
        Optional<Mars> o6 = Optional.ofNullable(null);
        System.out.println(o6.isPresent());
        Optional<Mars> o7 = Optional.ofNullable(new Mars("Donald Trump", 76));

        o7.ifPresent((x) -> {

            System.out.println(x.toString());

        });


        Optional<Mars> o8 = Optional.ofNullable(new Mars("obama", 61));
        o8.ifPresent((x) -> {

            System.out.println(x);

        });

        Optional<Mars> o9 = Optional.ofNullable(null);
        //System.out.println(o9.get());

        Optional<Mars> o10 = Optional.ofNullable(new Mars("Zelensky", 44));
        System.out.println(o10.get());

        Optional<Mars> o11 = Optional.ofNullable(null);
        System.out.println(o11.orElse(new Mars("Johnson", 58)));

        Optional<Mars> o12 = Optional.ofNullable(null);
        System.out.println(o12.orElse(new Mars("Macron", 45)));

        Optional<Mars> o13 = Optional.ofNullable(null);
        System.out.println(o13.orElseGet(() -> {

            return new Mars("Modi", 72);

        }));


        System.out.println(o13.orElseGet(() -> {

            System.out.println("MAGA");
            return new Mars("Donald", 76);

        }));


        Optional<Mars> o14 = Optional.ofNullable(null);
/*        System.out.println(o14.orElseThrow(() -> {

            System.out.println("MyException is coming!");
            return new MyException();

        }));
        */

        System.out.println("------------------exqusite segment line-------------------");
        Optional<Mars> o15 = Optional.ofNullable(null);

/*        System.out.println(o15.orElseThrow(()->{

            return new MyException();

        }));*/

        System.out.println(Optional.ofNullable(new Mars("heihei",999)).filter((x)->{

            return x.age>1999;

        }));

        System.out.println(Optional.ofNullable(new Mars("haha",666)).filter((x)->{

            return x.age>100;

        }));



        System.out.println(Optional.ofNullable(new Mars("hehe",33)).map((x)->{

            return x.name;

        }));




    }


}

class Mars {

    public String name;
    public int age;


    public Mars(String name, int age) {

        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {

        return "name :　" + this.name + "\tage : " + this.age + "\n";

    }

}

class MyException extends Exception {

    {
        System.out.println("haha,my dear exception!");

    }
}
