package com.java2_samplework;

import java.util.Scanner;

public class ArmstrongNumber {

	/*public static void main(String[]args) {

		Scanner obj= new Scanner(System.in);

		System.out.println("the number is");

		int n= obj.nextInt();

		int a,i=0,j=0;
		a=n;
		while(a>0) {
		i=a%10;
		j=(i*i*i)+j;
		a=a/10;

		}
	System.out.println("getting the number is"+j);
	if(n==j)
		System.out.println("armstrong");
	else
		System.out.println("not armstrong");

	}*/

	// Armstrong numbers within 1000
	public static void main(String[]args) {

		for (int n = 1; n <= 1000; n++) {
			int a, i = 0, j = 0;
			a = n;
			while (a > 0) {
			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;
			}
			if (n == j) {
			System.out.println(n);
		}
	}


	}}
