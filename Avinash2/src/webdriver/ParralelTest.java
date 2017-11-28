package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParralelTest {
	 
		 
		private WebDriver driver;
		String baseURL = "http://www.google.com/";
		
		@BeforeTest
		@Parameters(value={"browser= Firefox"}) 
		
		public void openBrowser(String browser) {
			try {
				if (browser.equalsIgnoreCase("Firefox"))
				{
					driver = new FirefoxDriver();
				} else if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver",
							"C:/Users/lenovo/Downloads/Compressed/chromedriver_win32/chromedriver.exe");
					driver = new ChromeDriver();
				} else if (browser.equalsIgnoreCase("IE")) {
					System.setProperty("webdriver.ie.driver",
							"C:/Users/lenovo/Downloads/Compressed/IEDriverServer_Win32_2.47.0/IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				}
			
			} catch (WebDriverException e) {
				System.out.println(e.getMessage());
			}
		}

		@Test
		public void login_TestCase() {
			driver.navigate().to("http://www.google.com/");
	                //do something
		}

		@Test
		public void search_TestCase() {
			driver.navigate().to(baseURL);
	             //do something
		}

		@AfterTest
		public void closeBrowser() {
			driver.quit();
		} 
	}



