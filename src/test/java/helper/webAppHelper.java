package helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webAppHelper {

	public static Properties properties;

	public static String GetPropertValue(String Path, String Key) {

		properties = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(Path);
			properties.loadFromXML(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return properties.getProperty(Key);

	}

	public RemoteWebDriver initializeBrowser(String browserName) throws MalformedURLException {
		RemoteWebDriver driver = null;
		DesiredCapabilities dc = new DesiredCapabilities();

		if (GetPropertValue("Data/TestProperties.xml", "Grid").equalsIgnoreCase("Browser")) {
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

		} else if (GetPropertValue("Data/TestProperties.xml", "Grid").equalsIgnoreCase("BrowserStack")) {
			dc.setCapability("os", GetPropertValue("Data/TestProperties.xml", "os"));
			dc.setCapability("os_version", GetPropertValue("Data/TestProperties.xml", "os_version"));
			dc.setCapability("browser", browserName);
			dc.setCapability("browser_version", GetPropertValue("Data/TestProperties.xml", "browser_version"));
			dc.setCapability("name", "BrowserStack - Grid AutoDemo");

			driver = new RemoteWebDriver(
					new URL("https://licenses_l5aIeD:QYTmGxxvTJ9bxLAERqYU@hub-cloud.browserstack.com/wd/hub"), dc);

		}

		return driver;
	}

	public WebDriverWait initializeBrowserWait(RemoteWebDriver driver) throws MalformedURLException {

		return new WebDriverWait(driver, Duration.ofSeconds(30));

	}

}
