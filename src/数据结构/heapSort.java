package 数据结构;


public class heapSort {

    public static void main(String[] args) {

        int[] array = new int[]{19, 59, 46, 23, 89, 73, 19, 56, 99, 12, 45};
        int[] array_1 = new int[array.length];

        //int[] temp_1 = heapInitialize(array, 0);
        int[] temp_new = heapSort(array);
        for (int i = 0; i < temp_new.length; i++) {

            System.out.print(temp_new[i] + " ");

        }

    }

    public static int[] heapInitialize(int[] temp, int lastIndex) {

        for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
            int k = i;
            if (2 * k + 1 <= lastIndex) {
                int biggerIndex = 2 * k + 1;
                if (2 * k + 1 < lastIndex) {

                    if (temp[2 * k + 1] - temp[2 * k + 2] < 0) {
                        biggerIndex++;
                    }

                }
                if (temp[k] < temp[biggerIndex]) {

                    int tempNum = temp[k];
                    temp[k] = temp[biggerIndex];
                    temp[biggerIndex] = tempNum;

                }

            }


        }

        return temp;

    }


    public static int[] heapSort(int[] temp) {
        for(int i = 0;i<temp.length;i++){

            heapInitialize(temp,temp.length-1-i);
            int tempNum = temp[0];
            temp[0] = temp[temp.length-1-i];
            temp[temp.length-1-i] = tempNum;


        }


        return temp;
    }


}
