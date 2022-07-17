package 面向对象;

import java.util.Scanner;

/*
Java的内存管理之垃圾回收（了解）
        分配：由JVM自动为其分配相应的内存空间
        释放：由JVM提供垃圾回收机制自动的释放内存空间
        垃圾回收机制（GC：Garbage Collection）：将垃圾对象所占用的堆内存进行回收。Java的垃圾回收机制是JVM提供的能力，由单独的系统级垃圾回收线程在空闲时间以不定时的方式动态回收。
        垃圾对象：不再被任何引用指向的对象。

        面试题：
        问：在程序中是否可以通知垃圾回收机制过来回收垃圾？
        能，通过调用System.gc();或Runtime.getRuntime().gc();

        再问：调用了System.gc();或Runtime.getRuntime().gc();后是立刻执行垃圾回收吗？
        不是，该调用并不会立刻启动垃圾回收机制开始回收，但会加快垃圾回收机制的运行。*/
public class GarbageCollection {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {

            Garbage g = new Garbage();
            System.out.println("Create and initialize a new garbage.");

        }

        System.gc();

        for (int i = 0; i < 10; i++) {

            Thread.sleep(1);
            System.out.println("I'm alive......");

        }

        int i = 0;
        for (foo('A'); foo('B') && i < 2; foo('C')) {

            i++;
            foo('D');

        }

        System.out.println("------------------exquisite segment line-------------------");

        show(0);
        show(1);
        System.out.println("---------------------exquisite segment line-----------------------");

        System.out.println("Please input cylinder's radius: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        System.out.println("Please input cylinder's height: ");

        double height = input.nextDouble();

        Cylinder c = new Cylinder();

        c.setRadius__Height(radius, height);

        System.out.println("----------------exquisite segment line-----------------");

        int m = 0;
        m = m++;
        System.out.println("m= " + m);

        System.out.println("-------------exquisite segment line-----------------");
        Test t = new Test();
        t.f();

    }

    public static boolean foo(char c) {

        System.out.print(c);
        return true;

    }

    public static void show(int i) {

        switch (i) {

            default:
                i += 2;
            case 1:
                i += 1;
            case 4:
                i += 8;
            case 2:
                i += 4;

        }

        System.out.println("i = " + i);


    }


}

class Garbage {

    public void finalize() {
        System.out.println("Gently I walked away .");
    }

}

class Cylinder {

    private double radius;
    private double height;

    public Cylinder() {

        ;

    }

    public Cylinder(double height) {

        this();
        this.height = height;

    }

    public Cylinder(double radius, double height) {

        this(height);
        this.radius = radius;

    }

    public void setRadius(double radius) {

        this.radius = radius;

    }

    public void setHeight(double height) {

        this.height = height;

    }

    public boolean setRadius__Height(double radius, double height) {

        if (radius <= 0 && height <= 0) {

            System.out.println("The input data is wrong.");
            return false;

        } else {

            setRadius(radius);
            setHeight(height);
            printInformationOfCylinder();
            return true;

        }

    }

    public double getRadius_1() {

        return this.radius;

    }

    public double getHeight_1() {

        return this.height;

    }

    public double getBaseArea() {

        return Math.PI * Math.pow(this.radius, 2);

    }

    public double getVolume() {

        return getBaseArea() * height;

    }

    public void printInformationOfCylinder() {

        System.out.println("This cylinder's radius is:　" + this.radius + "\t\t" + "Its height is:　" + this.height + "\t\t" + "Its basearea is: " + getBaseArea() + "\t\t" + "Its volume is: " + getVolume());

    }


}

class Test {

    public int a;
    public int b;

    public void f() {

        a = 0;
        b = 0;
        int[] c = {0};
        g(b, c);
        System.out.println("a= " + a + " b= " + b + " c= " + c[0]);

    }

    public void g(int b, int[] c) {

        a = 1;
        b = 1;
        c[0] = 1;

    }


}
