
	package base;

	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;

	public class CommonDataSetup extends BaseClass{
		
		@BeforeSuite
		public void dataSetup() {
			System.out.println("Common Data Setup");
		}
		
		@AfterSuite
		public void dataTearDown() {
			System.out.println("Common Data Cleanup");
		}

	}


