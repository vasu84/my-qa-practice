package com.testPractice;

public class MyProfile extends Profile {
	private String working_as = "associate engineer  ";
	private static void company() {
		System.out.println("xcelcorp");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		company();
MyProfile b= new MyProfile();
myDetails();
System.out.println("ïd         : " + b.id);

System.out.println( "age       : " + b.age); // we can't use private out side the class , 
                                           //if i give private int, it won't work here

System.out.println( "name       : " + b.name);
System.out.println( "working_as : " + b.working_as);

	}

}
