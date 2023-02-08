package webApp.AppName;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import helper.webAppContextDriver;
import helper.webAppHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPage extends webAppHelper {

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
	private webAppContextDriver context;

	public loginPage(webAppContextDriver context) {
		super();
		this.context = context;
	}

	// Page Step Definition
	// =================================================
	@Given("User navigates to {string} using {string}")
	public void userNavigatesToUsing(String url, String browserName) throws MalformedURLException {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.setDriver(initializeBrowser(browserName));
		context.setWait(initializeBrowserWait(context.getDriver()));
		context.getDriver().get(url);
		context.getDriver().manage().window().maximize();
	}

	@Given("User click on the login link")
	public void userClickOnTheLoginLink() {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.getWait().until(ExpectedConditions.presenceOfElementLocated(login_link));
		context.getDriver().findElement(login_link).click();
	}

	@Given("User enter the username as {string}")
	public void userEnterTheUsernameAs(String username) {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.getDriver().findElement(username_textfield).sendKeys(username);
	}

	@Given("User enter the password as {string}")
	public void userEnterThePasswordAs(String password) {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.getDriver().findElement(password_textfield).sendKeys(password);
	}

	@When("User click on the login button")
	public void userClickOnTheLoginButton() {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.getWait().until(ExpectedConditions.presenceOfElementLocated(login_button));
		context.getDriver().findElement(login_button).click();
	}

	@Then("Login should be success")
	public void loginShouldBeSuccess() throws InterruptedException {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.getWait().until(ExpectedConditions.presenceOfElementLocated(profile_link));
		assertEquals(context.getDriver().findElement(profile_link).isDisplayed(), true);
	}

	@Then("Login should fail")
	public void loginShouldFail() throws InterruptedException {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.getWait().until(ExpectedConditions.presenceOfElementLocated(alert_message));
		String text = context.getDriver().findElement(alert_message).getText();
		assertEquals(text.trim(), "Username or Password is incorrect.");
	}

}
