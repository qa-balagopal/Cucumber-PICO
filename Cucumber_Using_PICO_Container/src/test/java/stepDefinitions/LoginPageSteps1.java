package stepDefinitions;

import context.TestContextUI;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps1 {
	TestContextUI testContextUI;

	public LoginPageSteps1(TestContextUI testContextUI) {
		this.testContextUI = testContextUI;
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		System.out.println(testContextUI.getDriver());
		testContextUI.getLoginpage().ClickOnLogin();
	}

	@Then("user Clicks on Address page")
	public void user_Clicks_on_Address_page() {
		testContextUI.getMyaccountpage().selectAddress();
	}

}
