package helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class mobileAppHelper {

	public static Properties properties;

	public static String GetPropertValue(String Path, String Key) {

		properties = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(Path);
			properties.loadFromXML(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return properties.getProperty(Key);

	}

	public AppiumDriver initializeAppiumDriver(String mobileAppName) throws MalformedURLException {

		DesiredCapabilities mobileCapabilities = new DesiredCapabilities();
		AppiumDriver appiumDriver = null;

		if (GetPropertValue("data/TestProperties.xml", "Grid").equalsIgnoreCase("Browser")) {

			// Capabilities of MobilePhone
			// ==================================================================
			mobileCapabilities.setCapability("deviceName", "NIMPHUS_PHONE");
			mobileCapabilities.setCapability("udid", "192.168.0.13:5555");
			mobileCapabilities.setCapability("platformName", "Android");
			mobileCapabilities.setCapability("platformVersion", "10 QKQ1.190828.002");
			mobileCapabilities.setCapability("automationName", "UiAutomator2");
			mobileCapabilities.setCapability("autoGrantPermissions", true);

			if (mobileAppName.contentEquals("nativeCalculator")) {

				// Capabilities of MobilePhone - Application (nativeCalculator)
				// ==================================================================
				mobileCapabilities.setCapability("appPackage", "com.miui.calculator");
				mobileCapabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

			} else if (mobileAppName.contentEquals("webChrome")) {

				// Disable Chrome Welcome Screen
				// ==================================================================
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-fre");

				// Capabilities of MobilePhone - Application (webChrome)
				// ==================================================================
				// mobileCapabilities.setCapability("appPackage", "com.android.chrome");
				mobileCapabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
				mobileCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
			}

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			appiumDriver = new AppiumDriver(url, mobileCapabilities);
			appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		}

		else if (GetPropertValue("data/TestProperties.xml", "Grid").equalsIgnoreCase("BrowserStack")) {

			// Set your access credentials
			mobileCapabilities.setCapability("browserstack.user", "licenses_l5aIeD");
			mobileCapabilities.setCapability("browserstack.key", "QYTmGxxvTJ9bxLAERqYU");

			// Specify device and os_version for testing
			mobileCapabilities.setCapability("platformName", "android");
			mobileCapabilities.setCapability("platformVersion", "13.0");
			mobileCapabilities.setCapability("deviceName", "Samsung Galaxy S23 Ultra");

			// Set other BrowserStack capabilities
			mobileCapabilities.setCapability("project", "First Java Project");
			mobileCapabilities.setCapability("build", "browserstack-build-1");
			mobileCapabilities.setCapability("name", "first_test");

			// Set URL of the application under test
			mobileCapabilities.setCapability("app", "bs://0bbe7bfd19a3d75171be8773848a436ce1de0ade");
			//mobileCapabilities.setCapability("browserName", "Chrome");

			// Disable all pop-ups in Chrome
			// ==================================================================
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-fre");
			options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
			mobileCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
			mobileCapabilities.setCapability("autoGrantPermissions", true);

			URL url = new URL("https://licenses_l5aIeD:QYTmGxxvTJ9bxLAERqYU@hub-cloud.browserstack.com/wd/hub");
			appiumDriver = new AppiumDriver(url, mobileCapabilities);
			appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}

		return appiumDriver;

	}
	
	public AndroidDriver initializeAndroidDriver(String mobileAppName) throws MalformedURLException {

		DesiredCapabilities mobileCapabilities = new DesiredCapabilities();
		AndroidDriver androidDriver = null;

		if (GetPropertValue("data/TestProperties.xml", "Grid").equalsIgnoreCase("Browser")) {

			// Capabilities of MobilePhone
			// ==================================================================
			mobileCapabilities.setCapability("deviceName", "NIMPHUS_PHONE");
			mobileCapabilities.setCapability("udid", "192.168.0.13:5555");
			mobileCapabilities.setCapability("platformName", "Android");
			mobileCapabilities.setCapability("platformVersion", "10 QKQ1.190828.002");
			mobileCapabilities.setCapability("automationName", "UiAutomator2");
			mobileCapabilities.setCapability("autoGrantPermissions", true);

			if (mobileAppName.contentEquals("nativeCalculator")) {

				// Capabilities of MobilePhone - Application (nativeCalculator)
				// ==================================================================
				mobileCapabilities.setCapability("appPackage", "com.miui.calculator");
				mobileCapabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

			} else if (mobileAppName.contentEquals("webChrome")) {

				// Disable Chrome Welcome Screen
				// ==================================================================
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-fre");

				// Capabilities of MobilePhone - Application (webChrome)
				// ==================================================================
				// mobileCapabilities.setCapability("appPackage", "com.android.chrome");
				mobileCapabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
				mobileCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
			}

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			androidDriver = new AndroidDriver(url, mobileCapabilities);
			androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		}

		else if (GetPropertValue("data/TestProperties.xml", "Grid").equalsIgnoreCase("BrowserStack")) {

			// Set your access credentials
			mobileCapabilities.setCapability("browserstack.user", "licenses_l5aIeD");
			mobileCapabilities.setCapability("browserstack.key", "QYTmGxxvTJ9bxLAERqYU");

			// Specify device and os_version for testing
			mobileCapabilities.setCapability("platformName", "android");
			mobileCapabilities.setCapability("platformVersion", "13.0");
			mobileCapabilities.setCapability("deviceName", "Samsung Galaxy S23 Ultra");

			// Set other BrowserStack capabilities
			mobileCapabilities.setCapability("project", "First Java Project");
			mobileCapabilities.setCapability("build", "browserstack-build-1");
			mobileCapabilities.setCapability("name", "first_test");

			// Set URL of the application under test
			mobileCapabilities.setCapability("app", "bs://0bbe7bfd19a3d75171be8773848a436ce1de0ade");
			//mobileCapabilities.setCapability("browserName", "Chrome");

			// Disable all pop-ups in Chrome
			// ==================================================================
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-fre");
			options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
			mobileCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
			mobileCapabilities.setCapability("autoGrantPermissions", true);
			
			// Set Appium version
			// ==================================================================
			HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
			browserstackOptions.put("appiumVersion", "1.16.0");
			mobileCapabilities.setCapability("bstack:options", browserstackOptions);

			URL url = new URL("https://licenses_l5aIeD:QYTmGxxvTJ9bxLAERqYU@hub-cloud.browserstack.com/wd/hub");
			androidDriver= new AndroidDriver(url, mobileCapabilities);
			androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}

		return androidDriver;

	}

	public WebDriverWait initializeMobileWait(AppiumDriver appiumDriver) throws MalformedURLException {

		return new WebDriverWait(appiumDriver, Duration.ofSeconds(30));

	}

}
