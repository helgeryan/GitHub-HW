package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkValidISBN(){
		
		ISBNValidator validator = new ISBNValidator();
		boolean result = validator.getISBN("0140449116");
		assertTrue("First ISBN", result);
		
		result = validator.getISBN("0140177396");
		assertTrue("Second ISBN", result);
	}
	
	@Test
	public void checkAnValidISBN(){
		
		ISBNValidator validator = new ISBNValidator();
		boolean result = validator.getISBN("0140441197");
		assertFalse(result);
	}
	
	@Test(expected = NumberFormatException.class)
	public void nine_digit_ISBNSAreNotAllowed() {

		ISBNValidator validator = new ISBNValidator();
		boolean result = validator.getISBN("123456789");
		assertFalse(result);
	}
	
	@Test(expected = NumberFormatException.class)
	public void nonNumericISBNSAreNotAllowed() {
		ISBNValidator validator = new ISBNValidator();
		boolean result = validator.getISBN("helloworld");
		assertFalse(result);
	}
}
