package mobileApp.AppName;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import helper.mobileAppContextDriver;
import helper.mobileAppHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class nativeCalculator extends mobileAppHelper {

	// Page Elements
	// ==========================================
	By agree_button = By.id("android:id/button1");
	By add_button = By.id("com.miui.calculator:id/btn_plus_s");
	By equal_button = By.id("com.miui.calculator:id/btn_equal_s");
	By result = By.id("com.miui.calculator:id/result");

	// Sub Section - Element Finder
	// ===================================
	private By numberElementFinder(String number) {

		By element = By.id("com.miui.calculator:id/btn_" + number + "_s");
		return element;

	}

	// Declare Driver Instance
	// ==========================================
	private mobileAppContextDriver context;

	public nativeCalculator(mobileAppContextDriver context) {
		super();
		this.context = context;
	}

	@Given("User click on the {string} button")
	public void userClickOnTheButton(String number) {
		context.getAppiumDriver().findElement(numberElementFinder(number)).click();

	}

	@Given("User click on the add button")
	public void userClickOnTheAddButton() {
		context.getAppiumDriver().findElement(add_button).click();
	}

	@Given("User click on the agree button")
	public void userClickOnTheAgreeButton() {
		context.getAppiumDriver().findElement(agree_button).click();
	}

	@Given("User click on the equal button")
	public void userClickOnTheEqualButton() {
		context.getAppiumDriver().findElement(equal_button).click();

	}

	@Then("User validates that sum is {string}")
	public void userValidatesThatSumIs(String sum) {
		assertEquals(context.getAppiumDriver().findElement(result).getText().replace("=", ""), sum);
	}

}
