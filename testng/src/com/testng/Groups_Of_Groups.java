package com.testng;

import org.testng.annotations.Test;

public class Groups_Of_Groups {
	@Test(groups="non-veg")
	private void chicken() {
		// TODO Auto-generated method stub
System.out.println("print chicken");
	}
	
	@Test(groups="non-veg")
	private void mutton() {
		// TODO Auto-generated method stub
System.out.println("print mutton");
	}
	@Test(groups="non-veg")
	private void pork() {
		// TODO Auto-generated method stub
System.out.println("print pork");
	}
	@Test(groups="colors")
	private void red() {
		// TODO Auto-generated method stub
System.out.println("print red");
	}
	@Test(groups="colors")
	private void green() {
		// TODO Auto-generated method stub
System.out.println("print green");
	}
@Test(groups="fruits")
private void apple() {
	// TODO Auto-generated method stub
System.out.println("print apple");
}

@Test(groups="fruits")
private void orange() {
	// TODO Auto-generated method stub
System.out.println("print orange");
}
@Test(groups="fruits")
private void pineapple() {
	// TODO Auto-generated method stub
System.out.println("print pineapple");
}
@Test(groups="Vegetables")
private void carrot() {
	// TODO Auto-generated method stub
System.out.println("print carrot");
}
@Test(groups="Vegetables")
private void cucumber() {
	// TODO Auto-generated method stub
System.out.println("print cucumber");
}}
