package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class positest2 {

	@Test
    public void testIV() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(4, rn.convertRomanNumToInt("IV"));
    }

    @Test
    public void testIX() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(9, rn.convertRomanNumToInt("IX"));
    }

    @Test
    public void testXL() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(40, rn.convertRomanNumToInt("XL"));
    }

    @Test
    public void testXC() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(90, rn.convertRomanNumToInt("XC"));
    }

    @Test
    public void testCD() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(400, rn.convertRomanNumToInt("CD"));
    }
}
