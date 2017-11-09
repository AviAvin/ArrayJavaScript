package com.TestNG.WebDriverClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchBr {
	@Test
	public void start()
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://fb.com");
		Reporter.log("url launched");
		driver.close();
	}
}
