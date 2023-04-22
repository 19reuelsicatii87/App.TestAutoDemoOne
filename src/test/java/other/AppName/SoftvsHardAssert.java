package other.AppName;

import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import helper.webAppContextDriver;

public class SoftvsHardAssert {

	// Declare Driver Instance
	// ==========================================
	private webAppContextDriver context;
	SoftAssert softAssetion = new SoftAssert();

	public SoftvsHardAssert(webAppContextDriver context) {
		super();
		this.context = context;
	}

	@Given("Test HardAssert01 {string} {string} {string}")
	public void testHardAsset01(String string, String string2, String string3) throws ClassNotFoundException {

		/*
		 * context.getExtentTestScenario().createNode(new GherkinKeyword("Then"),
		 * "he has a receipt").fail( "Expected: Expected Description Here" +
		 * "   ------   " + "ActualResult: ActualResult Description Here");
		 */

		System.out.println(string + string2 + string3);
	}

	@When("Test HardAssert02 {string} {string} {string}")
	public void testHardAsset02(String string, String string2, String string3) throws ClassNotFoundException {

		/*
		 * context.getExtentTestScenario().createNode(new GherkinKeyword("Then"),
		 * "he has a receipt").fail( "Expected: Expected Description Here" +
		 * "   ------   " + "ActualResult: ActualResult Description Here");
		 */
		System.out.println(string + string2 + string3);

	}

	@Given("Test SoftAsset01 {string} {string} {string}")
	public void testSoftAsset01(String string, String string2, String string3) throws ClassNotFoundException {

		/*
		 * context.getExtentTestScenario().createNode(new GherkinKeyword("Then"),
		 * "he has a receipt").fail( "Expected: Expected Description Here" +
		 * "   ------   " + "ActualResult: ActualResult Description Here");
		 */
		System.out.println(string + string2 + string3);

	}

	@When("Test SoftAsset02 {string} {string} {string}")
	public void testSoftAsset02(String string, String string2, String string3) throws ClassNotFoundException {
		System.out.println(string + string2 + string3);

		/*
		 * context.getExtentTestScenario().createNode(new GherkinKeyword("Then"),
		 * "he has a receipt").fail( "Expected: Expected Description Here" +
		 * "   ------   " + "ActualResult: ActualResult Description Here");
		 */
	}

	@When("Test SoftAsset03")
	public void testSoftAsset03() throws ClassNotFoundException {

		/*
		 * context.getExtentTestScenario().createNode(new GherkinKeyword("Then"),
		 * "he has a receipt").fail( "Expected: Expected Description Here" +
		 * "   ------   " + "ActualResult: ActualResult Description Here");
		 */

	}

}
