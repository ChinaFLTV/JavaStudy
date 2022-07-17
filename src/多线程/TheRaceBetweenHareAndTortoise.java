package 多线程;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/18 下午 8:53
 * *@Description This is a description of TheRaceBetweenHareAndTortoise
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class TheRaceBetweenHareAndTortoise {

    public static void main(String[] args) {


        Object nurburgring = new Object();
        Hare h = new Hare(nurburgring);
        Tortoise t = new Tortoise(nurburgring);
        h.start();
        t.start();

    }

}

class Hare extends Thread {

    public Object nurburgring;
    public int distance = 100;

    public Hare(Object nurburgring) {

        this.nurburgring = nurburgring;

    }

    @Override
    public void run() {

        synchronized (nurburgring) {

            while (true) {

                if ((this.distance > 0) && (this.distance != 22)) {

                    nurburgring.notify();

                    System.out.println("The hare has ran " + (100 - this.distance) + " meters!");
                    this.distance -= 2;
                    /*try {

                        nurburgring.wait();

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }*/

                } else if (distance == 22) {

                    System.out.println("The hare was a little bit tired,so it's not a big deal to sleep for a while!");
                    distance -= 2;
                    nurburgring.notify();
                    try {

                        nurburgring.wait();

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                } else {


                    try {

                        System.out.println("The hare reached the terminus!");
                        nurburgring.notify();
                        Thread.currentThread().stop();

                    } catch (Exception e) {

                        e.printStackTrace();

                    }

                }

            }

        }

    }


}


class Tortoise extends Thread {

    public Object nurburgring;
    public int distance = 100;

    public Tortoise(Object nurburgring) {

        this.nurburgring = nurburgring;

    }

    @Override
    public void run() {

        synchronized (nurburgring) {

            while (true) {

                if (this.distance > 0) {

                    nurburgring.notify();

                    System.out.println("The tortoise has ran " + (100 - this.distance) + " meters!");
                    this.distance--;

/*
                    try {

                        nurburgring.wait();

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }
*/

                } else {

                    nurburgring.notify();
                    try {

                        System.out.println("The tortoise reached the terminus!");
                        nurburgring.notify();
                        Thread.currentThread().stop();

                    } catch (Exception e) {

                        e.printStackTrace();

                    }

                }

            }

        }

    }


}








