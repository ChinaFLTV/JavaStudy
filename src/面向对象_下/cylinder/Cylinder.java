package 面向对象_下.cylinder;


import 面向对象_下.Shape.Shape;
import 面向对象_下.circle.Circle;
public class Cylinder extends Circle implements Shape{

    private double height;

    public Cylinder(double Radius){

        super(Radius);

    }

    public Cylinder(double height,double Radius){

        this(Radius);
        this.height = height;


    }

    public void setHeight(double height){

        this.height = height;

    }

    public double getHeight(){

        return this.height;

    }

    public double getArea(){

        return (double)(super.getArea()+this.height*super.getPerimeter());

    }

    public double getVolume(){

        return super.getArea()*this.height;

    }


}
