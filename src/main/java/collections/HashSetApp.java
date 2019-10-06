package collections;

import shapes.UncomparablePoint;
import shapes.UncomparablePoint;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {
        Set<UncomparablePoint> Points = new HashSet<>();

        UncomparablePoint p1 = new UncomparablePoint(10000, 130000);
        UncomparablePoint p2 = new UncomparablePoint(30, 12);
        UncomparablePoint p3 = new UncomparablePoint(88, 46);
        UncomparablePoint p4 = new UncomparablePoint(88, 46);


        Points.add(p1);
        Points.add(p2);
        System.out.println(Points.add(p3));
        System.out.println(Points.add(p4));

        System.out.println(Points);
    }


}
