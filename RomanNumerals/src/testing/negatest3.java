package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class negatest3 {
	
	@Test
    public void testIIII() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(4, rn.convertRomanNumToInt("IIII"));
    }

    @Test
    public void testXXXX() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(40, rn.convertRomanNumToInt("XXXX"));
    }
    
    @Test
    public void testCCCC() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(400, rn.convertRomanNumToInt("CCCC"));
    }

    @Test
    public void testMMMM() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(4000, rn.convertRomanNumToInt("MMMM"));
    }

    @Test
    public void testIIIII() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(5, rn.convertRomanNumToInt("IIIII"));
    }
}
