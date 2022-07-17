package 数据结构;


public class bubbleSort {

    public static void main(String[] args) {

        int[] array = new int[]{56, 1, 89, 56, 23, 78, 46, 13, 79, 19, 3, 45, 56};
        int[] temp_new = bubbleSort(array);
        for (int i = 0; i < temp_new.length; i++) {
            System.out.print(temp_new[i] + " ");
        }

    }

    public static int[] bubbleSort(int[] temp) {

        int tempNum;
        for (int i = 0; i < temp.length; i++) {

            for (int j = 1; j < temp.length - i; j++) {

                if (temp[j] < temp[j - 1]) {
                    tempNum = temp[j];
                    temp[j] = temp[j - 1];
                    temp[j - 1] = tempNum;
                }


            }

        }
        return temp;


    }


}
