package mobileApp.AppName;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import helper.mobileAppContextDriver;
import helper.webAppHelper;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class mobileAppHook extends webAppHelper {

	// Declare Driver Instance
	// ==========================================
	private mobileAppContextDriver context;
	private String DestFile;
	private File SrcFile;

	public mobileAppHook(mobileAppContextDriver context) {
		super();
		this.context = context;
	}

	@Before
	public void setup(Scenario scenario) {
		System.out.println("Im in a BeforeScenario");
		System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
		context.setScenario(scenario);

	}

	@AfterStep
	public void afterStep() throws IOException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_hhmmssSSa");
		String timeStamp = sdf.format(date);
		DestFile = System.getProperty("user.dir") 
				+ "\\screenshots\\" 
				+ context.getScenario().getName() + "_"
				+ timeStamp + ".png";

		SrcFile = ((TakesScreenshot) context.getAndroidDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File(DestFile));
		context.getScenario().attach(
				FileUtils.readFileToByteArray(SrcFile),"image/png", context.getScenario().getStatus().toString());

	}

	@After
	public void tearDown() throws IOException {
		System.out.println("Im in a AfterScenario");
		System.out.println("AfterScenario - Thread ID" + Thread.currentThread().getId());

		context.getAndroidDriver().quit();
	}

}
