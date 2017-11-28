package com.cracking.questions.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cracking.questions.PalindromePermutation;

public class PalindromePermutationTest {
	PalindromePermutation palPermutation;
	String str;
	
	@Before
	public void setUp() {
		palPermutation = new PalindromePermutation();
		str = "tact coa";
	}

	@Test
	public void test() {
		assertTrue(palPermutation.isPalindromePermutation(str));
	}
	
	@Test
	public void notPalindromePermutationTest() {
		assertFalse(palPermutation.isPalindromePermutation("tact coaa"));
	}

}
