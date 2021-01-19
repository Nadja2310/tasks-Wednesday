package telran;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class maxTreas {

    int maxTreas(List<Point> pointList, int alpha) {
        if (pointList.isEmpty() || alpha == 0)
            return 0;

        Deque<Double> intervalQueue = new ArrayDeque<>();
        int max = 0;
        List<Double> pointListRadian = getCutWithPointsOnTheRadian(pointList, alpha);
        for (double points : pointListRadian) {
            intervalQueue.addLast(points);

            while (points - intervalQueue.getFirst() > alpha) {
                intervalQueue.removeFirst();
            }

            if (max < intervalQueue.size())
                max = intervalQueue.size();
        }

        return max;
    }

    private ArrayList<Double> getCutWithPointsOnTheRadian(List<Point> pointList, int alpha) {
        ArrayList<Double> cutRadian = new ArrayList<>();

        for (Point point : pointList) {
            cutRadian.add(Math.atan2(point.y, point.x));
        }
        return cutRadian;
    }

}

class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
