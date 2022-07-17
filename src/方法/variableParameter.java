package 方法;


/*4.6 再谈方法2：可变个数的形参
        JavaSE 5.0 中提供了Varargs(variable number of arguments)机制，允许直接定
        义能和多个实参相匹配的形参。从而，可以用一种更简单的方式，来传递个数可
        变的实参。
//JDK 5.0以前：采用数组形参来定义方法，传入多个同一类型变量
public static void test(int a ,String[] books);
//JDK5.0：采用可变个数形参来定义方法，传入多个同一类型变量
public static void test(int a ,String…books);

        4.6 再谈方法2：可变个数的形参
        说明：
        1. 声明格式：方法名(参数的类型名 ...参数名)
        2. 可变参数：方法参数部分指定类型的参数个数是可变多个：0个，1个或多个
        3. 可变个数形参的方法与同名的方法之间，彼此构成重载
        4. 可变参数方法的使用与方法参数部分使用数组是一致的
        5. 方法的参数部分有可变形参，需要放在形参声明的最后
        6. 在一个方法的形参位置，最多只能声明一个可变个数形参*/
public class variableParameter {

    public static void test(String[] msg) {

        System.out.println("以字符串数组为参数的test函数方法调用：参数：" + msg.toString());

    }

    public static void test_1(String book) {

        System.out.println("以String为参数的test_1函数方法调用：参数：" + book);

    }

    public static void test_1(String... book) {

        System.out.println("以String可变参数为参数的test_函数方法调用" + book);

    }


    public static void main(String[] args) {

        test(new String[]{"beibei", "jingjing", "huanhuan", "yingying", "nini"});
        test_1("together for a shared future");
        test_1("一起", "向", "未来");
        test_1("一", "起", "向", "未", "来");

    }


}
