package baseClass;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IretryAnalzerClass extends BaseClass implements IRetryAnalyzer{

	int start = 0;
	int end = 4;
	public boolean retry(ITestResult result) {
		if (start<end) {
			start++;
			return true;
		}
		return false;
	}

	}

