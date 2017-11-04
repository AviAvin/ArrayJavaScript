package com.TestNG.WebDriverClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Launchbr1 {
	@Test
	public void kick()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.close();
	}

}
