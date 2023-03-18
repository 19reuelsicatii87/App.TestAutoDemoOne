package mobileApp.AppName;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import helper.mobileAppContextDriver;
import helper.mobileAppHelper;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class webChome extends mobileAppHelper {

	// Page Elements
	// ==========================================
	By fullname_text = By.xpath("//input[@placeholder='Juan Dela Cruz']");
	By emailAddress_text = By.xpath("//input[@placeholder='juandelacruz@gmail.com']");
	By submit_button = By.xpath("//button[normalize-space()='Submit']");
	By error_message = By.xpath("//p[@class='text-start text-danger']//small[1]");

	// Declare Driver Instance
	// ==========================================
	private mobileAppContextDriver context;

	public webChome(mobileAppContextDriver context) {
		super();
		this.context = context;
	}

	@Given("User enter the fullName as {string}")
	public void userEnterTheFullNameAs(String fullName) {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.getWait().until(ExpectedConditions.presenceOfElementLocated(fullname_text));
		context.getAndroidDriver().findElement(fullname_text).sendKeys(fullName);
	}

	@Given("User enter the emailAddress as {string}")
	public void userEnterTheEmailAddressAs(String emailAddress) throws IOException {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.getWait().until(ExpectedConditions.presenceOfElementLocated(emailAddress_text));
		context.getAndroidDriver().findElement(emailAddress_text).sendKeys(emailAddress);
	}

	@When("User click on the Submit button")
	public void userClickOnTheSubmitButton() throws InterruptedException {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.getWait().until(ExpectedConditions.presenceOfElementLocated(submit_button));
	
		Actions actions = new Actions(context.getAndroidDriver());	
		actions.scrollByAmount(231, 995).build().perform();
		//actions.moveToElement(context.getAndroidDriver().findElement(submit_button)).click().build().perform();
		context.getAndroidDriver().findElement(submit_button).click();

	}

	@Then("User sees errorMessage")
	public void userSeesErrorMessage() throws InterruptedException, IOException {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.getWait().until(ExpectedConditions.presenceOfElementLocated(error_message));
		assertEquals(context.getAndroidDriver().findElement(error_message).getText()
				.equals("Please indicate that you have read and agree 'Terms of Use' and Privacy Policy"), true);
	}

}
