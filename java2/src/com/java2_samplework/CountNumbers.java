package com.java2_samplework;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {

		/*	// count the numbers 
		System.out.println("enter number");
		Scanner obj= new Scanner(System.in);

		int n= obj.nextInt();
		int  i=0;
		while(n>0) {
		n=n/10;
		i++;
		}

System.out.println("count of the number ==>"+i);*/

		// sum of the digits in number

		System.out.println("enter number");
		Scanner obj= new Scanner(System.in);

		int n= obj.nextInt();
		int a, i=0,j=0;
		a=n;
		while (a>0) {
			i=a%10;
			j=i+j;
			a=a/10;
		}
	System.out.println("sum of digits is ===> "+j);
	}

}
