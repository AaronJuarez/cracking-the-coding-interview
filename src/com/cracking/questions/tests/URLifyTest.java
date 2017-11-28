package com.cracking.questions.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cracking.questions.URLify;

public class URLifyTest {
	URLify urlify = new URLify();
	String str;
	
	@Before
	public void setUp() {
		str = "Mr John Smith";
	}

	@Test
	public void test() {
		assertEquals("Mr%20John%20Smith", urlify.replaceSpaces(str, str.length()));
	}

}
