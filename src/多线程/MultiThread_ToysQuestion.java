package 多线程;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/18 下午 7:19
 * *@Description This is a description of MultiThread_ToysQuestion
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class MultiThread_ToysQuestion {

    public static void main(String[] args) {


        ToyAmount ta = new ToyAmount(1000);
        ToyProduce t1 = new ToyProduce(ta);
        ToyConsume t2 = new ToyConsume(ta);
        t1.start();
        t2.start();

    }


}


class ToyAmount {

    public static int amount;

    public ToyAmount(int toyAmount) {

        this.amount = toyAmount;

    }

}

class ToyProduce extends Thread {

    ToyAmount toyAmount = null;

    public ToyProduce(ToyAmount toyAmount) {

        this.toyAmount = toyAmount;

    }

    @Override
    public void run() {

        synchronized (toyAmount) {

            while (true) {

                if (toyAmount.amount < 3) {

                    toyAmount.notify();
                    toyAmount.amount += 50;
                    System.out.println("Produce 50 toys!\t\tThe current amount of toys is : " + toyAmount.amount);

                    try {

                        //Thread.currentThread().sleep(200);
                        toyAmount.wait();

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                } else {

                    try {

                        toyAmount.notify();
                        toyAmount.wait();

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                }

            }


        }

    }


}

class ToyConsume extends Thread {

    public ToyAmount toyAmount = null;

    public ToyConsume(ToyAmount toyAmount) {

        this.toyAmount = toyAmount;

    }

    @Override
    public void run() {

        synchronized (toyAmount) {

            while (true) {

                if (toyAmount.amount >= 3) {

                    toyAmount.notify();
                    toyAmount.amount -= 3;
                    System.out.println("Consume 3 toys!\t\tThe current amount of toys is : " + toyAmount.amount);

                } else {

                    try {

                        toyAmount.notify();
                        toyAmount.wait();

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                }

            }


        }
    }


}
