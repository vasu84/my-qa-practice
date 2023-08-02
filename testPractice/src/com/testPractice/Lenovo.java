package com.testPractice;

public class Lenovo implements Laptop{
	@Override
	public void copy() {
		// TODO Auto-generated method stub
		System.out.println("lenovo copy code");
	}

	@Override
	public void paste() {
		// TODO Auto-generated method stub
		System.out.println("lenovo paste code");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("lenovo cut code");
	}

	@Override
	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("lenovo keyboard code");
	}
                 
	@Override
	public void touchpad() {
		// TODO Auto-generated method stub
		System.out.println("lenovo mouce code");
	}
	
	
	public void security() {  // java  1.8 version default method we have to create an object for this
		// TODO Auto-generated method stub
		System.out.println("lenovo security code");
		
	}
	public void audio() {
		// TODO Auto-generated method stub
		System.out.println("lenovo audio code");
	}
	
	public static void main(String[] args) {
		Lenovo a = new Lenovo();
		a.copy();
		a.paste();
		a.cut();
		a.keyboard();
		a.touchpad();
		
		//a.security();
		//a.audio();
		Laptop.audio(); // this is static method it is not neccessary to create an object 
		                 // we ca directly call here by using class name
	}
}
