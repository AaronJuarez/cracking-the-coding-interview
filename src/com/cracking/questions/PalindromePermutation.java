package com.cracking.questions;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
	public boolean isPalindromePermutation(String str) {
		str = str.toLowerCase();
		str = str.replaceAll("\\s+","");
		boolean isPlaindrome = true;
		Map<Character, Integer> charMap = new HashMap<>();
		char[] strArray = str.toCharArray();
		
		for(int i=0; i<strArray.length; i++) {
			if(!charMap.containsKey(strArray[i])) {
				charMap.put(strArray[i], 1);
			}else {
				charMap.put(strArray[i], charMap.get(strArray[i])+1);
			}
		}
		for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			if(entry.getValue()%2 != 0) {
				if(isPlaindrome) {
					isPlaindrome = false;
				}else {
					return isPlaindrome;
				}
			}
		}
		return true;
	}
}
