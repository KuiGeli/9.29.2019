package shapes;


import java.util.Objects;

public class UncomparablePoint {

    private final double x;
    private final double y;

    public UncomparablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "UncomparablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }



    @Override
    public boolean equals(Object other){
        if(other == this){
            return true;
        }

        if(!(other instanceof UncomparablePoint)){
            return false;
        }


        UncomparablePoint otherPoint = (UncomparablePoint) other;
        return Double.compare(this.x, otherPoint.getX()) == 0 &&
                Double.compare(this.y, otherPoint.getY()) == 0;

    }


    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}