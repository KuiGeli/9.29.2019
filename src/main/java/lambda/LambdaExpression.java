package lambda;

import shapes.UncomparablePoint;

import java.util.Comparator;

import static collections.Utils.getThisDistanceToOrigin;

public class LambdaExpression {

    Comparator<UncomparablePoint> comparator = (point1, point2) -> {
        double point1DistanceToOrigin = getThisDistanceToOrigin(point1.getX(), point1.getY());
        double point2DistanceToOrigin = getThisDistanceToOrigin(point2.getX(), point2.getY());
        return Double.compare(point1DistanceToOrigin, point2DistanceToOrigin);
    };



}
