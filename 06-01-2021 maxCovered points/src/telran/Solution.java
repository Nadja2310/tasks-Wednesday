package telran;

import java.util.List;

public class Solution {
    int maxCoveredPoints(List<Integer> number, int cut) {
        int points = 0;
        int maxPoints = 0;
        for (int i = 0; i < number.size(); i++) {
            for (int j = i + 1; j < number.size(); j++) {
                if (number.get(j) - number.get(i) <= cut) {
                    points++;
                }
            }
            if (points >= maxPoints)
                maxPoints = points;
            points = 0;
        }
        return maxPoints;
    }
}
