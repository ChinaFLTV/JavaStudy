package 数据结构;


public class mergeSort_2__road {

    public static void main(String[] args) {

        int[] array_1 = new int[]{13, 23, 45, 56, 78, 89, 99};
        int[] array_2 = new int[]{33, 44, 55, 66, 77, 88};

        int[] array_new = mergeSort(array_1, array_2);

        for (int i = 0; i < array_new.length; i++) {
            System.out.print(array_new[i] + " ");
        }

    }

    public static int[] mergeSort(int[] array_1, int[] array_2) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] array_new = new int[array_1.length + array_2.length];

        while ((i < array_1.length || j < array_2.length)&&(k<array_new.length)) {

            while ((i < array_1.length) && (j < array_2.length)) {
                if (array_1[i] < array_2[j]) {

                    array_new[k] = array_1[i];
                    i++;
                    k++;

                } else if (array_1[i] > array_2[j]) {

                    array_new[k] = array_2[j];
                    j++;
                    k++;

                } else {

                    array_new[k] = array_1[i];
                    i++;
                    k++;
                    array_new[k] = array_2[j];
                    j++;
                    k++;

                }
            }

            if ((i >= array_1.length) && (j < array_2.length) && (k < array_new.length)) {
                for (int m = j; m < array_2.length; m++) {

                    array_new[k] = array_2[m];
                    k++;

                }
            }

            if ((j >= array_2.length) && (i < array_1.length) && (k < array_new.length)) {
                for (int n = i; n < array_1.length; n++) {

                    array_new[k] = array_1[n];
                    k++;


                }
            }


        }

        return array_new;
    }


}
