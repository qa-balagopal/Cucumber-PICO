package com.pages;

import org.openqa.selenium.WebDriver;

public class CommonPage {
	private WebDriver driver;

	
	public CommonPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	 
	
}
