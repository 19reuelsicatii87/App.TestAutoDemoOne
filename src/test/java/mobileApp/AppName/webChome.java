package mobileApp.AppName;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import helper.mobileAppContextDriver;
import helper.mobileAppHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class webChome extends mobileAppHelper {

	// Page Elements
	// ==========================================
	By login_link = By.xpath("(//span[text()='Login'])[1]/..");
	By username_textfield = By.cssSelector("input[formcontrolname='username']");
	By password_textfield = By.cssSelector("input[formcontrolname='password']");
	By login_button = By.xpath("(//span[text()='Login'])[last()]/..");
	By profile_link = By.xpath("//button[contains(@class,'mat-focus-indicator mat-menu-trigger')]//span[1]");
	By alert_message = By.cssSelector("mat-error[role='alert']");

	// Declare Driver Instance
	// ==========================================
	private mobileAppContextDriver context;

	public webChome(mobileAppContextDriver context) {
		super();
		this.context = context;
	}

	@Given("User click on the login link")
	public void userClickOnTheLoginLink() {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.getWait().until(ExpectedConditions.presenceOfElementLocated(login_link));
		context.getAppiumDriver().findElement(login_link).click();
	}

	@Given("User enter the username as {string}")
	public void userEnterTheUsernameAs(String username) {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.getAppiumDriver().findElement(username_textfield).sendKeys(username);
	}

	@Given("User enter the password as {string}")
	public void userEnterThePasswordAs(String password) throws IOException {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.getAppiumDriver().findElement(password_textfield).sendKeys(password);
	}

	@When("User click on the login button")
	public void userClickOnTheLoginButton() {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.getWait().until(ExpectedConditions.presenceOfElementLocated(login_button));
		context.getAppiumDriver().findElement(login_button).click();
	}

	@Then("Login should be success")
	public void loginShouldBeSuccess() throws InterruptedException, IOException {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.getWait().until(ExpectedConditions.presenceOfElementLocated(profile_link));
		assertEquals(context.getAppiumDriver().findElement(profile_link).isDisplayed(), true);
	}

}
