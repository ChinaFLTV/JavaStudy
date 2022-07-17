package 面向对象_中;


import java.io.File;
import java.util.Date;

/*5.7 Object 类的使用
         Object类是所有Java类的根父类
         如果在类的声明中未使用extends关键字指明其父类，则默认父类
        为java.lang.Object类*/
public class ObjectClass {

    public static void main(String[] args) {

        SmallObject so = new SmallObject("Taylor Swift", 37);

        SmallObject so_1 = new SmallObject("Taylor Swift", 37);

        System.out.println(so.getClass().getSuperclass().getName());
        System.out.println(so.getClass().getSuperclass());
        System.out.println(so.equals(so_1));
        System.out.println(so.toString());
        System.out.println(so.hashCode());


        System.out.println(new Object().getClass().getName());
        //System.out.println(new Object().getClass().getSuperclass().getName());
        System.out.println(new Object().toString());

        System.out.println("--------------exquisite segment line--------------");

        int i = 65;
        float f = 65.0f;
        long l = 65L;
        System.out.println((i == f) && (i == l) && (f == l));

        char c = 'A';
        System.out.println((i == c) && (f == c) && (l == c));
        char c_1 = 12;
        System.out.println(12 == c_1);

        String str_1 = new String("String");
        String str_2 = new String("String");

        String str_3 = "String";
        String str_4 = "String";

        System.out.println(str_1 == str_2);
        System.out.println(str_1.equals(str_2));

        System.out.println(str_3 == str_4);
        System.out.println(str_3.equals(str_4));
        //System.out.println("String" == new Date())
        System.out.println("---------------exquisite segment line--------------");

        Order o_1 = new Order(666, "hehe");
        Order o_2 = new Order(666, "hehe");
        Order o_3 = new Order(88, "heihei");

        System.out.println(o_1.equals(o_2));
        System.out.println(o_1.equals(o_3));

        System.out.println("----------------exquisite segment line---------------");

        MyDate md_1 = new MyDate(2022, 3, 2, 17, 39, 46);
        MyDate md_2 = new MyDate(2022, 3, 2, 6, 0, 0);
        System.out.println(md_1.equals(md_2));

        System.out.println("MyDate: " + md_1);

        System.out.println(md_1);
        System.out.println(md_1.toString());
        //System.out.println(md_1==md_1.toString());
        Integer a = 6;
        System.out.println("a= " + a);

        System.out.println("---------------exquisite segment line---------------");

        char[] charArray = new char[]{'a', 'b', 'c', 'd'};
        int[] intArray = new int[]{1, 2, 3, 4};
        double[] doubleArray = new double[]{1.111,2.222,3.333,4.444};
        long[] longArray = new long[]{1L,2L,3L,4L};
        String[] stringArray = new String[]{"China","Russia","USA","UK"};

        System.out.println(charArray);
        System.out.println(intArray);
        System.out.println(doubleArray);
        System.out.println(longArray);
        System.out.println(stringArray);


    }


}

class SmallObject {

    public String name;
    public Double num;
    public Object object;
    public File f;

    public SmallObject() {

        ;

    }

    public SmallObject(String name, double num) {

        this();
        this.name = name;
        this.num = num;

    }


}

class Order {

    public int orderId;
    public String orderName;

    public Order() {

        ;

    }

    public Order(int orderId) {
        this();
        this.orderId = orderId;

    }

    public Order(int orderId, String orderName) {

        this(orderId);
        this.orderName = orderName;

    }

    public void setter(int orderId, String orderName) {

        this.orderId = orderId;
        this.orderName = orderName;

    }

    public int getOrderId() {

        return this.orderId;

    }

    public String getOrderName() {

        return this.orderName;

    }

    public boolean equals(Object o) {

        if (this == o) {
            return true;
        } else {

            if (o instanceof Order) {
                Order o_1 = (Order) o;

                return this.orderId == o_1.orderId && this.orderName == o_1.orderName;

            } else {

                return false;

            }

        }

    }


}

class MyDate {

    public int year;
    public int month;
    public int day;
    public int hour;
    public int minute;
    public int second;

    public MyDate() {

        ;

    }

    public MyDate(int year, int month, int day, int hour, int minute, int second) {

        this();
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public boolean equals(Object o) {

        if (this == o) {

            return true;

        } else {

            if (o instanceof MyDate) {

                MyDate md = (MyDate) o;
                return (this.year == md.year) && (this.month == md.month) && (this.day == md.day);

            } else {

                return false;
            }
        }
    }


}