import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        MissingNumber missingNumber=new MissingNumber();
       List<Integer> list=new ArrayList<>();


            for (int i = 1; i <45 ; i++) {
                list.add(i);
            }
            for (int i = 46; i <101 ; i++) {
                list.add(i);
            }
        System.out.println(missingNumber.searchNumber(list));
    }
}
