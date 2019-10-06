package collections;
import shapes.UncomparablePoint;

import java.util.HashMap;
import java.util.Map;

public class MapApp {


    public static void main(String[] args) {

        Map<UncomparablePoint, String> descriptionByPoint = new HashMap<>();

        UncomparablePoint p1 = new UncomparablePoint(10000, 130000);
        UncomparablePoint p2 = new UncomparablePoint(30, 12);
        UncomparablePoint p3 = new UncomparablePoint(88, 46);
        UncomparablePoint p4 = new UncomparablePoint(88, 46);

        descriptionByPoint.put(p1, "P1");
        descriptionByPoint.put(p2, "P2");
        descriptionByPoint.put(p3, "P3");
        descriptionByPoint.putIfAbsent(p4, "P4");

        System.out.println(descriptionByPoint);

    }
}