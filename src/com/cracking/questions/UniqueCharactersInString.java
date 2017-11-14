package com.cracking.questions;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharactersInString {
	
	public boolean isUnique(String phrase) {
		Map<Character, Boolean> dictionary = new HashMap<>();
		
		for(int i=0; i<phrase.length(); i++) {
			char currentChar = phrase.charAt(i);
			if(!dictionary.containsKey(currentChar)) {
				dictionary.put(currentChar, true);
			}else {
				return false;
			}
		}
		return true;
	}
}
