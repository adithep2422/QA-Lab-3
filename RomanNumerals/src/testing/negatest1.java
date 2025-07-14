package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class negatest1 {
	
	RomanNumerals rn = new RomanNumerals();
	
	@Test
	void testA() {
        try {
            rn.convertRomanNumToInt("A");
            fail("Expected invalid Roman Number 'A'");
        } catch(NullPointerException e) {
        
        }
	}
	
	void testJ() {
        try {
            rn.convertRomanNumToInt("J");
            fail("Expected invalid Roman Number 'J'");
        } catch(NullPointerException e) {
        
        }
	}
	
	void testK() {
        try {
            rn.convertRomanNumToInt("K");
            fail("Expected invalid Roman Number 'K'");
        } catch(NullPointerException e) {
        
        }
	}
}