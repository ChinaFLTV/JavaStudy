package 数据结构;


import java.util.Arrays;

public class cardinalSort {

    public static void main(String[] args) {

        int[] array = new int[]{45, 56, 13, 66, 78, 99, 67, 11};
        int[] array_new = cardinalSort(array);

        for (int i = 0; i < array_new.length; i++) {

            System.out.print(array_new[i] + " ");

        }

    }


    public static int[] cardinalSort(int[] temp) {

        int k = 1;

        String str = Integer.toString(temp[0]);
        int[][] tempArray = new int[10][temp.length];
        int l = 0;
        // int len = str.
        while (k < str.length()) {

            int[] tempArray_count = new int[10];

            for (int j = 0; j < temp.length; j++) {

                tempArray[temp[j] / k % 10][tempArray_count[temp[j] / k % 10]] = temp[j];

                tempArray_count[temp[j] / k % 10]++;


            }


            for (int m = 0; m < 10; m++) {


                for (int n = 0; n < tempArray_count[m]; n++) {

                    if (tempArray[m][0] == 0) {
                        continue;
                    }

                    if (l < temp.length) {
                        temp[l++] = tempArray[m][n];
                    } else {
                        break;
                    }

                }


            }

            k *= 10;


        }
        return temp;
    }

}
