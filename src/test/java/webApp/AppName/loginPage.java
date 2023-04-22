package webApp.AppName;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.GherkinKeyword;

import helper.webAppContextDriver;
import helper.webAppHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webApp.AppName.pageObject.LoginPage;
import webApp.AppName.pageObject.PageObject;
import webApp.AppName.pageObject.ObjectService;

public class loginPage extends webAppHelper {

	// Page Elements
	// ==========================================
	By login_link = By.xpath("(//span[text()='Login'])[1]/..");
	By username_textfield = By.cssSelector("input[formcontrolname='username']");
	By password_textfield = By.cssSelector("input[formcontrolname='password']");
	By login_button = By.xpath("(//span[text()='Login'])[last()]/..");
	By profile_link = By.xpath("//button[contains(@class,'mat-focus-indicator mat-menu-trigger')]//span[1]");
	By alert_message = By.cssSelector("mat-error[role='alert']");

	PageObject loginPage = new PageObject(new LoginPage());

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
	public void userNavigatesToUsing(String url, String browserName)
			throws MalformedURLException, ClassNotFoundException {

		try {
			// Step Definition
			context.setDriver(initializeBrowser(browserName));
			context.setWait(initializeBrowserWait(context.getDriver()));
			context.getDriver().get(url);
			context.getDriver().manage().window().maximize();

			// Extent Report
			context.getExtentTestScenario()
					.createNode(new GherkinKeyword("When"), "User navigates to " + url + " using " + browserName)
					.pass("PASSED");

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario()
						.createNode(new GherkinKeyword("When"), "User navigates to " + url + " using " + browserName)
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Given("User click on the login link")
	public void userClickOnTheLoginLink() throws ClassNotFoundException {

		try {
			// Step Definition
			System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
			context.getWait().until(ExpectedConditions.presenceOfElementLocated(loginPage.getElement("login_link")));
			context.getDriver().findElement(loginPage.getElement("login_link")).click();

			// Extent Report
			context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "User click on the login link")
					.pass("PASSED");

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "User click on the login link")
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Given("User enter the username as {string}")
	public void userEnterTheUsernameAs(String username) throws ClassNotFoundException {

		try {
			// Step Definition
			System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
			context.getDriver().findElement(username_textfield).sendKeys(username);

			// Extent Report
			context.getExtentTestScenario()
					.createNode(new GherkinKeyword("When"), "User enter the username as " + username).pass("PASSED");

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario()
						.createNode(new GherkinKeyword("When"), "User enter the username as " + username)
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Given("User enter the password as {string}")
	public void userEnterThePasswordAs(String password) throws IOException, ClassNotFoundException {

		try {
			// Step Definition
			System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
			context.getDriver().findElement(password_textfield).sendKeys(password);

			// Extent Report
			context.getExtentTestScenario()
					.createNode(new GherkinKeyword("When"), "User enter the password as " + password).pass("PASSED");

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario()
						.createNode(new GherkinKeyword("When"), "User enter the password as " + password)
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@When("User click on the login button")
	public void userClickOnTheLoginButton() throws ClassNotFoundException {

		try {
			// Step Definition
			System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
			context.getWait().until(ExpectedConditions.presenceOfElementLocated(login_button));
			context.getDriver().findElement(login_button).click();

			// Extent Report
			context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "User click on the login button")
					.pass("PASSED");

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "User click on the login button")
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Then("User sees that login is successful")
	public void loginShouldBeSuccess() throws InterruptedException, IOException, ClassNotFoundException {

		try {
			// Step Definition
			System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
			context.getWait().until(ExpectedConditions.presenceOfElementLocated(profile_link));
			context.getSoftAssert().assertEquals(context.getDriver().findElement(profile_link).isDisplayed(), true);

			// Extent Report
			context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "User sees that login is successful")
					.pass("PASSED");

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario()
						.createNode(new GherkinKeyword("When"), "User sees that login is successful")
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Then("User sees that login is not successful")
	public void loginShouldFail() throws InterruptedException, ClassNotFoundException {

		try {
			// Step Definition
			System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
			context.getWait().until(ExpectedConditions.presenceOfElementLocated(alert_message));
			String text = context.getDriver().findElement(alert_message).getText();
			context.getSoftAssert().assertEquals(text.trim(), "Username or Password is incorrect.");

			// Extent Report
			context.getExtentTestScenario()
					.createNode(new GherkinKeyword("When"), "User sees that login is not successful").pass("PASSED");

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario()
						.createNode(new GherkinKeyword("When"), "User sees that login is not successful")
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
