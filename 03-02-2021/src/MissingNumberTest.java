import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {
    MissingNumber missingNumber=new MissingNumber();
    final List<Integer> list=new ArrayList<>();

    @Test
    void searchNumber_number45() {
        for (int i = 1; i <44 ; i++) {
            list.add(i);
        }
        for (int i = 46; i <101 ; i++) {
            list.add(i);
        }
       assertEquals(46,missingNumber.searchNumber(list));
    }
    @Test
    void searchNumber_number1() {
        for (int i = 2; i <101 ; i++) {
            list.add(i);
        }

        assertEquals(1,missingNumber.searchNumber(list));
    }
}