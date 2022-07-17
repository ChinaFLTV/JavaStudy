package 面向对象_下;


import 面向对象_下.Shape.Shape;
import 面向对象_下.circle.Circle;
import 面向对象_下.cylinder.Cylinder;

public class X5_3_6 {

    public static void main(String [] args){

        Circle c = new Circle(6.666);
        Cylinder cy =new Cylinder(8.888,6.666);
        System.out.println(c.getArea());
        System.out.println(cy.getArea());
        System.out.println(cy.getVolume());
        System.out.println(cy.getPerimeter());



    }


}
