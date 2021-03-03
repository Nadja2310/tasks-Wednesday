import java.util.*;

public class SolutionCut {
    public Map<Integer, Integer> solt(List<Cut> cuts, List<Integer> numbers) {
        Map<Integer, Integer> output = new HashMap<>();

        PointComporator pointComporator = new PointComporator();
        List<Point> points = collectListPointsandCuts(cuts, numbers);
        Collections.sort(points, pointComporator);
        int count = 0;
        for (Point elt : points) {
            if (elt.getPointkind() == Pointkind.BEGIN)
                count++;
            if (elt.getPointkind() == Pointkind.END)
                count--;
            if (elt.getPointkind() == Pointkind.POINT)
                output.put(elt.getValue(), count);
        }
        return output;
    }

    private List<Point> collectListPointsAndCuts(List<Cut> cuts, List<Integer> numbers) {
        List<Point> points = new ArrayList<>();
        for (Cut elt : cuts) {
            points.add(new Point(elt.left, Pointkind.BEGIN));
            points.add(new Point(elt.right, Pointkind.END));
        }

        for (Integer elt : numbers) {
            points.add(new Point(elt, Pointkind.POINT));
        }
        return points;
    }

    public Map<Integer, Integer> solt1(List<Cut> cuts, List<Integer> numbers) {
        Map<Integer, Integer> cutNumber = new HashMap<>();
        for (int element : numbers) {
            int value = 0;
            for (Cut cut : cuts) {
                if (cut.left <= element && cut.right >= element)
                    value++;
            }
            cutNumber.put(element, value);
        }
        return cutNumber;
    }
}

class Cut {
    int left;
    int right;

    public Cut(int left, int right) {
        this.left = left;
        this.right = right;
    }
}
