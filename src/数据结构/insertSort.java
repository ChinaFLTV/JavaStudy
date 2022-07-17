package 数据结构;


public class insertSort {

    public static void main(String[] args) {
        int[] array = new int[]{86, 1, 16, 795, 6, 78, 23, 45, 89, 23, 56, 19};
        int[] temp_new = insertSort(array);
        for (int i = 0; i < temp_new.length; i++) {
            System.out.print(temp_new[i] + " ");
        }

    }


    public static int[] insertSort(int[] temp) {

        int tempNum = 0;
        for (int i = 1; i < temp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (temp[j] > temp[i]) {
                    tempNum = temp[i];
                    for (int k = i; k >= j + 1; k--) {
                        temp[k] = temp[k - 1];
                    }
                    temp[j] = tempNum;

                }
            }


        }
        return temp;


    }

}
