package 数组;

public class reverse {


    public static void main(String[] args) {

        int[] array = new int[]{89, 45, 23, 18, 19, 174, 628, 743, 564, 5916578, 62};
        int[] reverseArray = reverse_2(array);
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.print(reverseArray[i] + " ");
        }
        System.out.println("");

    }


    public static int[] reverse_1(int[] temp) {

        int[] reverseArray = new int[temp.length];

        for (int i = temp.length - 1; i >= 0; i--) {

            reverseArray[temp.length - i - 1] = temp[i];

        }

        return reverseArray;
    }


    public static int[] reverse_2(int[] temp) {
        int tempNum = 0;
        if (temp.length % 2 == 0) {

            for (int i = 0; i < temp.length / 2; i++) {

                tempNum = temp[i];
                temp[i] = temp[temp.length - 1 - i];
                temp[temp.length - 1 - i] = tempNum;

            }


        } else {
            for (int i = 0; i < temp.length / 2; i++) {

                tempNum = temp[i];
                temp[i] = temp[temp.length - 1 - i];
                temp[temp.length - 1 - i] = tempNum;

            }
        }
        return temp;
    }


}
