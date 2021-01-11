package telran;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxCoveredPoints_3() {
        Solution solution=new Solution();
        int[] array={2,4,8,10,11,14};
        List<Integer> numbers = Arrays.asList(2,4,8,10,11,14);
        System.out.println(solution.maxCoveredPoints(numbers,6));
        assertEquals(solution.maxCoveredPoints(numbers,6),3);
    }

    @Test
    void maxCoveredPoints_0() {
        Solution solution=new Solution();

        List<Integer> numbers = Arrays.asList(2,28,48);
        assertEquals(solution.maxCoveredPoints(numbers,15),0);
    }
}