package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class positest3 {

	@Test
    public void testVI() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(6, rn.convertRomanNumToInt("VI"));
    }

    @Test
    public void testXI() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(11, rn.convertRomanNumToInt("XI"));
    }

    @Test
    public void testLI() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(51, rn.convertRomanNumToInt("LI"));
    }

    @Test
    public void testCI() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(101, rn.convertRomanNumToInt("CI"));
    }

    @Test
    public void testMI() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(1001, rn.convertRomanNumToInt("MI"));
    }
}
