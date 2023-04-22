package webApi.ApiName;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.post;
import static io.restassured.RestAssured.reset;

import com.aventstack.extentreports.GherkinKeyword;

import helper.webApiContextDriver;
import helper.webApiHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;

public class CommonSteps extends webApiHelper {

	// Declare Driver Instance
	// ==========================================
	private webApiContextDriver context;

	public CommonSteps(webApiContextDriver context) {
		super();
		this.context = context;
	}

	@Given("App draft RequestSpecBuilder")
	public void appDraftRequestSpecBuilder() throws ClassNotFoundException {

		try {
			// Step Definition
			context.setRestAssured();
			context.setRequestSpecBuilder();
			context.setRequestParams();

			// Extent Report
			context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "App draft RequestSpecBuilder")
					.pass("PASSED");

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "App draft RequestSpecBuilder")
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Given("App set baseURI to {string}")
	public void appSetBasePathTo(String string) throws ClassNotFoundException {

		try {
			// Step Definition
			context.getRequestSpecBuilder().setBaseUri(string);

			// Extent Report
			context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "App set baseURI to " + string)
					.pass("PASSED");

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "App set baseURI to " + string)
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Given("App set basePath to {string}")
	public void appSetBaseURITo(String string) throws ClassNotFoundException {

		try {
			// Step Definition
			context.getRequestSpecBuilder().setBasePath(string);

			// Extent Report
			context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "App set basePath to " + string)
					.pass("PASSED");

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "App set basePath to " + string)
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Given("App set queryString to Key as {string} with Value as {string}")
	public void appSetQueryStringToKeyAsWithValueAs(String string, String string2) {

		try {
			// Step Definition
			context.getRequestSpecBuilder().addHeader(string, string2);

			// Extent Report
			context.getExtentTestScenario().createNode(new GherkinKeyword("When"),
					"App set queryString to Key as " + string + " with Value as " + string2).pass("PASSED");

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario()
						.createNode(new GherkinKeyword("When"),
								"App set queryString to Key as " + string + " with Value as " + string2)
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Given("App set formString to Key as {string} with Value as {string}")
	public void appSetFormStringToKeyAsWithValueAs(String string, String string2) {

		try {
			// Step Definition
			// context.getRequestParams().addProperty(string, string2);
			context.getRequestParams().addProperty(string, string2);

			// Extent Report
			context.getExtentTestScenario().createNode(new GherkinKeyword("When"),
					"App set formString to Key as " + string + " with Value as " + string2).pass("PASSED");

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario()
						.createNode(new GherkinKeyword("When"),
								"App set formString to Key as " + string + " with Value as " + string2)
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@SuppressWarnings("static-access")
	@When("App execute a GET Request")
	public void appExecuteAGETRequest() throws ClassNotFoundException {

		try {
			// Step Definition
			context.setResponse(context.getRestAssured().given().spec(context.getRequestSpecBuilder().build()).get());

			// Extent Report
			context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "App execute a GET Request")
					.pass("PASSED");

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "App execute a GET Request")
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	@SuppressWarnings("static-access")
	@When("App execute a POST Request")
	public void appExecuteAPOSTRequest() throws ClassNotFoundException {

		try {
			// Step Definition
			context.setResponse(context.getRestAssured().given().header("Content-Type", "application/json")
					.body(context.getRequestParams().toString()).spec(context.getRequestSpecBuilder().build()).post());

			// Extent Report
			context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "App execute a POST Request")
					.pass("PASSED");

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "App execute a POST Request")
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	@When("^I reset RequestSpecification$")
	public void i_reset_RequestSpecification() throws Throwable {

		reset();

	}

	@When("^I remove \"([^\"]*)\" parameter$")
	public void i_remove_VALUE_parameter(String arg0) throws Throwable {

		reqB.removeParam(arg0);

	}

	@When("^I attached response to JsonPath$")
	public void I_attached_response_to_JsonPath() {

		jp = new JsonPath(Resp.asString());
		// System.out.println(Resp.asString());

	}

	@When("^I retrieve token$")
	public void I_retrieve_token() {

		Token = jp.getString("response.data.token");
		// System.out.println("TOKEN: " + Token);
	}

	@When("^I execute a GET method$")
	public void I_execute_a_GET_method() {

		Resp = get();
		// System.out.println(Resp.asString());

	}

	@When("^I execute a POST method$")
	public void i_execute_a_POST_method() throws Throwable {

		Resp = post();
		// System.out.println(Resp.asString());

	}

}
