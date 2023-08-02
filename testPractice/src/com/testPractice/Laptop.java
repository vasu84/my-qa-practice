package com.testPractice;
 
public interface Laptop {
	
public void copy();
public void paste();
public void cut();
public void keyboard();
public void touchpad();

//in java 1.8
default void security() {  
	commoncode();
	System.out.println("lap security code");
}
static void audio() {
	commoncode();
	System.out.println("lap audio code");	
	
}

private static void commoncode() {  //static is for using common code in static void method , otherwise it shows error.
	System.out.println("common code");
}
}

/* this is interface creation.  now we need implementors,
  hp, lenovo, apple is implementors(classes). and we get the out put in these classes separately or
   
   all outputs in one class( we created userlaptop class, it's only for output).
 */