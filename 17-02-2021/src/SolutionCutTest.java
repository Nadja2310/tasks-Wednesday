import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SolutionCutTest {


    SolutionCut solt = new SolutionCut();
    final List<Integer> NUMBERS = Arrays.asList(2, 4, 8, 10, 11, 14);


    @org.junit.jupiter.api.Test
    void test_regular1() {
        Cut cut1 = new Cut(1, 5);
        Cut cut2 = new Cut(2, 5);
        Cut cut3 = new Cut(3, 5);
        Cut cut4 = new Cut(10, 15);
        List<Cut> listCuts = Arrays.asList(cut1, cut2, cut3, cut4);
        Map<Integer, Integer> map = solt.solt(listCuts, NUMBERS);
        List<Integer> expectedValue = Arrays.asList(2, 3, 0, 1, 1, 1);

        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            assertEquals(NUMBERS.get(i), entry.getKey());
            assertEquals(expectedValue.get(i), entry.getValue());
            i++;
        }
    }

    @org.junit.jupiter.api.Test
    void test_oneCut() {
        Cut cut1 = new Cut(19, 25);
        List<Integer> numbers = Arrays.asList(2);
        List<Cut> listCuts = Arrays.asList(cut1);
        Map<Integer, Integer> map = solt.solt(listCuts, numbers);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            assertEquals(2, entry.getKey());
            assertEquals(0, entry.getValue());
        }
    }

    @org.junit.jupiter.api.Test
    void test_regular3() {
        List<Integer> numbers = Arrays.asList(2, 5, 8, 10, 11, 14);
        Cut cut1 = new Cut(1, 5);
        Cut cut2 = new Cut(2, 5);
        Cut cut3 = new Cut(5, 8);
        Cut cut4 = new Cut(8, 11);

        List<Cut> listCuts = Arrays.asList(cut1, cut2, cut3, cut4);
        Map<Integer, Integer> map = solt.solt(listCuts, numbers);
        List<Integer> expectedValue = Arrays.asList(2, 3, 2, 1, 1, 0);

        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            assertEquals(numbers.get(i), entry.getKey());
            assertEquals(expectedValue.get(i), entry.getValue());
            i++;
        }
    }
}