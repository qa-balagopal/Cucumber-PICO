package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import context.TestContextUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps {
	private static String title;
	TestContextUI testContextUI;

	public LoginPageSteps(TestContextUI testContextUI) {
		this.testContextUI = testContextUI;
	}

	@Given("user is on login page1")
	public void user_is_on_login_page1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		testContextUI.setDriver(driver);
		testContextUI.initializePageObjects(driver);
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_login_page() {
		title = testContextUI.getLoginpage().getLoginPageTitle();
		System.out.println("login page title is:" + title);

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		title = testContextUI.getLoginpage().getLoginPageTitle();

		Assert.assertEquals(title, expectedTitleName);
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		Assert.assertTrue(testContextUI.getLoginpage().isForgotPwdLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		testContextUI.getLoginpage().enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		testContextUI.getLoginpage().enterPassword(password);

	}

}
