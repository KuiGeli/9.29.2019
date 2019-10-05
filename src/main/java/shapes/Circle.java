package shapes;



public class Circle extends Shape implements Colorable{



    private Point center;

    private float radius;

    Shape sh = new Shape();

    public void compuAtearea () {

        double area = Math.PI * radius * radius;

    }

    @Override
    public void render() {
        System.out.println("Circle rendered with color");
    }

    public void fillColor(){
        int color = sh.colorCode;

    }

    public Circle(float radius, Point center) {
        this.radius = radius;
        this.center = center;
    }
}
