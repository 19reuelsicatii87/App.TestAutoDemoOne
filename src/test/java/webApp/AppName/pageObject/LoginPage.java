package webApp.AppName.pageObject;

import org.openqa.selenium.By;

public class LoginPage implements ObjectService {

	// Page Elements
	// ==========================================
	private By elementName;
	private By login_link = By.xpath("(//span[text()='Login'])[1]/..");
	private By username_textfield = By.cssSelector("input[formcontrolname='username']");
	private By password_textfield = By.cssSelector("input[formcontrolname='password']");
	private By login_button = By.xpath("(//span[text()='Login'])[last()]/..");

	public By getElement(String elementName) {

		switch (elementName) {
		case "login_link":
			this.elementName = login_link;
			break;
		case "username_textfield":
			this.elementName = username_textfield;
			break;
		case "password_textfield":
			this.elementName = password_textfield;
			break;
		case "login_button":
			this.elementName = login_button;
			break;
		default:
			// code block
		}

		return this.elementName;

	};

}
