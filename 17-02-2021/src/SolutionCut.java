import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionCut {
    public Map<Integer, Integer> solt(List<Cut> cuts, List<Integer> numbers) {
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
