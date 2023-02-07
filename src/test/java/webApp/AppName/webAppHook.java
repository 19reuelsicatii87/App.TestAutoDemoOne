package webApp.AppName;

import org.openqa.selenium.support.PageFactory;

import helper.webAppContextDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class webAppHook {
	
	// Declare Driver Instance
	// ==========================================
	private webAppContextDriver context;

	public webAppHook(webAppContextDriver context) {
		super();
		this.context = context;

		PageFactory.initElements(context.getDriver(), this);
	}
	
	@Before
	public void setup() {
		System.out.println("Im in a BeforeScenario");
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId() );
	}
	
	@After
	public void tearDown() {
		System.out.println("Im in a AfterScenario");
		System.out.println("AfterScenario - Thread ID" + Thread.currentThread().getId() );
		context.getDriver().quit();
	}
	
}
