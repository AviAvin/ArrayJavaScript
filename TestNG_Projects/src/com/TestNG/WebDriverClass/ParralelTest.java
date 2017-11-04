package com.TestNG.WebDriverClass;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
 
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParralelTest {
	WebDriver driver;
	
	@Test
	 
	@Parameters("browser") 
	
	public void setup(String browserN) throws Exception {
		
		
			if (browserN.equalsIgnoreCase("Firefox"))
			{
			 driver = new FirefoxDriver();
			} else if (browserN.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
		"C:/Users/lenovo/Downloads/Compressed/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserN.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
		"C:/Users/lenovo/Downloads/Compressed/IEDriverServer_Win32_2.47.0/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			 Thread.sleep(6000);
			driver.get("http://www.google.com");
		    driver.close();
		    
	}
	   
	  }
 

	








