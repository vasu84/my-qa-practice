package com.java_practice;

public class PracticeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name= "siva ganeshan";
String emid= "siva ganeshan@gmail.com";
System.out.println(name);
System.out.println(emid);
System.out.println(name  + " ---  " +  emid);


System.out.println(new PracticeString() ); /* com.java_practice.PracticeString@379619aa
                                           it gives package name and , class name with @ code*/
 String a = new String("i'm doing anthoer way to string");
 System.out.println(a);
 
 
 String name1="siva";   // stores in string pool memory
 
 int first = System.identityHashCode(name1);
 System.out.println(first);
 
 String name2= new String("siva");  // stores in java heap memory
 
 int second = System.identityHashCode(name2);
 System.out.println(second);
 
 boolean equals = name1.equalsIgnoreCase(name2); // method to verify data in strings
 
 System.out.println(equals);
 
 System.out.println(name1==name2); // here we are verifying addresses only    212628335
                                                                          // 1579572132
	}

}
