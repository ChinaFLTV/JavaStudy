package 面向对象_中;


public class polyomrphism_1 {

    public static void main(String[] args) {

        GeometricObject g_1 = new Circle_2("BLUE", 6.666, 1);
        GeometricObject g_2 = new MyRectangle("GREEN", 6.666, 4, 8);

        System.out.println(equalsArea(g_1, g_2));
        new polyomrphism_1().displayGeometricObject(g_1);
        new polyomrphism_1().displayGeometricObject(g_2);

        System.out.println("--------------exquisite segment line--------------");

        Circle_2 c = new Circle_2("white",1.0,6.666);
        Circle_2 c_1 = new Circle_2("white",1.0,1.0);

        System.out.println(c.toString());
        System.out.println(c.equalsColor(c_1));
        System.out.println(c.equalsRadius(c_1));

    }

    public static boolean equalsArea(GeometricObject g_1, GeometricObject g_2) {

        return g_1.findArea() == g_2.findArea();

    }

    public void displayGeometricObject(GeometricObject g) {

        System.out.println(g.getClass().getName() + "       " + g + " 's area is: " + g.findArea());

    }


}

class GeometricObject {

    private String color;
    private double weight;

    public GeometricObject() {

        ;

    }

    public GeometricObject(String color) {

        this();
        this.color = color;

    }

    public GeometricObject(String color, double weight) {

        this(color);
        this.weight = weight;

    }

    public void setColor(String color) {

        this.color = color;

    }

    public void setWeight(double weight) {

        this.weight = weight;

    }

    public String getColor() {

        return this.color;

    }

    public double getWeight() {

        return this.weight;

    }

    public double findArea() {

        return -1;

    }


}


class Circle_2 extends GeometricObject {

    private double radius;

    public Circle_2() {

        ;

    }

    public Circle_2(String color, double weight) {

        super(color, weight);
        //this.radius = radius;
    }

    public Circle_2(String color, double weight, double radius) {

        this(color, weight);
        //this.weight = weight;
        this.radius = radius;

    }

    public void setRadius(double radius) {

        this.radius = radius;

    }

    public double getRadius() {

        return this.radius;

    }

    public double findArea() {

        return Math.PI * Math.pow(this.radius, 2);

    }

    public boolean equalsColor(Object o) {
        if (o == this) {

            return true;

        } else {

            if (o instanceof Circle_2) {

                Circle_2 o_2 = (Circle_2) o;
                return super.getColor() == o_2.getColor();

            } else {

                return false;

            }
        }
    }

    public boolean equalsRadius(Object o) {

        if (o == this) {

            return true;

        } else {

            if (o instanceof Circle_2) {

                Circle_2 o_3 = (Circle_2) o;
                return super.findArea() == o_3.findArea();

            } else {

                return false;

            }
        }
    }


    public String toString() {

        return "This circle's radius is: " + this.getRadius();

    }

}

class MyRectangle extends GeometricObject {

    private double width;
    private double height;

    public MyRectangle() {

        ;

    }

    public MyRectangle(String color, double weight, double width, double height) {

        super(color, weight);
        this.width = width;
        this.height = height;

    }

    public void setWidth(double width) {

        this.width = width;

    }

    public void setHeight(double height) {

        this.height = height;

    }

    public double getWidth() {

        return this.width;

    }

    public double getHeight() {

        return this.height;

    }

    public double findArea() {

        return this.width * this.height;

    }


}
