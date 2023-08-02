package com.testng;

import org.testng.annotations.Test;

public class Metagroups {
	

		/*
		 * Sub modules "Sub module 11", "Sub module 12", "Sub module 13" and "Sub module 14"
		 * are sub modules of module "Module 1".
		 */
		@Test(groups = { "Sub module 11" })
		public void Submodule11() {
			System.out.println("Sub module 11");
		}
		
		@Test(groups = { "Sub module 12" })
		public void Submodule12() {
			System.out.println("Sub module 12");
		}
		
		@Test(groups = { "Sub module 13" })
		public void Submodule13() {
			System.out.println("Sub module 13");
		}
		
		@Test(groups = { "Sub module 14" })
		public void Submodule14() {
			System.out.println("Sub module 14");
		}
		
		/*
		 * Sub modules "Sub module 21", "Sub module 22", "Sub module 23" and "Sub module 24"
		 * are sub modules of module "Module 2".
		 */
		@Test(groups = { "Sub module 21" })
		public void Submodule21() {
			System.out.println("Sub module 21");
		}
		
		@Test(groups = { "Sub module 22" })
		public void Submodule22() {
			System.out.println("Sub module 22");
		}
		
		@Test(groups = { "Sub module 23" })
		public void Submodule23() {
			System.out.println("Sub module 23");
		}
		
		@Test(groups = { "Sub module 24" })
		public void Submodule24() {
			System.out.println("Sub module 24");
		}

		
	}

