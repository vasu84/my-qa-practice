package com.java_practice;

public class CountLetters {

	public static void main(String[] args) {

		String str1 = "AbRtt";
		int upperCase = 0;
		int lowerCase = 0;
		char[] ch = str1.toCharArray();
		for(char chh : ch) {
			if(chh >='A' && chh <='Z') {
				upperCase++;
			} else if (chh >= 'a' && chh <= 'z') {
				lowerCase++;
			} else {
				continue;
			}
		}
		System.out.println("Uppercase letters >> " + upperCase + "Lowercase letter>> " + lowerCase);

	}


}


