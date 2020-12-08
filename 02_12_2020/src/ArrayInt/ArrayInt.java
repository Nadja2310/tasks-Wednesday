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
            } else if (element.getValue() == max)
                inputValue = element.getKey();
        }

        return inputValue;
    }

    public boolean switchArray(int[] array) {
        int evenElement = array[0];
        int oddElement = array[1];
        int countEven = 1;
        int countOdd = 1;
        int eventElementLenght = (array.length % 2 == 0 ? (array.length / 2) : (array.length / 2 + 1));
        for (int i = 2; i < array.length; i++) {
            if (i % 2 == 0 && array[i] == evenElement)
                countEven++;
            if (i % 2 != 0 && array[i] == oddElement)
                countOdd++;
        }

        return (countOdd == (array.length / 2) && countEven == (eventElementLenght));
    }

    public int maxSpan(int[] arr) {

        int maxSpan = 0;

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            int outputLength = 0;

            for (int j = arr.length - 1; j >= 0; j--) {
                if (element == arr[j]) {
                    outputLength = j - i + 1;
                    break;
                }
            }
            maxSpan = Math.max(outputLength, maxSpan);
        }
        if (arr.length > 1 && maxSpan == 1)
            maxSpan = 2;

        return maxSpan;
    }
}
