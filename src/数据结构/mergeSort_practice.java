package 数据结构;


import 数据结构.mergeSort_2__road.*;

import static jdk.nashorn.internal.objects.NativeMath.log;

public class mergeSort_practice {

    public static void main(String[] args) {

        int[] array = new int[]{56, 23, 45, 89, 78, 56, 91, 82, 16};
        int[] array_new = new int[array.length];
        mergeSortPractice(array, array_new, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }


    }

    public static void mergeSortPractice(int[] temp, int[] temp_new, int left, int right) {

        if (left < right) {
            int pivot = (left + right) / 2;
            mergeSortPractice(temp, temp_new, left, pivot);
            mergeSortPractice(temp, temp_new, pivot + 1, right);

            mergeSort_overwrite(temp, temp_new, left, pivot, right);
        }

    }


    public static void mergeSort_overwrite(int[] temp, int[] temp_new, int left, int pivot, int right) {

        int i = left;
        int j = pivot + 1;
        int k = left;
        int l = left;
        while ((i <= pivot) && (j <= right)) {


            if (temp[i] > temp[j]) {
                temp_new[k++] = temp[j++];
            } else if (temp[i] < temp[j]) {
                temp_new[k++] = temp[i++];
            } else {
                temp_new[k++] = temp[i++];
                temp_new[k++] = temp[j++];
            }

        }


        while (j <= right) {

            temp_new[k++] = temp[j++];

        }

        while (i <= pivot) {

            temp_new[k++] = temp[i++];

        }

        while(l<=right){
            temp[l] = temp_new[l++];
        }


    }

}
