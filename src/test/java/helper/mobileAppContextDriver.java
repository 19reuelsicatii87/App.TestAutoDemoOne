package helper;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.Scenario;

public class mobileAppContextDriver {
	
	private AppiumDriver appiumDriver;
	private AndroidDriver androidDriver;
	private IOSDriver iOSDriver;
	private WebDriverWait wait;
	private Scenario scenario;
	
	// AppiumDriver
	// ====================================
	public AppiumDriver getAppiumDriver() {
		return appiumDriver;
	}
	public void setAppiumDriver(AppiumDriver appiumDriver) {
		this.appiumDriver = appiumDriver;
	}
	
	// AndroidDriver
	// ====================================
	public AndroidDriver getAndroidDriver() {
		return androidDriver;
	}
	public void setAndroidDriver(AndroidDriver androidDriver) {
		this.androidDriver = androidDriver;
	}
	
	// IOSDriver
	// ====================================
	public IOSDriver getIOSDriver() {
		return iOSDriver;
	}
	public void setIOSDriver(IOSDriver iOSDriver) {
		this.iOSDriver = iOSDriver;
	}
	
	// Scenario
	// ====================================
	public Scenario getScenario() {
		return scenario;
	}
	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}

	// WebDriverWait
	// ====================================
	public WebDriverWait getWait() {
		return wait;
	}
	public void setWait(WebDriverWait wait) {
		this.wait = wait;
	}


}
