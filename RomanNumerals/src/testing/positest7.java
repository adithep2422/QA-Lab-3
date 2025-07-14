package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class positest7 {
	
	@Test
    public void testLXXIV() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(74, rn.convertRomanNumToInt("LXXIV"));
    }

    @Test
    public void testLXXVI() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(76, rn.convertRomanNumToInt("LXXVI"));
    }

    @Test
    public void testLXXVIII() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(78, rn.convertRomanNumToInt("LXXVIII"));
    }

    @Test
    public void testLXXXIV() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(84, rn.convertRomanNumToInt("LXXXIV"));
    }
}
