import java.util.List;

public class MissingNumber {
    public int searchNumber(List<Integer> list) {
        int sum = 0;
        int endNumber=list.size();
        for (int i = 0; i < endNumber; i++) {
            sum += list.get(i);
        }
//(n*(n+1)/2
        endNumber++;
        return (endNumber * (endNumber + 1)) / 2 - sum;
    }
}
