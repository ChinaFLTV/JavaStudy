package 面向对象_下.circle;


//import 面向对象_下.Shape.Shape;

import 面向对象_下.Shape.Shape;

public class Circle implements Shape {

    private double Radius;

    public Circle() {

        ;

    }

    public Circle(double radius) {

        this();
        this.Radius = radius;

    }

    public void setRadius(double radius){

        this.Radius = radius;

    }

    public double getRadius(){

        return this.Radius;

    }


    public double getArea(){

        return PI*Math.pow(this.Radius,2);

    }

    public double getPerimeter(){

        return 2*PI*this.Radius;

    }


}


/*
class PPP{

    public void yun(){

        ;

    }
}

class QQQ extends PPP{

    //@override
    public void yun(){

        ;

    }
}
*/
