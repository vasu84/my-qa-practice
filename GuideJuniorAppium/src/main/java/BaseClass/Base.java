package BaseClass;
import java.io.FileInputStream;     
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;



public class Base {




	public static AppiumDriver<MobileElement> driver;
	public static Properties properties;
	public static Wait<AppiumDriver<MobileElement>> wait;
	public static String appPackage;


	@BeforeTest()

	public void setup() throws IOException {

		properties = new Properties();// to load properties from a file or perform other operations on the properties

		FileInputStream inputStream = new FileInputStream(    //to read the data inside the file 


				System.getProperty("user.dir") + "/src/test/Properties/test.appium");
 
		properties.load(inputStream);// It reads a property list (key-value pairs) from the input stream and populates the Properties object with the loaded data


		try {

			URL url = new URL(properties.getProperty("url"));  //  connecting appium to local host

			appPackage = properties.getProperty("appPackage"); //

			DesiredCapabilities cap = new DesiredCapabilities();

			cap.setCapability(MobileCapabilityType.DEVICE_NAME, properties.getProperty("deviceName"));
			cap.setCapability(MobileCapabilityType.UDID, properties.getProperty("udid"));
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, properties.getProperty("platformName"));
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, properties.getProperty("platformVersion"));

			// cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			// cap.setCapability(MobileCapabilityType.APP, "");
			// cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

			if (properties.getProperty("platformName").equals("Android")) {

				cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, properties.getProperty("appPackage"));
				cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, properties.getProperty("launcherActivity"));
			}else {
				cap.setCapability("app", "location of .app or .ipa file");
			}

			driver = new AppiumDriver<MobileElement>(url, cap);

			System.out.print("Application Started");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		wait = new FluentWait<AppiumDriver<MobileElement>>( driver) // Fluent Wait
				.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));

	}

	@AfterTest
	public void tearDown() {
		// driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open
		// navigation drawer\"]")).click();
		// driver.findElement(By.)
		//		driver.quit();
		driver.close();
	}
}
