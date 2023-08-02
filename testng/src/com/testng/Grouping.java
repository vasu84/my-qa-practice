package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class Grouping {
	@Ignore
	
	@Test(groups="fruits")
	private void apple() {
		 
		System.out.println("print apple");
	}


	@Test(groups="fruits")
	private void orange() {
		 
		System.out.println("print orange");
	}


	@Test(groups="fruits")
	private void pineapple() {
		 
		System.out.println("print pineapple");
	}


	@Test(groups="Vegetables")
	private void carrot() {
		 
		System.out.println("print carrot");
	}


	@Test(groups="Vegetables")
	private void cucumber() {
		 
		System.out.println("print cucumber");
	}

}
