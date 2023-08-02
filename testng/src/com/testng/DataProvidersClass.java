package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersClass {

		@Test(dataProvider="sender")
	
		public void recivers(String firsName, String lastName ) {
		System.out.println(firsName);
		
		System.out.println(lastName);
		
		
		}
	
@DataProvider
public Object[][] sender() {
	Object[][] data= new Object[2][2];
	
	data[0][0]="rowdy";
	data[0][1]="raju";

	data[1][0]="raji";
	data[1][1]="durga";
			
return data;

}

}


