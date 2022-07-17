package 面向对象;


/*
3.1 编写程序，声明一个method方法，在方法中打印一个10*8 的*型矩形，
        在main方法中调用该方法。
        3.2 修改上一个程序，在method方法中，除打印一个10*8的*型矩形外，再
        计算该矩形的面积，并将其作为方法返回值。在main方法中调用该方法，
        接收返回的面积值并打印。
        3.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个
        m*n的*型矩形，并计算该矩形的面积， 将其作为方法返回值。在main方法
        中调用该方法，接收返回的面积值并打印。
*/
import java.util.Scanner;

public class methodPractice {

    public static void main(String[] args) {

        printGraph pg = new printGraph();
        pg.printRectangle();
        pg.calculateRectangleArea();
        printGraph pg_1 = new printGraph();
        pg_1.readMaxHigh__MaxWidth();
        pg_1.printRectangle();
        pg_1.calculateRectangleArea();


    }


}


class printGraph {

    private int high;
    private int width;
    private int maxHigh;
    private int maxWidth;

    public printGraph() {

    }

    public void printRectangle() {

        for (high = 0; high < maxHigh; high++) {

            for (width = 0; width < maxWidth; width++) {

                System.out.print("*");

            }
            System.out.println("");

        }

    }

    public void calculateRectangleArea() {

        System.out.println("矩形的面积是：" + high * width + " *^2");

    }


    public void readMaxHigh__MaxWidth() {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入要打印矩形的长度：");

        maxHigh = input.nextInt();

        System.out.println("请输入要打印矩形的宽度：");

        maxWidth = input.nextInt();


    }


}
