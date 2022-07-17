package 方法;

import java.util.Scanner;

/*
练习7.4：输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
        1 1 2 3 5 8 13 21 34 55
        规律：一个数等于前两个数之和
        要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来*/
public class recursion_calculateFibonacciResult {

    public static int count = 0;

    public static void main(String[] args) {

        while (true) {
            System.out.println("Please input your expected Fibonacci num's position below this hint: ");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();

            long startTime = System.currentTimeMillis();
            System.out.println("You specified position's value of Fibonacci sequence is: " + getValueOfFibonacciSequence(n));
            long endTime = System.currentTimeMillis();
            System.out.println("This calculation totally calculated " + count + " times.");
            System.out.println("This calculation consumed: " + (endTime - startTime) + "ms.");
        }

    }

    public static long getValueOfFibonacciSequence(int index) {




        if ((index - 1) >= 0) {

            if (((index - 1) == 0) || ((index - 1) == 1)) {

                count++;

                return 1;

            } else {

                if ((((index - 1) - 1) >= 0) && (((index - 1) - 2) >= 0)) {

                    count++;

                    return getValueOfFibonacciSequence(index - 1) + getValueOfFibonacciSequence(index - 2);

                } else {

                    count++;

                    return 0;

                }

            }

        } else {

            return 0;

        }
    }


}
