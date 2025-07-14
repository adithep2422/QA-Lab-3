package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class positest6 {
	
    @Test
    public void testXXVI() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(26, rn.convertRomanNumToInt("XXVI"));
    }

    @Test
    public void testXXVII() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(27, rn.convertRomanNumToInt("XXVII"));
    }

    @Test
    public void testLXVII() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(67, rn.convertRomanNumToInt("LXVII"));
    }

    @Test
    public void testCXXI() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(121, rn.convertRomanNumToInt("CXXI"));
    }

    @Test
    public void testMCCVI() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(1206, rn.convertRomanNumToInt("MCCVI"));
    }
}
