package mobileApp.AppName;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import helper.mobileAppContextDriver;
import helper.mobileAppHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class commonStep extends mobileAppHelper {

	// Declare Driver Instance
	// ==========================================
	private mobileAppContextDriver context;

	public commonStep(mobileAppContextDriver context) {
		super();
		this.context = context;
	}

	@Given("User opens {string} App")
	public void userOpensApp(String string) throws MalformedURLException, InterruptedException {
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.setAppiumDriver(initializeMobile(string));
		context.setWait(initializeMobileWait(context.getAppiumDriver()));
		if (string.equals("webChrome")) {
			context.getAppiumDriver().get("https://everra.net/contact-us");
		}
		Thread.sleep(10000);

	}
}
