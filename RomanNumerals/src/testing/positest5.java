package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class positest5 {

	@Test
    public void testIII() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(3, rn.convertRomanNumToInt("III"));
    }

    @Test
    public void testXXX() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(30, rn.convertRomanNumToInt("XXX"));
    }

    @Test
    public void testCCC() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(300, rn.convertRomanNumToInt("CCC"));
    }

    @Test
    public void testMMM() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(3000, rn.convertRomanNumToInt("MMM"));
    }

    @Test
    public void testII() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(2, rn.convertRomanNumToInt("II"));
    }
}
