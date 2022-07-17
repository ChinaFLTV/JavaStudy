package 方法;


/*4.6 再谈方法3：方法参数的值传递机制
         方法，必须由其所在类或对象调用才有意义。若方法含有参数：
        形参：方法声明时的参数
        实参：方法调用时实际传给形参的参数值
         Java的实参值如何传入方法呢？
        Java里方法的参数传递方式只有一种：值传递。 即将实际参数值的副本
        （复制品）传入方法内，而参数本身不受影响。
        形参是基本数据类型：将实参基本数据类型变量的“数据值”传递给形参
        形参是引用数据类型：将实参引用数据类型变量的“地址值”传递给形参*/
public class valuePropagation {

    public static void main(String[] args) {
        //基本数据类型值传递
        int x = 5;
        System.out.println("before change:" + x);

        change(x);
        System.out.println("after change:" + x);
        //引用数据类型值传递
        Person p = new Person(5);
        System.out.println("before change:" + p.age);
        change(p);
        System.out.println("after change:" + p.age);


    }

    public static void change(int num) {

        num = 8;

    }

    public static void change(Person obj) {

        System.out.println("in change:before alter:" + obj.age);
        obj.age = 6;
        System.out.println("in change:before alter:" + obj.age);

    }

}

class Person {

    int age;

    public Person(int ag) {
        age = ag;


    }

}
