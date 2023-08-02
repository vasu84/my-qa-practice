package teacher.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DashBoardIntell extends LoginPage {
	
	WebDriver driver;
	@Test(priority=1)

	public void dashboard() throws Exception {
		// TODO Auto-generated method stub
		//Actions a = new Actions(driver);
	

		driver.findElement(By.xpath("/html/body/section/div[2]/ul/li[4]/div/a/span")).click();
		Thread.sleep(2000);
	}
		@Test(priority=2)
		public void view() throws InterruptedException
		{
		//driver.findElement(By.xpath("(//a[text()='Notice'])[2]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,400);", "");
		driver.findElement(By.xpath("(//span[contains(.,'View More')])[2]")).click();
		Thread.sleep(2000);

		/*driver.findElement(By.xpath("/html/body/section/div[3]/div/div[1]/div/div[2]/div[1]/div/div[2]/p/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[1]/div/div[2]/div[1]/div/div[3]/p/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/section/div[3]/div/div[1]/div/div[2]/div[1]/div/div[5]/p/a")).click();

		Thread.sleep(2000);
		 */
		}
	

}
