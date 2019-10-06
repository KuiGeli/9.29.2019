package collections;

import shapes.Point;

import java.util.ArrayList;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {

        List<Point> points = new ArrayList<>();

        Point p1 = new Point(12,10);

        points.add(p1);
        points.add(new Point(30, 15));
        points.add(new Point(90,60));

        System.out.println(String.format(("There are '%s' elements in the point list."), String.valueOf(points.size())));
        System.out.println(points);

        points.remove(p1);

        System.out.println(String.format(("There are '%s' elements in the point list."), String.valueOf(points.size())));
        System.out.println(points);

    }


}
