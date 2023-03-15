package helper;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class mobileAppHelper {



	public AppiumDriver initializeMobile(String mobileAppName) throws MalformedURLException {

		DesiredCapabilities mobileCapabilities = new DesiredCapabilities();
		AppiumDriver appiumDriver;

		// Capabilities of MobilePhone
		// ==================================================================
		mobileCapabilities.setCapability("deviceName", "NIMPHUS_PHONE");
		mobileCapabilities.setCapability("udid", "192.168.0.13:5555");
		mobileCapabilities.setCapability("platformName", "Android");
		mobileCapabilities.setCapability("platformVersion", "10 QKQ1.190828.002");
		mobileCapabilities.setCapability("automationName", "UiAutomator2");
		mobileCapabilities.setCapability("autoGrantPermissions", "true");

		if (mobileAppName.contentEquals("nativeCalculator")) {

			// Capabilities of MobilePhone - Application (nativeCalculator)
			// ==================================================================
			mobileCapabilities.setCapability("appPackage", "com.miui.calculator");
			mobileCapabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

		} else if (mobileAppName.contentEquals("webChrome")) {

			// Capabilities of MobilePhone - Application (webChrome)
			// ==================================================================
			mobileCapabilities.setCapability("appPackage", "com.android.chrome");
			mobileCapabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		}

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		appiumDriver = new AppiumDriver(url, mobileCapabilities);
		appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return appiumDriver;

	}
	
	public WebDriverWait initializeMobileWait(AppiumDriver appiumDriver) throws MalformedURLException {

		return new WebDriverWait(appiumDriver, Duration.ofSeconds(30));

	}

}
