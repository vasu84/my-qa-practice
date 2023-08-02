package com.java2_samplework;

import java.util.Scanner;

public class Swapping_numbers {

	public static void main(String[] args) {
		
		System.out.println("enter numbers");
		
		Scanner obj=new Scanner (System.in);
		
		// by using three variables we can swap the two numbers
		int a, b;
		//int c;
		 a= obj.nextInt();
		 b= obj.nextInt();
		 
		/* c=a;
		 a=b;
		 b=c;
		 
		 System.out.println("swapping num are");
		 System.out.println(a);
		 System.out.println(b);
	*/
		
		 
		 // by using 2 variables we swapping
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("swapping num are");
	 System.out.println(a);
	 System.out.println(b);	
	}

}
