package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkValid10DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449116");
		assertTrue("First Value",result);
		result = validator.checkISBN("0140177396");
		assertTrue("Second Value",result);
	}
	
	@Test
	public void checkValid13DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("9781524797508");
		assertTrue(result);
		result = validator.checkISBN("9781545104811");
		assertTrue("Second Value",result);
		
	}
	
	@Test
	public void TenDigitISBNNumbersEndingInXAreAllowed() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("012000030X");
		assertTrue(result);
	}
	
	@Test
	public void checkInValid10DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449117");
		assertFalse(result);
	}
	
	@Test
	public void checkInValid13DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("9781524797507");
		assertFalse(result);
	}
	
	@Test(expected = NumberFormatException.class)
	public void nineDigitISBNAreNotAllowed() {
		ValidateISBN validator = new ValidateISBN();
		validator.checkISBN("123456789");
	}
	
	@Test(expected = NumberFormatException.class)
	public void NonNumericISBN() {
		ValidateISBN validator = new ValidateISBN();
		validator.checkISBN("HelloWorld");
	}
	
	

}
