package com.java2_samplework;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
			
		/*	Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();
			int a,i,j=0;
			a=n; // 
			while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
			}
			System.out.println("The reverse number is "+j);
			
	if(n==j) {
		System.out.println("palindrome");
	}
	else
		System.out.println("no palindrome");  */
	
	
	
	
	for(int n=0;n<=1000; n++) {
		int a, i=0,j=0;
		a=n;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		
		if(j==n)
		System.out.println(j);
	}
	}
			
	}
	


