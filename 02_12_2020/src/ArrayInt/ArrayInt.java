package ArrayInt;

import java.util.HashMap;
import java.util.Map;

public class ArrayInt {

    public int searchFrequentElement(int[] array) {

        Map<Integer, Integer> occurenceByNumber = new HashMap<>();
        for (int element : array) {
            occurenceByNumber.compute(element, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }

        int max = 0;
        int inputValue = 0;
        for (Map.Entry<Integer, Integer> element : occurenceByNumber.entrySet()) {
            if (element.getValue() > max) {
                max = element.getValue();
                inputValue = element.getKey();
            } else if (element.getValue()==max)
                inputValue=element.getKey();
        }

        return inputValue;
    }
}
