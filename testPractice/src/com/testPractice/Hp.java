package com.testPractice;

public class Hp implements Laptop {

	@Override
	public void copy() {
		// TODO Auto-generated method stub
		System.out.println("hp copy code");
	}

	@Override
	public void paste() {
		// TODO Auto-generated method stub
		System.out.println("hp paste code");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("hp cut code");
	}

	@Override
	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("hp keyboard code");
	}

	@Override
	public void touchpad() {
		// TODO Auto-generated method stub
		System.out.println("hp mouce code");
	}
	
	public void capture() {
		// TODO Auto-generated method stub
		System.out.println("hp capture code"); // if u given extra methods it will work here,
		                                       // but give with out over ride.
	}
	
	public static void main(String[] args) {
		Hp a = new Hp();
		a.copy();
		a.paste();
		a.cut();
		a.keyboard();
		a.touchpad();
		a.capture();
		
		Laptop.audio();
	}

}
