package shapes;

import collections.Utils;

public class Point extends Shape implements Comparable {



    public static final Point ORIGIN = new Point(1, 2);
    private double xPos;
    private double yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "Point{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                '}';
    }

    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return yPos;
    }

    @Override
    public boolean equals(Object other){
        if(other == this){
            return true;
        }

        if(!(other instanceof Point)){
            return false;
        }


        Point otherPoint = (Point) other;
        return Double.compare(this.xPos, otherPoint.getXPos()) == 0 &&
                Double.compare(this.yPos, otherPoint.getYPos()) == 0;

    }


    @Override
    public int compareTo(Object other) {
        double thisDistanceToOrigin = Utils.getThisDistanceToOrigin(this.xPos, this.yPos);
        Point otherPoint = (Point) other;
        double otherDistanceToOrigin = Utils.getThisDistanceToOrigin(otherPoint.getXPos(), otherPoint.getYPos());
        return Double.compare(thisDistanceToOrigin, otherDistanceToOrigin);
    }


}
