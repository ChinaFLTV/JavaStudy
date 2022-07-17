package 面向对象;


/*类的成员之三：构造器(构造方法)
        练习9
        3.编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底
        边长base和高height，同时声明公共方法访问私有变量。此外，提供类
        必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。*/

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Scanner;

class Triangle {

    private double base;
    private double height;

    public Triangle() {

        ;

    }

    public Triangle(double base, double height) {

        this.base = base;
        this.height = height;

    }

    public void setBase(double base) {

        this.base = base;

    }

    public void setHeight(double height) {

        this.height = height;

    }


    public double getBase() {

        return base;

    }

    public double getHeight() {

        return height;

    }

    public double calculateTriangleArea() {

        return (base * height) / 2;

    }


}

class Student_2 {

    public String name;
    public int age;
    public String school;
    public String major;

    public Student_2() {

        ;

    }

    public Student_2(String n, int a) {

        name = n;
        age = a;

    }

    public Student_2(String n, int a, String s) {

        name = n;
        age = a;
        school = s;

    }

    public Student_2(String n, int a, String m, String s) {

        name = n;
        age = a;
        school = m;
        major = s;

    }


}

class JavaBean {

    private String name;
    private int age;

    public JavaBean() {

    }

    public void setName(String s) {

        name = s;

    }

    public void setAge(int a) {

        age = a;

    }

    public String getName() {

        return name;

    }

    public int getAge() {

        return age;

    }


}

public class constructor {

    public static void main(String[] args) throws Exception {

        while (true) {
            System.out.println("Please input your expected triangle's base below this hint: ");
            Scanner input = new Scanner(System.in);

            double base = input.nextDouble();

            System.out.println("Please now input your expected triangle's height below this hint: ");

            double height = input.nextDouble();

            Triangle tr = new Triangle(base, height);

            long startTime = System.currentTimeMillis();
            System.out.println("Your long-anticipated triangle's area is: " + tr.calculateTriangleArea() + " .");
            long endTime = System.currentTimeMillis();
            System.out.println("This calculation consumed: " + (endTime - startTime) + " ms.");

            System.out.println("----------------exquisite segment line-----------------------");
            Student_2 st = new Student_2();
            Student_2 st_1 = new Student_2("Jerry", 8);
            Student_2 st_2 = new Student_2("Tom", 18, "MIT");
            Student_2 st_3 = new Student_2("Jack", 18, "MIT", "Computer");

            System.out.println("The student named " + st.name + "\tage: " + st.age + "\tschool: " + st.school + "\tmajor: " + st.major);
            System.out.println("The student named " + st_1.name + "\tage: " + st_1.age + "\tschool: " + st_1.school + "\tmajor: " + st_1.major);
            System.out.println("The student named " + st_2.name + "\tage: " + st_2.age + "\tschool: " + st_2.school + "\t\tmajor: " + st_2.major);
            System.out.println("The student named " + st_3.name + "\tage: " + st_3.age + "\tschool: " + st_3.school + "\t\tmajor: " + st_3.major);

            BeanInfo info = Introspector.getBeanInfo(JavaBean.class);

            for (PropertyDescriptor pd : info.getPropertyDescriptors()) {

                System.out.println(pd.getName());
                System.out.println(" "+pd.getReadMethod());
                System.out.println(" "+pd.getWriteMethod());

            }

        }

    }


}
