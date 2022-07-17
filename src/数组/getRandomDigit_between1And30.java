package 数组;


import java.util.Random;

public class getRandomDigit_between1And30 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array_new = MathRandom();


        for (int i : array_new) {
            array_new[i] = random.nextInt(29)+1;
            System.out.print(array_new[i] + " ");

        }


    }

    public static int[] MathRandom() {

        int[] temp = new int[30];

        for (int i : temp) {

            temp[i] = (int) (Math.random() * 30);

        }

        return temp;

    }


}
