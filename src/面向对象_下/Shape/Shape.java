package 面向对象_下.Shape;

public interface Shape {

    public final double PI  = Math.PI;

 /*   default void setter(double pi){

        Interface.this.PI = pi;
    }*/

    default double getArea(){

        return -1;

    }

}
/*
abstract class test{

    public final int PI;

    public test(int pi){

        this.PI = pi;
    }
}*/
