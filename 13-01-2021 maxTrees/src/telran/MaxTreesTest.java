package telran;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTreesTest {
    List<Point> points = new ArrayList<>();

    @Test
    void maxTrees_points1_alphaPI_1() {

        points.add(new Point(-3, 2));

        double alpha = 3.14;//2,62-150  2,35-135
        MaxTrees maxTrees = new MaxTrees();
        assertEquals(1,maxTrees.maxTrees(points, alpha));
    }
    @Test
    void maxTrees_points3_alphaPI_3() {

        points.add(new Point(1, 0));
        points.add(new Point(1, 1));
        points.add(new Point(4, -4));

        double alpha = 3.14;//2,62-150  2,35-135
        MaxTrees maxTrees = new MaxTrees();
        assertEquals(3,maxTrees.maxTrees(points, alpha));
    }

    @Test
    void maxTrees_points11_alphaPI_8() {

        points.add(new Point(1, 0));
        points.add(new Point(1, 1));
        points.add(new Point(4, 2));
        points.add(new Point(1.5, 3));
        points.add(new Point(4, -2));
        points.add(new Point(-3, 2));
        points.add(new Point(-4, -2));
        points.add(new Point(-2, -3));
        points.add(new Point(3, -1));
        points.add(new Point(4, -1));
        points.add(new Point(4, -4));
        double alpha = 3.14;//2,62-150  2,35-135
        MaxTrees maxTrees = new MaxTrees();
        assertEquals(8,maxTrees.maxTrees(points, alpha));
    }
}