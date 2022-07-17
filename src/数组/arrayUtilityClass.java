package 数组;


/*Arrays工具类的使用
        练习：
        1、从键盘输入本组学员的成绩，放到数组中
        2、用for循环显示所有学员的成绩
        3、排序：从低到高
        4、查找是否有正好60分的，如果有返回位置
        5、复制成绩最低三名构成新数组
        6、用工具类打印成绩最低三名成绩
        */

import java.util.Arrays;
import java.util.Scanner;

public class arrayUtilityClass {

    public static void main(String[] args) {

        int[] scores = new int[5];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {

            System.out.print("请输入第" + (i + 1) + "个学员的成绩：");
            scores[i] = input.nextInt();

        }

        System.out.println("本组学员成绩如下：");


        /*for(int j = 0;j<scores.length;j++){
            System.out.print(scores[j]+" ");
        }*/
        /*scores.stream().forEach(name -> {
            System.out.println(name);
        });*/
        for(int i:scores){
            System.out.print(i+" ");
        }

        Arrays.sort(scores);
        System.out.println("排序后的数组：" + Arrays.toString(scores));

        int index = Arrays.binarySearch(scores, 60);
        if (index < 0) {
            System.out.println("不好意思，没找到60分的喔");
        } else {
            System.out.println("找到啦！原来它在第" + index + "个位置上！");
        }


        int[] newArray = Arrays.copyOfRange(scores, 0, 3);

        System.out.println("emmmm.......最后三名的童鞋成绩是：" + Arrays.toString(newArray));


    }


}
