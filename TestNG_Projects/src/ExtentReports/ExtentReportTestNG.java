package ExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportTestNG {
   
	 ExtentReports rep;
	 ExtentTest logger;
	 WebDriver driver;
	
	
	@Test
	public void ExteRep() throws Exception
	{
	rep =new ExtentReports("./Report/report2.html");
	logger=rep.startTest("Verify Test Cases");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com/");
	logger.log(LogStatus.INFO, "Browser opened");
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	 
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")));
	driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
	logger.log(LogStatus.INFO, "Login page opened");
	
	driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("abinashkate");
	driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("avi@lipu7");
	driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
	Thread.sleep(2000);
	Assert.assertTrue(driver.getTitle().contains("Gmail"), "Not matched");
	System.out.println("Title Matched by Assertion");
	logger.log(LogStatus.INFO, "Inbox opened");
	driver.findElement(By.xpath("//span[@class='gb_bb gbii']")).click();
	driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
	
	Thread.sleep(2000);
	
	rep.close();
	rep.flush();
	driver.close();
	}
}
