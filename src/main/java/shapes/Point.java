package shapes;

public class Point extends Shape {

    public static final Point ORIGIN = new Point(1, 2);
    private int xPos;
    private int yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }


    public String toString() {
        return "Point{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                '}';
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }
}
