package 数组;


public class getRandomDigit_between1And30_official {

    public static void main(String[] args) {

        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random()) * 30 + 1;

            for (int j = 0; j < i; j++) {

                if (array[i] == array[j]) {

                    i--;
                    System.out.println("出现随机数相同情况！");
                    break;
                }

            }


        }

        for (int i : array) {
            System.out.print(array[i] + " ");
        }


    }


}
