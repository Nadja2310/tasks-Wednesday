import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int searchElement(int a, int b,int searchElement) {

      //  Map<Integer, Integer> occurenceByNumber = new HashMap<>();
        int sumOfElementsFound=0;
        for (int element=a; element<=b;element++) {
            String numberStr= String.valueOf(element);
            String searchElementString=String.valueOf(searchElement);
           
          if (numberStr.indexOf(searchElementString)>=0){
              sumOfElementsFound++;
          }
        }

        return sumOfElementsFound;
    }
}
