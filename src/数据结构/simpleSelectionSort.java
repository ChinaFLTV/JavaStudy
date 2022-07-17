package 数据结构;


public class simpleSelectionSort {

    public static void main(String[] args) {

        int[] array = new int[]{56, 78, 32, 12, 56, 78, 56, 89, 45, 78, 89, 55, 12, 35, 91, 73, 46, 82};
        int[] temp_new = simpleSelectionSort(array);
        for(int i = 0;i<temp_new.length;i++){
            System.out.print(temp_new[i]+" ");
        }


    }


    public static int[] simpleSelectionSort(int[] temp) {

        //boolean flag = false;
        int minNum = temp[0];
        int minNumIndex = 0;

        for (int i = 0; i < temp.length; i++) {

            for (int j = i; j < temp.length; j++) {

                if (minNum > temp[j]) {

                    minNum = temp[j];
                    minNumIndex = j;

                }


            }
            if (minNumIndex != i) {

                int tempNum = temp[i];
                temp[i] = temp[minNumIndex];
                temp[minNumIndex] = tempNum;


            }
            if (i != temp.length - 1) {
                minNum = temp[i + 1];
                minNumIndex = i + 1;

            }
        }


        return temp;

    }


}
