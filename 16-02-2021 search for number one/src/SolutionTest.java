import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution test=new Solution();
    final List list=new ArrayList<Integer>();

    @Test
    public void searchNumber_regular() {
        for (int i = 100; i <109 ; i++) {
            list.add(i);
        }

        assertEquals(10,test.searchElement(100,109,1));
    }

    @Test
    public void searchNumber_from1To9_res1() {
        int a=1;
        int b=9;
        for (int i = a; i <b ; i++) {
            list.add(i);
        }
        assertEquals(1,test.searchElement(a,b,1));
    }
    @Test
    public void searchNumber_from2To9_res0() {
        int a=2;
        int b=9;
        for (int i = a; i <b ; i++) {
            list.add(i);
        }
        assertEquals(0,test.searchElement(a,b,1));
    }
}