package ArrayInt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIntTest extends ArrayInt {

    @Test
    void testarrayInt(){
        ArrayInt arr=new ArrayInt();
        int[] arrayInt=new int[]{1,1,3,1,1,2,3,1};

        assertEquals(1,arr.searchFrequentElement(arrayInt));
        int[] arrayOneElement=new int[]{8,7,2,3,4};
        assertEquals(8,arr.searchFrequentElement(arrayOneElement));
        int[] array3=new int[]{1,1,8,8,10,10};
        assertEquals(10,arr.searchFrequentElement(array3));
    }


}