package com.testPractice;

public class Userlaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lenovo lenovo = new Lenovo();
lenovo.copy();
lenovo.paste();
lenovo.cut();
lenovo.keyboard();
lenovo.touchpad();

lenovo.security(); // o/p is lenovo keyboard code bcz we implemented security method in lenovo class

lenovo.audio(); // output-- lenovo audio code , we implemented the audio method.
Laptop.audio(); // this is static method it is not necessary to create an object 
                      // we can directly call here by using class name

Hp hp = new Hp();
hp.capture();
hp.keyboard();

// hp.audio(); this shows error because we didn't implement the static method here, if it's non static out put is "lap audio code
Laptop.audio();
hp.security(); // 'output is  "lap security code"  because we could not  mentioned  the security method 
                      // in hp class
	
Apple apple = new Apple();
apple.copy();
apple.paste();
apple.cut();
apple.keyboard();
apple.touchpad();


apple.security();
apple.audio();
Laptop.audio();
	}

}
