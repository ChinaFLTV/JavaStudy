package 数组;

public class getPascalTriangle {

    public static void main(String[] args) {
        int[][] YangHuiNum = new int[10][10];
        int[][] temp_new = getPascalTriangle(YangHuiNum);

        for (int i = 0; i < 10; i++) {
            for(int j =0;j<=i;j++){
                System.out.print(temp_new[i][j]+" ");
            }
            System.out.println("");
        }

    }

    public static int[][] getPascalTriangle(int[][] temp) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {

                if (j == 0) {
                    temp[i][j] = 1;
                } else {
                    temp[i][j] = temp[i - 1][j - 1] + temp[i - 1][j];
                }

            }

        }


        return temp;
    }


}
