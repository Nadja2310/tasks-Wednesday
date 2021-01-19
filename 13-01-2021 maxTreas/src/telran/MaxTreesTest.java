package telran;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class maxTreasTest {
    List<Point> points = new ArrayList<>();
    @Test
    void maxTreas() {

        points.add(new Point(1, 0));
        points.add(new Point(1, 1));
        points.add(new Point(4.2, 0.2));
        points.add(new Point(1.5, 3.1));
        points.add(new Point(-55, -2));
        points.add(new Point(0.7, 17));
        double alpha = 2.62;
        MaxTrees mt = new MaxTrees();
        System.out.println(mt.maxTrees(points, alpha));
    }
    }
}