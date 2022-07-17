package 方法;


import java.util.Arrays;

import static javax.xml.stream.XMLStreamConstants.SPACE;

/*练习6：将对象作为参数传递给方法
        （1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个
        findArea()方法返回圆的面积。
        （2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义
        如下：public void printAreas(Circle c, int time)
        在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
        例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
        （3）在main方法中调用printAreas()方法，调
        用完毕后输出当前半径值。*/
public class valuePropagation_2 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(arr);
        //char[] array_3 = arr.toCharArray();
        String[] arr_1 = new String[]{"123","456","789"};
        System.out.println(arr_1);
        int[] arr_4 = new int[arr_1.length];
        for (int i = 0; i < arr_1.length; i++) {
            arr_4[i] = Integer.parseInt(arr_1[i]);
        }
        System.out.println(arr_4);

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<arr_4.length;i++){

            if(i!=arr_4.length){

                sb.append(arr_4[i]);

            }else{

                sb.append(arr_4[i]);

            }

        }
        System.out.println(sb);

    }


}
