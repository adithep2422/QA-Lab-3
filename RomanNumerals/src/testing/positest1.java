package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class positest1 {

	 @Test
	 public void testI() {
		 RomanNumerals rn = new RomanNumerals();
	     assertEquals(1, rn.convertRomanNumToInt("I"));
	     }
	 
	 @Test
	 public void testV() {
	     RomanNumerals rn = new RomanNumerals();
	     assertEquals(5, rn.convertRomanNumToInt("V"));
	 }
	 
	 @Test
	 public void testX() {
	     RomanNumerals rn = new RomanNumerals();
	     assertEquals(10, rn.convertRomanNumToInt("X"));
	 }
	 
	 @Test
	 public void testL() {
	     RomanNumerals rn = new RomanNumerals();
	     assertEquals(50, rn.convertRomanNumToInt("L"));
	 }
	 
	 @Test
	 public void testC() {
	     RomanNumerals rn = new RomanNumerals();
	     assertEquals(100, rn.convertRomanNumToInt("C"));
	 }
	 
	 @Test
	 public void testD() {
	     RomanNumerals rn = new RomanNumerals();
	     assertEquals(500, rn.convertRomanNumToInt("D"));
	 }
	 
	 @Test
	 public void testM() {
	     RomanNumerals rn = new RomanNumerals();
	     assertEquals(1000, rn.convertRomanNumToInt("M"));
	 }
}
