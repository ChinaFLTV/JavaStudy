package 方法;


/*4.6 再谈方法1：方法的重载(overload)
        练习4
        2.编写程序，定义三个重载方法并调用。方法名为mOL。
        三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别
        执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
        在主类的main ()方法中分别用参数区别调用三个方法。
        3.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方
        法求两个double值中的最大值，第三个方法求三个double值中的最大值，
        并分别调用三个方法。*/
public class methodOverload {

    public static void main(String[] args){

        mOL(6);
        mOL(6,8);
        mOL("???");

        max(5,6);
        max(6.666666,8.88888888);
        max(1.1,2.22,3.333);



    }

    public static void mOL(int num){

        System.out.println("一个int 参数的oML函数输出：乘积："+num*num);

    }

    public static void mOL(int num_1,int num_2){

        System.out.println("两个int 参数的oML函数输出：乘积："+num_1*num_2);

    }

    public static void mOL(String string){

        System.out.println("一个String 参数的oML函数输出：...这咋输出乘积啊，md");

    }

    public static void max(int num_1,int num_2){

        System.out.println("2个int型参数的调用：最大值："+((num_1>num_2)?num_1:num_2));

    }

    public static void max(double num_1,double num_2){

        System.out.println("2个double型的函数调用：最大值："+((num_1>num_2)?num_1:num_2));

    }

    public static void max(double num_1,double num_2,double num_3){

       System.out.println("3个double型的函数调用：最大值："+((((num_1>num_2)?num_1:num_2)>num_3)?((num_1>num_2)?num_1:num_2):num_3));

    }












}
