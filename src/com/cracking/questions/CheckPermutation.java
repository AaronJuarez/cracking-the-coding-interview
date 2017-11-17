package com.cracking.questions;

import java.util.Arrays;

public class CheckPermutation {
	public boolean isPermutation(String s1, String s2) {
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if(str1.length == str2.length) {
			for(int i=0; i<str1.length; i++) {
				if(!(str1[i] == str2[i])) {
					return false;
				}
			}
		}else {
			return false;
		}
		
		return true;
	}
}
