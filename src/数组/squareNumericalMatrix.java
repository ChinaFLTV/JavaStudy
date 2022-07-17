package 数组;


import java.util.Scanner;

public class squareNumericalMatrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要打印的回型数阵大小：");
        int n = input.nextInt();

        int[][] array = new int[n][n];
        int[] array_k = new int[4];

        int i = 1;
        int k = -1;
        int startIndex_x = 0;
        int startIndex_y = 0;
        while ((i <= n * n) && (startIndex_x >= 0 && startIndex_x < n) && (startIndex_y >= 0 && startIndex_y < n)) {

            if (startIndex_x == array_k[0] && startIndex_y == array_k[0]) {
                k = 1;
            } else if (startIndex_x == (n - 1) - array_k[1] && startIndex_y == array_k[1]) {
                k = 2;
            } else if (startIndex_x == (n - 1) - array_k[2] && startIndex_y == (n - 1) - array_k[2]) {
                k = 3;
            } else if (startIndex_x == array_k[3] && startIndex_y == (n - 1) - array_k[3]) {
                k = 4;
            }
            if (n % 2 == 0) {
                if ((startIndex_x == n / 2 - 1) && (startIndex_y == n / 2)) {
                    array[startIndex_y][startIndex_x] = n*n;
                    break;
                }
            } else {
                if ((startIndex_x == n / 2) && (startIndex_y == n / 2)) {
                    array[startIndex_y][startIndex_x] = n*n;
                    break;
                }
            }


            if (k == 1) {
                int m = 0;

                for (m = 0; m < n + 1 - 2 * (array_k[0] + 1); m++) {

                    array[startIndex_y][startIndex_x] = i;
                    i++;


                    startIndex_x++;


                }
                array_k[0]++;


            }


            if (k == 2) {
                int m = 0;

                for (m = 0; m < n + 1 - 2 * (array_k[1] + 1); m++) {


                    array[startIndex_y][startIndex_x] = i;
                    i++;


                    startIndex_y++;


                }
                array_k[1]++;


            }


            if (k == 3) {
                int m = 0;

                for (m = 0; m < n + 1 - 2 * (array_k[2] + 1); m++) {

                    array[startIndex_y][startIndex_x] = i;
                    i++;


                    startIndex_x--;

                }
                array_k[2]++;


            }

            if (k == 4) {
                int m = 0;

                for (m = 0; m < n + 1 - 2 * (array_k[3] + 1); m++) {

                    array[startIndex_y][startIndex_x] = i;
                    i++;


                    startIndex_y--;


                }
                array_k[3]++;
                startIndex_x = array_k[0];
                startIndex_y = array_k[0];


            }

            k = -1;



        }

        for (int l = 0; l < n; l++) {
            for (int j = 0; j < n; j++) {

                System.out.print(array[l][j] + "\t");

            }
            System.out.println("");
        }


    }


}
