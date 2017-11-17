package com.cracking.questions.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cracking.questions.CheckPermutation;

public class CheckPermutationTest {
	CheckPermutation checkPermutation;
	String str1;
	String str2;
	
	@Before
	public void setUp() {
		checkPermutation = new CheckPermutation();
		str1 = "roma";
		str2 = "amor";
	}

	@Test
	public void testDoIs() {
		assertTrue(checkPermutation.isPermutation(str1, str2));
	}
	
	@Test
	public void testIsNot() {
		str2="hola";
		assertFalse(checkPermutation.isPermutation(str1, str2));
	}
	
	@Test
	public void testByLength() {
		String str2="holaMundo";
		assertFalse(checkPermutation.isPermutation(str1, str2));
	}

}
