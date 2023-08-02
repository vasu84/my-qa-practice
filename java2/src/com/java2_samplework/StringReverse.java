package com.java2_samplework;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String orginal="";
		String reverse="";
		
		Scanner obj= new Scanner(System.in);
		
		System.out.println("string to reverse string");

		orginal=obj.nextLine();
		int length = orginal.length();
		for (int i = length - 1; i >= 0; i--) {

			reverse=reverse+orginal.charAt(i);
			
		}
		System.out.print(reverse);
	
	}

}
