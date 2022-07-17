package 方法;


import java.util.Scanner;

/*4.6 再谈方法4：递归(recursion)方法
        练习 7
        练习7.1：请用Java写出递归求阶乘(n!)的算法
        练习7.2：已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0
        的整数，求f(10)的值。
        练习7.3：已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
        其中n是大于0的整数，求f(10)的值。
        练习7.4：输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
        1 1 2 3 5 8 13 21 34 55
        规律：一个数等于前两个数之和
        要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来*/
public class recursion {

    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入要求阶乘的自然数n:");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            System.out.println("the n's recursion is " + new recursion().factorial(n));
            System.out.println("---------------exquisite segment line----------------");

            System.out.println("Please input your expected num below this hint: ");
            int m = input.nextInt();
            System.out.println("This funtion with a parameter which you inputted a while back,now its result is " + getFunctionResult(m));

            System.out.println("Please input your expected num below this hint: ");
            int l = input.nextInt();
            System.out.println("This  function with a parameter which you inputted a while back,now its result is " + getFunctionResult_1(l));

        }

    }


    public long factorial(int num) {

        if (num > 1) {
            return num * factorial(num - 1);
        } else {
            return num * 1;
        }


    }

    public static int getFunctionResult(int num) {

        if (num == 0) {

            return 1;

        } else if (num == 1) {

            return 4;

        } else {

            return 2 * getFunctionResult(num - 1) + getFunctionResult(num - 2);

        }


    }

   /* public static void getFunctionResult_total(int num) {

        if (num >= 22) {

            System.out.println("the f(" + num + ") = " + getFunctionResult_greaterThan21(num));

        }

    }*/

    public static int getFunctionResult_1(int num) {

        if (num >= 22) {

            return 2 * getFunctionResult_1(num - 1) + getFunctionResult_1(num - 2);

        } else if (num == 21) {

            return 4;

        } else if (num == 20) {

            return 1;

        } else {

            return getFunctionResult_1(num + 2) - 2 * getFunctionResult_1(num + 1);

        }


    }


}
