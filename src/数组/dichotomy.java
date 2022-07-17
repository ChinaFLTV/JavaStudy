package 数组;


import 数据结构.quickSort_correct;

import java.util.Scanner;

import static 数据结构.quickSort_correct.*;

public class dichotomy {

    public static void main(String[] args) {

        int[] array = {13, 23, 45, 56, 64, 65, 66, 78, 89, 98, 97};
        //quickSort(array,0,8);
        //int index = dichotomy(array, 64);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("请输入要查找的数字");
        Scanner input = new Scanner(System.in);
        int targetNum = input.nextInt();
        int index = dichotomy(array, targetNum);
        System.out.println("您所寻找的数字在第" + (index + 1) + "的位置处（从1开始）");

    }


    public static int dichotomy(int[] temp, int targetNum) {
        int left = 0;
        int right = temp.length - 1;
        int pivot;
        while (left <= right) {

            pivot = (left + right) / 2;
            if (temp[pivot] > targetNum) {
                right = pivot - 1;

            }
            if (temp[pivot] < targetNum) {
                left = pivot + 1;

            }
            if (temp[pivot] == targetNum) {
                return pivot;
            }

        }

        return -1;
    }

}
