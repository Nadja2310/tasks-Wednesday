import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    MissingNumber missingNumber=new MissingNumber();
    final List<Integer> list=new ArrayList<>();

    @Test
    public void searchNumber_number45() {
        for (int i = 1; i <45 ; i++) {
            list.add(i);
        }
        for (int i = 100; i <45 ; i--) {
            list.add(i);
        }
       assertEquals(45,missingNumber.searchNumber(list));
    }


    @Test
    public void searchNumber_number1() {
        for (int i = 2; i <=100 ; i++) {
            list.add(i);
        }

        assertEquals(1,missingNumber.searchNumber(list));
    }
}