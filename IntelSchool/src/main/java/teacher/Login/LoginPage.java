package teacher.Login;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoginPage {

	public static WebDriver driver;

	@BeforeTest
	public void browserLaunch()
	{
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\XSC-10286\\eclipse-workspace\\Selenium__loginpage\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://portal.intelschool.in/");

		driver.manage().window().maximize();

		//driver.findElement(By.linkText("Login")).click();

		/*Set<String> windowHandles = driver.getWindowHandles(); // handling multiple windows

		for (String string : windowHandles) {

			driver.switchTo().window(string).getTitle();*/
	}

	@Test(priority=1)
	public void techer()
	{
		driver.findElement(By.id("username")).sendKeys("rajkamal");

		driver.findElement(By.id("password")).sendKeys("Guruom@5");

		driver.findElement(By.id("user-login")).click();

	}
}
