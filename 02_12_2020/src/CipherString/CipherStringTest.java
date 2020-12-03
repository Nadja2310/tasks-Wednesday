package CipherString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherStringTest {

    @Test
    void testCiphering_str1(){
        CipherString str1=new CipherString(("aaabbbcdd"));
        assertEquals("3a3bc2d",str1.Ciphering());
    }

    @Test
    void testCiphering_str2(){
        CipherString str1=new CipherString("abcccd");
        assertEquals("ab3cd",str1.Ciphering());
    }
}