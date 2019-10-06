package collections;
import shapes.Point;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {

    public static void main(String[] args) {
        Set<Point> points = new TreeSet<>();

        Point p1 = new Point(10000, 130000);
        Point p2 = new Point(30, 12);
        Point p3 = new Point(88, 46);
        Point p4 = new Point(88, 46);

        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);

        System.out.println(points);

        System.out.println(points.remove(new Point(88, 46)));
        System.out.println(points);

    }

}
