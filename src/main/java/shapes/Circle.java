package shapes;

import java.io.Serializable;

public class Circle extends Shape implements Colorable, Serializable {



    private transient Point center;

    private float radius;

    Shape sh = new Shape();

    public void computeArea() throws ShapeException {

        double area = Math.PI * radius * radius;

    }

    @Override
    public void render() {
        System.out.println("Circle rendered with color");
    }

    public void fillColor(){
        int color = sh.colorCode;

    }

    public Circle(float radius) {
        this.radius = radius;
        System.out.println("aaaa");

    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", sh=" + sh +
                '}';
    }
}
