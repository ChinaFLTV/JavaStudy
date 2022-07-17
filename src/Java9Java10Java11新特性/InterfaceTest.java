package Java9Java10Java11新特性;

import org.junit.Test;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/15 下午 6:53
 * *@Description This is a description of InterfaceTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class InterfaceTest {


    @Test
    public static void main(String[] args) {

        Test1 t = new Test1();
        t.methodTest();

    }

}

interface InterfaceEnhance {

    public static final String name = "miraculous";
    public static final int age = 666;

    public default void init() {

        System.out.println("miraculous");

    }

    public default void methodTest(){

        init();

    }

    public abstract void hehe();



}

class Test1 implements InterfaceEnhance{

    @Override
    public void hehe(){

        System.out.println("hehe");

    }


}



