package mobileApp.AppName;

import java.net.MalformedURLException;

import helper.mobileAppContextDriver;
import helper.mobileAppHelper;
import io.cucumber.java.en.Given;

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
		context.setAndroidDriver(initializeAndroidDriver(string));
		context.setWait(initializeMobileWait(context.getAndroidDriver()));
		if (string.equals("webChrome")) {
			context.getAndroidDriver().get("https://everra.net/contact-us");
		}
		Thread.sleep(10000);

	}
}
