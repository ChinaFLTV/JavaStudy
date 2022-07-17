package 数组;

public class getMaxNum__MinNum__AvgNum__SumNum__MassNum {


    public static void main(String[] args) {

        int[] array = new int[]{89, 56, 89, 45, 23, 56, 14, 36, 58, 96, 56, 46, 71, 91};
        int MaxNum;
        int MinNum;
        int AvgNum;
        int SumNum;
        int MassNum;

        MaxNum = getMaxNum(array);
        MinNum = getMinNum(array);
        AvgNum = getAvgNum(array);
        SumNum = getSumNum(array);
        MassNum = getMassNum(array);
        System.out.println("MaxNum:" + MaxNum);
        System.out.println("MinNum:" + MinNum);
        System.out.println("AvgNum:" + AvgNum);
        System.out.println("SumNum:" + SumNum);
        System.out.println("MassNum:" + MassNum);

    }

    public static int getMaxNum(int[] temp) {
        int MaxNum = temp[0];
        for (int i = 0; i < temp.length; i++) {

            if (MaxNum < temp[i]) {
                MaxNum = temp[i];
            }

        }
        return MaxNum;
    }

    public static int getMinNum(int[] temp) {
        int MinNum = temp[0];
        for (int i = 0; i < temp.length; i++) {

            if (MinNum > temp[i]) {
                MinNum = temp[i];
            }

        }
        return MinNum;

    }


    public static int getAvgNum(int[] temp) {

        int AvgNum;
        AvgNum = getSumNum(temp) / (temp.length);
        return AvgNum;

    }


    public static int getSumNum(int[] temp) {
        int SumNum = 0;
        for (int i = 0; i < temp.length; i++) {
            SumNum += temp[i];
        }
        return SumNum;
    }


    public static int getMassNum(int[] temp) {
        int MassNum = temp[0];
        int[] count = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {

            for (int j = i + 1; j < temp.length; j++) {

                if (temp[i] == temp[j]) {
                    count[i]++;
                }

            }


        }
        int MaxIndex = 0;
        int MaxNum = 0;
        for (int i = 0; i < count.length; i++) {
            if (MaxNum < count[i]) {

                MaxNum = count[i];
                MaxIndex = i;


            }
        }
        return temp[MaxIndex];

    }


}
