package com.TestNG.WebDriverClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertiongetTitle {
	WebDriver driver;
	
	@Test

	public void assert1() throws Exception
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.yahoo.com");
		Assert.assertEquals(driver.getTitle(), "Yahoo", "Title doesn't matched");
		System.out.println("Assertion passed");
		
		Assert.assertTrue(driver.getTitle().contains("Yahoo"), "Page title not matched");
		System.out.println("Page Title Matched");
		Thread.sleep(2000);
		driver.close();
		
	}
}
