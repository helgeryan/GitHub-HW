package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void checkValidISBN(){
		
		ISBNValidator validator = new ISBNValidator();
		boolean result = validator.getISBN(140441196);
		assertTrue(result);
	}

}
