package collections;

import shapes.Point;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {

    public static void main(String[] args) {

        Queue<Point> queue = new PriorityQueue<>();



        Point p1 = new Point(10000, 130000);
        Point p2 = new Point(30, 12);
        Point p3 = new Point(88, 46);

        queue.add(p1);
        queue.add(p2);
        queue.add(p3);

        System.out.println(queue);

       while (!queue.isEmpty()){
            queue.poll();
            System.out.println(queue);
        }

    }


}
