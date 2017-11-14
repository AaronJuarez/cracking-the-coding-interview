package com.cracking.questions.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cracking.questions.UniqueCharactersInString;

public class UniqueCharacterInStringTest {
	String phrase;
	String uniquePhrase;
	UniqueCharactersInString uniqueCharacters;
	
	@Before
	public void setUp() {
		uniqueCharacters = new UniqueCharactersInString();
		phrase = "Hello world";
		uniquePhrase = "Helo wrd";
	}

	@Test
	public void test() {
		assertFalse(uniqueCharacters.isUnique(phrase));
		assertTrue(uniqueCharacters.isUnique(uniquePhrase));
	}

}
