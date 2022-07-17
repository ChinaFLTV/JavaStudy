package 数据结构;


public class quickSort_correct {

    public static void main(String[] args) {

        int[] array = {49, 38, 65, 57, 76, 13, 27, 59};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void quickSort(int[] temp, int left, int right) {
        if (left < right) {
            int pivot = temp[left];
            int i = left;
            int j = right;
            while (i < j) {
                while ((temp[j] > pivot) && (i < j) && (j < temp.length) && (j >= 00)) {
                    j--;
                }

                temp[i] = temp[j];
                while ((temp[i] < pivot) && (i < j) && (j < temp.length) && (j >= 00)) {
                    i++;
                }

                temp[j] = temp[i];


            }

            temp[i] = pivot;

            quickSort(temp, left, i - 1);
            quickSort(temp, i + 1, right);

        } else {
            return;
        }
    }

}
