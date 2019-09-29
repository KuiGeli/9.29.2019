package shapes;



public class Circle extends Shape{




    private Point center;

    private float radius;

    Shape sh = new Shape();

    public void compuAtearea () {

        double area = Math.PI * radius * radius;

    }


    public void fillColor(){
        int color = sh.colorCode;

    }

    public Circle(float radius, Point center) {
        this.radius = radius;
        this.center = center;
    }
}
