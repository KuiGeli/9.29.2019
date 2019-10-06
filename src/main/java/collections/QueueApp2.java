package collections;

import shapes.UncomparablePoint;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp2 {

    public static void main(String[] args) {
        Comparator<UncomparablePoint> comparator = new Comparator<UncomparablePoint>() {

            @Override
            public int compare(UncomparablePoint p1, UncomparablePoint p2) {
                double p1DistanceToOrigin = Utils.getThisDistanceToOrigin(p1.getX(), p1.getY());
                double p2DistanceToOrigin = Utils.getThisDistanceToOrigin(p2.getX(), p2.getY());
                return Double.compare(p1DistanceToOrigin, p2DistanceToOrigin);

            }
        };

        Queue<UncomparablePoint> uncomparablePoints = new PriorityQueue<>(comparator);


        UncomparablePoint p1 = new UncomparablePoint(10000, 130000);
        UncomparablePoint p2 = new UncomparablePoint(30, 12);
        UncomparablePoint p3 = new UncomparablePoint(88, 46);

        uncomparablePoints.add(p1);
        uncomparablePoints.add(p2);
        uncomparablePoints.add(p3);

        System.out.println(uncomparablePoints);

        while (!uncomparablePoints.isEmpty()){
            uncomparablePoints.poll();
            System.out.println(uncomparablePoints);
        }


    }


}
