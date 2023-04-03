package mobileApp.AppName;

import java.net.MalformedURLException;

import com.aventstack.extentreports.GherkinKeyword;

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

		try {
			// Step Definition
			System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
			context.setAndroidDriver(initializeAndroidDriver(string));
			context.setWait(initializeMobileWait(context.getAndroidDriver()));
			if (string.equals("webChrome")) {
				context.getAndroidDriver().get("https://everra.net/contact-us");
			}
			Thread.sleep(10000);

			// Extent Report
			context.getExtentTestScenario().createNode(new GherkinKeyword("When"),
					"User opens "+ string +" App").pass("PASSED");

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario()
						.createNode(new GherkinKeyword("When"),
								"User opens "+ string +" App").pass("PASSED")
						.fail("FALIED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
}
