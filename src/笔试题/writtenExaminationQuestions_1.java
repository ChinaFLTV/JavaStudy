package 笔试题;


//编写method方法，使其打印a=100,b=200
public class writtenExaminationQuestions_1 {

    public static void main(String[] args) {


        int a = 10;
        int b = 10;

        method(a, b);

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        System.out.println("----------------优美的分割线-----------------");
        int[] array = new int[]{12, 3, 3, 34, 56, 77, 432};

        for (int i = 0; i < array.length; i++) {

            array[i] = array[i] / array[0];

        }

        for (int i : array) {

            System.out.print(i + " ");

        }
        System.out.println("");

        System.out.println("----------------优美的分割线----------------");

        int[] array_1 = new int[]{12, 3, 3, 34, 56, 77, 432};

        for (int i = array_1.length - 1; i >= 0; i--) {

            array_1[i] = array_1[i] / array_1[0];

        }

        for (int i : array_1) {

            System.out.print(i + " ");

        }
        System.out.println("");
        System.out.println("-----------优美的分割线------------");
        int[] array_2 = new int[]{12, 3, 3, 34, 56, 77, 432};

        int tempNum = array_2[0];
        for (int i = 0; i < array_2.length; i++) {

            array_2[i] = array_2[i] / tempNum;

        }
        for (int i : array_2) {

            System.out.print(i + " ");

        }
        System.out.println("");

    }

    public static void method(int a, int b) {


        a = 100;
        b = 200;

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        System.exit(0);


    }


}
