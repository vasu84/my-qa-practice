package com.java_practice;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Toolkitd
{

	public static void main(String[] args) {
		 Toolkit t = Toolkit.getDefaultToolkit();  
	      System.out.println("Screen resolution = " + t.getScreenResolution());  
	      Dimension d = t.getScreenSize();  
	      System.out.println("Screen width = " + d.width);  
	      System.out.println("Screen height = " + d.height);  

	}

}
