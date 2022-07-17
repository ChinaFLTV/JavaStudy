package Java8的其他新特性;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/10 上午 10:10
 * *@Description This is a description of LambdaExpression
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class LambdaExpression {

    public static void main(String[] args) {

        new LambdaExpression().show();

    }

    public void show() {

        Chip c = new Chip() {

            @Override
            public void eat() {

                System.out.println("Anonymous class' method was invoked!");

            }

            @Override
            public void run(String str) {

                System.out.println("When you are running : " + str);

            }


        };



/*        Chip c1 = () -> {
            System.out.println("heiheiheihei");
        };*/
/*        Chip c2 = (str) -> {
            System.out.println("hehehe");
            System.out.println("hehe"+str);
        };*/

        c.eat();

        NumOperation no = (x, y) -> {
            return 2 * x + 2 * y;
        };
        System.out.println(no.add(5, 6));

        NumOperation no1 = (h, n) -> {
            return h * h * h + n * n * n;
        };
        System.out.println(no1.add(9, 1));

        NumOperation no2 = (z, g) -> {
            System.out.println("hehehehe");
            return z - g;
        };
        int i = no2.add(6, 8);
        System.out.println(i);

        ConsumerIntf ci = (str) -> {
            System.out.println("The string " + str + " had been eaten by me!");
        };

        ci.hetui("hehehe");

        System.out.println(qie((a, b, c1) -> {
            return a + b + c1;
        }, 3, 4, 5));

        System.out.println(he(((s1, s2, s3, s4) -> {
            return s1 + s2 + s3 + s4;
        }), "I ", "love ", " pig ", "."));
        System.out.println(emmmm((l, v, d) -> {
            return l + v + d;
        }, 1.0, 2.0, 3.0));

        System.out.println(goToHell((t, y, r) -> {
            return t - y - r;
        }, 1.2, 2.5, 33.0));

        System.out.println(goToHell((x, w, v) -> {
            return x + w + v;
        }, 5.0, 6.3, 8.0));

        System.out.println(getH((x, y) -> {
            return x * y;
        },7.0,6.0));


    }

    public static int qie(heiha<Integer> hhh, int a, int b, int c) {

        return hhh.subtraction(a, b, c);

    }

    public static String he(Strstr<String> h, String s1, String s2, String s3, String s4) {

        return h.strstr(s1, s2, s3, s4);

    }


    public static <U> U emmmm(hehehe<U> hhh, U x, U m, U n) {

        return hhh.numOperation(x, m, n);

    }


    public static <T> T goToHell(lula<T> ll, T t, T y, T r) {

        return ll.aiya(t, y, r);

    }

    public static <G> G goToHell1(heihaha<G> hhh, G k, G l, G m) {

        return hhh.getResult(k, l, m);

    }

    public static <h> h getH(abc<h> aaa, h n, h m) {

        return aaa.getV(n, m);

    }

}

interface Chip {

    public abstract void eat();

    public abstract void run(String str);

}

interface NumOperation {

    public static final int fakeField = 1;

    public abstract int add(int x, int y);

}

interface ConsumerIntf<T> {

    public abstract void hetui(T t);

}

@FunctionalInterface
interface heiha<T> {

    public static final String s = "emmm";

    public abstract int subtraction(T t, T n, T m);

}

@FunctionalInterface
interface Strstr<U> {

    public static final String s = "youGuess";

    public abstract String strstr(U a, U b, U c, U d);

}

@FunctionalInterface
interface hehehe<Y> {

    public static final int fakeField1 = 0;

    public abstract Y numOperation(Y y, Y u, Y l);

}

@FunctionalInterface
interface lula<U> {

    public static final double d = 6.666;

    public abstract U aiya(U r, U y, U x);

}


@FunctionalInterface
interface heihaha<U> {

    public static final String s = "heihei";

    public abstract U getResult(U n, U m, U x);

}

@FunctionalInterface
interface abc<V> {

    public static final int i = 666;

    public abstract V getV(V d, V f);

}