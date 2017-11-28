package com.cracking.questions;

public class URLify {
	
	public String replaceSpaces(String str, int strLength) {
		char[] charArray = str.toCharArray();
		StringBuilder newString = new StringBuilder();
		
		for(int i=0; i<charArray.length; i++) {
			char elem = charArray[i];
			if(elem == ' ') {
				newString.append("%20");
			}else {
				newString.append(elem);
			}
		}
		return newString.toString();
	}

}
