package com.java_practice;

public class StringTypes {
	public static void main(String[] args) {
		String a = "vasu is a playboy";
		String b = "vasu is a playboy"; 
		System.out.println(a==b);  //// a & b stored in same memory 932583850
		
		
		int num1 = System.identityHashCode(a); // to know the memory where its stored
		System.out.println(num1);
		int num2 = System.identityHashCode(b);
		System.out.println(num2);
		
		String c = new String("vasu is a playboy"); //it sored in 212628335 this ip 
		String d = new String("vasu is a playboy");  // it stored in 1579572132 different memory ip
		System.out.println(c==d);
		
	String v= "       i become a tester in few weeks   ";
		
		int num3 = System.identityHashCode(c);
		System.out.println(num3);
		int num4 = System.identityHashCode(d);
		System.out.println(num4);
		
		
		System.out.println(c.equals(d)); // Equals method.

		System.out.println(c.equalsIgnoreCase(d));// equals ignore case .
		
		System.out.println(c.contains("vasu")); // contain method , u must place in double quote.
		
		System.out.println(c.startsWith("vasu")); // starts with method
		
		System.out.println(c.endsWith("vasu"));  // end with method.
		
		System.out.println(a.length());          // length method
		System.out.println(v.length()); //40
		
		System.out.println(v.trim());  // it trim the extra spaces in front and back of the text
		System.out.println(v.trim().length()); // 30
		
		System.out.println(c.contains("vasu"));
	}
}
