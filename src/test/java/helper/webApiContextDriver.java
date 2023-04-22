package helper;

import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.google.gson.JsonObject;

import io.cucumber.java.Scenario;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseOptions;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class webApiContextDriver {

	private RestAssured restAssured;
	private RequestSpecBuilder requestSpecBuilder;
	private Response response;
	private JsonObject requestParams;	

	private Scenario scenario;
	private SoftAssert softAssert;
	private ExtentTest extentTestFeature;
	private ExtentTest extentTestScenario;
	
	
	
	
	public JsonObject getRequestParams() {
		return requestParams;
	}

	public void setRequestParams() {
		this.requestParams = new JsonObject();
	}

	public RestAssured getRestAssured() {
		return restAssured;
	}

	public void setRestAssured() {
		this.restAssured = new RestAssured();
	}
	
	public void setResponse(Response response) {
		this.response = response;
	}

	public Response getResponse() {
		return response;
	}

	public void setRequestSpecBuilder() {
		this.requestSpecBuilder = new RequestSpecBuilder();
	}

	public RequestSpecBuilder getRequestSpecBuilder() {
		return requestSpecBuilder;
	}

	public ExtentTest getExtentTestFeature() {
		return extentTestFeature;
	}

	public void setExtentTestFeature(ExtentTest extentTestFeature) {
		this.extentTestFeature = extentTestFeature;
	}

	public ExtentTest getExtentTestScenario() {
		return extentTestScenario;
	}

	public void setExtentTestScenario(ExtentTest extentTestScenario) {
		this.extentTestScenario = extentTestScenario;
	}

	public Scenario getScenario() {
		return scenario;
	}

	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}

	public SoftAssert getSoftAssert() {
		return softAssert;
	}

	public void setSoftAssert() {
		this.softAssert = new SoftAssert();
	}

}
