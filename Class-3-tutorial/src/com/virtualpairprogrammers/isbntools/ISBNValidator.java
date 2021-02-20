package com.virtualpairprogrammers.isbntools;

public class ISBNValidator {

	public boolean getISBN(String isbn) {
		// TODO Auto-generated method stub
		
		int total = 0;
		if (isbn.length() != 10) {
			throw new NumberFormatException("ISBN numbers must be 10 digits");
		}
		
		for (int i = 0; i < 10; ++i ) {
			if (!Character.isDigit(isbn.charAt(i))) {
				throw new NumberFormatException("ISBN numbers must be digits");
			}
			total += isbn.charAt(i) * (10-i);
		}
		
		
		if (total % 11 == 0) return true;
		return false;
	}

}
