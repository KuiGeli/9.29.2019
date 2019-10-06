package collections;

import shapes.UncomparablePoint;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp2 {

    public static void main(String[] args) {
        Comparator<UncomparablePoint> comparator = new Comparator<UncomparablePoint>() {

            @Override
            public int compare(UncomparablePoint o1, UncomparablePoint o2) {
                return 0;
            }
        };

        Queue<UncomparablePoint> uncomparablePoints = new PriorityQueue<>();

        UncomparablePoint p1 = new UncomparablePoint(15, 13);


    }


}
