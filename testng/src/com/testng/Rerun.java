package com.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer {
	int sorna=0;
	int rowdy=5;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (sorna<rowdy) {
			sorna++;
			return true;
		}
		return false;
	}

}
