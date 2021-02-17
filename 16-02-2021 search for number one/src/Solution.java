import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int searchElement(int a, int b,int searchElement) {

        int sumOfElementsFound=0;
        String searchElementString=String.valueOf(searchElement);

        for (int element=a; element<=b;element++) {
            String numberStr= String.valueOf(element);
          if (numberStr.indexOf(searchElementString)>=0){
              sumOfElementsFound++;
          }
        }
        return sumOfElementsFound;
    }
}
