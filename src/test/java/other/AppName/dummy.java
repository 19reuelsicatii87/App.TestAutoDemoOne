package other.AppName;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy.ByName;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class dummy {

	public static void main(String[] args) throws MalformedURLException {

		// Page Elements
		// ==========================================
		By fullname_text = By.xpath("//input[@placeholder='Juan Dela Cruz']");
		By search_text = By.xpath("//input[@title='Search']");
		// By emailAddress_text =
		// By.xpath("//input[@placeholder='juandelacruz@gmail.com']");
		// By submit_button = By.xpath("//button[normalize-space()='Submit']");
		// By error_message = By.xpath("//p[@class='text-start
		// text-danger']//small[1]");

		DesiredCapabilities mobileCapabilities = new DesiredCapabilities();
		AndroidDriver androidDriver = null;

		// Set your access credentials
		mobileCapabilities.setCapability("browserstack.user", "licenses_l5aIeD");
		mobileCapabilities.setCapability("browserstack.key", "QYTmGxxvTJ9bxLAERqYU");

		// Specify device and os_version for testing
		mobileCapabilities.setCapability("platformName", "android");
		mobileCapabilities.setCapability("platformVersion", "10.0");
		mobileCapabilities.setCapability("deviceName", "Samsung Galaxy S20");
		mobileCapabilities.setCapability("app", "bs://0bbe7bfd19a3d75171be8773848a436ce1de0ade");
		
		// Set other BrowserStack capabilities
		mobileCapabilities.setCapability("project", "First Java Project");
		mobileCapabilities.setCapability("build", "browserstack-build-1");
		mobileCapabilities.setCapability("name", "first_test");

		URL url = new URL("https://licenses_l5aIeD:QYTmGxxvTJ9bxLAERqYU@hub-cloud.browserstack.com/wd/hub");
		androidDriver = new AndroidDriver(url, mobileCapabilities);
		androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		androidDriver.get("https://www.google.com/");

		androidDriver.findElement(search_text).sendKeys("Reuel Sicat II");
		androidDriver.quit();

	}

}
