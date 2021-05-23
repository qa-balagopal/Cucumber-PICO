package AppHooks;


import context.TestContextUI;
import io.cucumber.java.After;

public class ApplicationHooks {

	TestContextUI testContextUI;
	 public ApplicationHooks(TestContextUI testContextUI) {
		 this.testContextUI=testContextUI;
	}


	@After(order=0)
	public void quitBrowser() {
		testContextUI.getCommonpage().closeBrowser();
	}

	}
