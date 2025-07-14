package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class positest4 {

	@Test
	 public void testII() {
	     RomanNumerals rn = new RomanNumerals();
	     assertEquals(2, rn.convertRomanNumToInt("II"));
	 }
	
	@Test
	 public void testXX() {
	     RomanNumerals rn = new RomanNumerals();
	     assertEquals(20, rn.convertRomanNumToInt("XX"));
	 }
	
    @Test
    public void testCC() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(200, rn.convertRomanNumToInt("CC"));
    }

    @Test
    public void testMM() {
        RomanNumerals rn = new RomanNumerals();
        assertEquals(2000, rn.convertRomanNumToInt("MM"));
    }

}
