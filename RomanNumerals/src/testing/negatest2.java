package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class negatest2 {
	
	@Test
    public void testVV() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(10, rn.convertRomanNumToInt("VV"));
    }

    @Test
    public void testLL() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(100, rn.convertRomanNumToInt("LL"));
    }
    
    @Test
    public void testDD() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(1000, rn.convertRomanNumToInt("DD"));
    }

    @Test
    public void testVVV() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(15, rn.convertRomanNumToInt("VVV"));
    }

    @Test
    public void testLLL() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(150, rn.convertRomanNumToInt("LLL"));
    }
}
