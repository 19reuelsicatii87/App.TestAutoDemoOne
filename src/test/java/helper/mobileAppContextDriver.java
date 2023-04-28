package helper;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;

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
	private SoftAssert softAssert;
	private ExtentTest extentTestFeature;
	private ExtentTest extentTestScenario;

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

	public ExtentTest getExtentTestFeature() {
		return extentTestFeature;
	}

	public void setExtentTestFeature(ExtentTest extentTestFeature) {
		this.extentTestFeature = extentTestFeature;
	}

	public ExtentTest getExtentTestScenario() {
		return extentTestScenario;
	}

	public void setExtentTestScenario(ExtentTest extentTestScenario) {
		this.extentTestScenario = extentTestScenario;
	}

	public SoftAssert getSoftAssert() {
		return softAssert;
	}

	public void setSoftAssert() {
		this.softAssert = new SoftAssert();
	}

}
