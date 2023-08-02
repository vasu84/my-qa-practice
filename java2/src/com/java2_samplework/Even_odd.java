package com.java2_samplework;


import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {

// checking even or odd
		/*for(int i=0;i<=4;i++) { // for entering multiple entries in console pannel;
			System.out.println("enter number");
			System.out.println("enter the number");
			Scanner obj=new Scanner(System.in);

			for(int x=0;x<100;x++) {

				int n=obj.nextInt();

				if(n%2==0) 
					System.out.println("even");
				else
					System.out.println("odd");	

			}
		}*/

	// count of even and odd
		int even=0;
		int odd=0;
		
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
			even++;
				
			}
			else {
				odd++;
		}
		}
	
	System.out.println("even count==>"+even);
	System.out.println("odd count==>"+odd);
	
	}
}