package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class webAppHelper {

	public RemoteWebDriver initializeBrowser(String browserName) throws MalformedURLException {
		RemoteWebDriver driver = null;
		DesiredCapabilities dc = new DesiredCapabilities();

		if (browserName.equalsIgnoreCase("chrome")) {
			dc.setBrowserName("chrome");

		} else if (browserName.equalsIgnoreCase("firefox")) {
			dc.setBrowserName("firefox");

		} else if (browserName.equalsIgnoreCase("edge")) {
			dc.setBrowserName("MicrosoftEdge");

		} else if (browserName.equalsIgnoreCase("oepra")) {
			dc.setBrowserName("opera");

		} else if (browserName.equalsIgnoreCase("ie")) {
			dc.setBrowserName("ie");

		}

		driver = new RemoteWebDriver(new URL("http://localhost:4444"), dc);
		return driver;
	}

	public WebDriverWait initializeBrowserWait(RemoteWebDriver driver) throws MalformedURLException {

		return new WebDriverWait(driver, Duration.ofSeconds(10));

	}

}
