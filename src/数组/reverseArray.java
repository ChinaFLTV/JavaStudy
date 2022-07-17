package 数组;


import java.util.Arrays;
import java.util.Random;

public class reverseArray {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(100) + 1;

        }

        System.out.println("反转前数组：" + Arrays.toString(array));

        int[] array_new = reverse(array);

        System.out.println("反转后数组：" + Arrays.toString(array));


    }

    public static int[] reverse(int[] temp) {

        if (temp.length % 2 == 0) {

            for (int i = 0; i < temp.length / 2; i++) {
                int tempNum = temp[i];
                temp[i] = temp[temp.length - 1 - i];
                temp[temp.length-1-i] = tempNum;
            }

        } else {

            for (int i = 0; i < temp.length / 2; i++) {

                int tempNum = temp[i];
                temp[i] = temp[temp.length-1-i];
                temp[temp.length-1-i] = tempNum;

            }

        }


        return temp;
    }


}
