package 面向对象_下;


import javax.print.DocFlavor;
import javax.print.attribute.standard.MediaSize;

public class Final {

    public static int num = 6;
    public final static String HEHE = "HEHE";
    public final int ID = 666;

    public static void main(String[] args) {

        //A.class.getClass().getName();

        Final f = new Final();
        final int I = 10;
        final int J;
        J = 20;
        //J = 30;


        Other o = new Other();

        new Final().addOne(o);

    }

    public void addOne(final Other w){

        //w= new Other();
        w.i++;

    }


}

final class A {

    public final int num = 0;

    public A() {

        final int num_ = 5;

    }


}


/*final class B extends A{

    ;

}*/

class B {

    public final void method() {

        ;

    }
}

class C extends B {

    /*public final void method(){

        ;

    }*/

    public final String NAME = "atguigu";

    static {

        //NAME = "尚硅谷";

    }


}

class Person_1{

    public int Something(final int x){

        return x+1;
        //return ++x;

    }
}

class Other{

    public int i;

}


