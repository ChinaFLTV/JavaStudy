package 方法;


import java.util.Scanner;

/*练习6：将对象作为参数传递给方法
        （1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个
        findArea()方法返回圆的面积。
        （2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义
        如下：public void printAreas(Circle c, int time)
        在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
        例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
        （3）在main方法中调用printAreas()方法，调
        用完毕后输出当前半径值。*/
class Circle {

    public double radius;

    public Circle() {
        ;
    }

    public Circle(int ra) {

        radius = ra;

    }

    public double findArea() {

        return (Math.PI) * (Math.pow(radius, 2));

    }


}

class PassObject {

    public void printAreas(Circle c, int times) {

        for (int i = 0; i < times; i++) {

            System.out.println("When the current circle's radius is " + (i + 1) + "\t,this circle's area is " + Math.PI * Math.pow(i, 2));


        }


    }


}


public class valuePropagation_3 {

    public static void main(String[] args) {

        System.out.println("circle_1's area is " + new Circle(5).findArea());

        Circle circle_1 = new Circle(5);

        double area_1 = circle_1.findArea();
        System.out.println("circle_2's area is " + area_1);

        System.out.println("请输入您想顺次打印圆面积的个数：");
        Scanner input = new Scanner(System.in);
         int times = input.nextInt();

         new PassObject().printAreas(new Circle(),times);


    }


}
