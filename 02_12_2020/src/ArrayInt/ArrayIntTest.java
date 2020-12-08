package ArrayInt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIntTest extends ArrayInt {

    @Test
    void testarrayInt_OneValue_true(){
        ArrayInt arr=new ArrayInt();
        int[] arrayInt=new int[]{1,1,3,1,1,2,3,1};
        assertEquals(1,arr.searchFrequentElement(arrayInt));
    }
    @Test
    void testArrayInt_AllValue_true(){
        ArrayInt arr=new ArrayInt();
        int[] array2=new int[]{8,7,2,3,4};
        int x=arr.searchFrequentElement(array2);
        assertTrue(x==8||x==7||x==2||x==3||x==4);

        int[] array3=new int[]{1,1,8,8,10,10};
        int y=arr.searchFrequentElement(array3);
        assertTrue(x==1||x==8||x==10);
    }


    @Test
    void testSwitchArray_true(){
        ArrayInt arr=new ArrayInt();
        int[] array=new int[]{1,3,1,3,1,3};
        assertTrue(arr.switchArray(array));

        int[] array1=new int[]{1,3,1,3,1,};
        assertTrue(arr.switchArray(array1));

        int[] array2=new int[]{};
        assertTrue(arr.switchArray(array1));
        int[] array3=new int[]{1};
        assertTrue(arr.switchArray(array1));

    }

    @Test
    void testSwitchArray_false(){
        ArrayInt arr=new ArrayInt();

        int[] array2=new int[]{1,2,1,3};
        assertFalse(arr.switchArray(array2));
        int[] array3=new int[]{2,6,1,6};
        assertFalse(arr.switchArray(array3));
    }
    @Test
    void testMaxSpan(){
        ArrayInt arr=new ArrayInt();

        int[] array1=new int[]{3};
        assertEquals(1,arr.maxSpan(array1));
        int[] array2=new int[]{1, 2,3,4,5};
        assertEquals(2,arr.maxSpan(array2));
        int[] array3=new int[]{2,6,1,6,2,3,8,8,9,6};
        assertEquals(9,arr.maxSpan(array3));
        int[] array4=new int[]{};
        assertEquals(0,arr.maxSpan(array4));
    }
}