package 多线程;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/17 上午 10:00
 * *@Description This is a description of SynchronizedSingleton
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class SynchronizedSingleton {

    public static void main(String[] args) {

        SynSingleton ss1 = SynSingleton.getInstance();
        SynSingleton ss2 = SynSingleton.getInstance();
        System.out.println(ss1 == ss2);

    }

}


class SynSingleton {

    private static SynSingleton ss = null;

    private SynSingleton() {

        ;

    }

    public static SynSingleton getInstance() {

        if (ss == null) {

            synchronized (SynSingleton.class) {

                ss = new SynSingleton();

            }

        }

        return ss;

    }

}
