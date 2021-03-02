import java.util.Comparator;

public class PointComporator implements Comparator<Point> {
    @Override
    public int compare(Point point1, Point point2) {
        int res = point1.getValue() - point2.getValue();
        int priority1 = 0;
        int priority2 = 0;
        if (res == 0) {
            if (point1.getPointkind() == Pointkind.BEGIN)
                priority1 = 2;
            if (point1.getPointkind() == Pointkind.POINT)
                priority1 = 1;
            if (point1.getPointkind() == Pointkind.END)
                priority2 = 0;
            if (point2.getPointkind() == Pointkind.BEGIN)
                priority2 = 2;
            if (point2.getPointkind() == Pointkind.POINT)
                priority2 = 1;
            if (point2.getPointkind() == Pointkind.END)
                priority2 = 0;
        } else return res;
        return priority2 - priority1;
    }
}
