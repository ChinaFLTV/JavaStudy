package 数之间的运算;


/*用数组求出斐波那契数列的前20项值
        对10个整数进行按照从小到大的顺序排序
        求一个3*3矩阵对角线元素之和
<提示>
程序分析：利用双重for循环控制输入二维数组，再将a[i][i]累加后输出。*/
public class FibonacciSequence {

    public static void main(String[] args) {

        long[] array = new long[50];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {

            array[i] = array[i - 1] + array[i - 2];

        }

        for (long i : array) {
            System.out.print(i + " ");
        }


    }


}
