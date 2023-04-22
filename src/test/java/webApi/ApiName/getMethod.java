package webApi.ApiName;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.GherkinKeyword;

import helper.webApiContextDriver;
import helper.webApiHelper;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getMethod extends webApiHelper {

	// Declare Driver Instance
	// ==========================================
	private webApiContextDriver context;

	public getMethod(webApiContextDriver context) {
		super();
		this.context = context;
	}

	@Then("App receives a response status {int}")
	public void appReceivesAResponseStatus(Integer int1) {

		try {
			// Step Definition
			System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());

			if (int1.equals(context.getResponse().getStatusCode())) {
				// Extent Report
				context.getExtentTestScenario()
						.createNode(new GherkinKeyword("When"), "App receives a response status " + int1)
						.pass("PASSED");
				context.getExtentTestScenario().createNode(" ======================================== ")
						.pass("RESPONSE HEADER: <br>" + context.getResponse().getHeaders().toString());

			} else {
				// Extent Report
				context.getExtentTestScenario()
						.createNode(new GherkinKeyword("When"), "App receives a response status " + int1)
						.fail("FAILED <br>" 
						+ " <i>Expected: </i> " + int1 
						+ "<br><i>Actual: </i>" + context.getResponse().getStatusCode());
				context.getExtentTestScenario().createNode(" ======================================== ")
						.fail("RESPONSE HEADER: <br>" + context.getResponse().getHeaders().toString());

			}

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario()
						.createNode(new GherkinKeyword("When"), "App receives a response status " + int1)
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	@Then("App receives a response Body")
	public void appReceivesAResponseBody() {

		try {
			// Step Definition
			System.out.println("BeforeScenario - Thread ID" + Thread.currentThread().getId());
			context.getSoftAssert().assertEquals(!context.getResponse().getBody().prettyPrint().isEmpty(), true);

			if (!context.getResponse().getBody().prettyPrint().isEmpty()) {

				// Extent Report
				context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "App receives a response Body")
						.pass("PASSED");
				context.getExtentTestScenario().createNode(" ======================================== ")
						.pass("RESPONSE BODY: <br>" + context.getResponse().getBody().prettyPrint());

			} else {

				// Extent Report
				context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "App receives a response Body")
						.fail("FAILED");
				context.getExtentTestScenario().createNode(" ======================================== ")
						.fail("RESPONSE BODY: <br>" + context.getResponse().getBody().prettyPrint());
			}

		} catch (Exception e) {

			// Extent Report
			try {
				context.getExtentTestScenario().createNode(new GherkinKeyword("When"), "App receives a response Body")
						.fail("FAILED: " + e.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	// TestNG Annotations
	// ========================================================================================================================

	@BeforeMethod
	public void setup() {

		// setUp function here
		System.out.println("BEFORE METHOD - POST");
		System.out.println("================================================");
	}

	@Test
	public void listAllUser() {

		// Create GET Request
		// ===========================================
		RestAssured.baseURI = "https://reqres.in/api/users";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get();

		// Store Response
		// ===========================================
		System.out.println("List All  User");
		System.out.println("Thread ID: " + Thread.currentThread().getId());
		System.out.println(response.prettyPrint());

	}

	@Test
	public void listOneUser() {

		// Create GET Request
		// ===========================================
		RestAssured.baseURI = "https://reqres.in/api/users/2";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get();

		// Store Response
		// ===========================================
		System.out.println("List One User");
		System.out.println("Thread ID: " + Thread.currentThread().getId());
		System.out.println(response.prettyPrint());

	}

	@AfterMethod
	public void tearDown() {

		// tearDown function here
		System.out.println("AFTER METHOD - GET");
		System.out.println("================================================");

	}

}
