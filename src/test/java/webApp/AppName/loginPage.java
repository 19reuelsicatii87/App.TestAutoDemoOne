package webApp.AppName;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.webAppContextDriver;
import helper.webAppHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPage extends webAppHelper {

	// Declare Driver Instance
	// ==========================================
	private webAppContextDriver context;

	public loginPage(webAppContextDriver context) {
		super();
		this.context = context;

		PageFactory.initElements(context.getDriver(), this);
	}

	// Page Elements
	// ==========================================
	@FindBy(xpath = "mat-error[role='alert']")
	WebElement elementName;

	public loginPage() {

		PageFactory.initElements(context.getDriver(), this);
	}

	// Page Step Definition
	// =================================================
	@Given("User navigates to {string} using {string}")
	public void userNavigatesToUsing(String url, String browserName) throws MalformedURLException {
		context.setDriver(initializeBrowser(browserName));
		context.setWait(initializeBrowserWait(context.getDriver()));
		context.getDriver().get(url);
		context.getDriver().manage().window().maximize();

		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
	}

	@Given("User click on the login link")
	public void userClickOnTheLoginLink() {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
	}

	@Given("User enter the username as {string}")
	public void userEnterTheUsernameAs(String string) {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
	}

	@Given("User enter the password as {string}")
	public void userEnterThePasswordAs(String string) {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
	}

	@When("User click on the login button")
	public void userClickOnTheLoginButton() {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
	}

	@Then("Login should be success")
	public void loginShouldBeSuccess() {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
	}

	@Then("Login should fail")
	public void loginShouldFail() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
	}

}
