package context;

import org.openqa.selenium.WebDriver;

import com.pages.CommonPage;
import com.pages.LoginPage;
import com.pages.MyAccountPage;

public class TestContextUI {
	WebDriver driver;
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	CommonPage commonpage;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginpage() {
		return loginpage;
	}

	public MyAccountPage getMyaccountpage() {
		return myaccountpage;
	}

	public CommonPage getCommonpage() {
		return commonpage;
	}

	public void initializePageObjects(WebDriver driver) {
		loginpage = new LoginPage(driver);
		myaccountpage = new MyAccountPage(driver);
		commonpage = new CommonPage(driver);
	}

}
