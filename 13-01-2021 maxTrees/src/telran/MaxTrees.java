package telran;

import java.util.*;

public class MaxTrees {

    int maxTrees(List<Point> pointList, double alpha) {
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
        // System.out.println(intervalQueue.toString());
        return max;
    }

    private ArrayList<Double> getCutWithPointsOnTheRadian(List<Point> pointList, double alpha) {
        ArrayList<Double> cutRadian = new ArrayList<>();

        for (Point point : pointList) {
            if (point.y >= 0)
                cutRadian.add(Math.atan2(point.y, point.x));
            else if (point.y < 0)
                cutRadian.add((Math.PI * 2) - Math.abs(Math.atan2(point.y, point.x)));
        }
        Collections.sort(cutRadian);

        int i = 0;
        do {
            cutRadian.add(cutRadian.get(i) + (Math.PI * 2));
            i++;
        } while (cutRadian.get(i) <= alpha);

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
