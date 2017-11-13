package ExtentReports;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo1 {
	
	ExtentReports report;
	ExtentTest test;
	WebDriver d;
	@BeforeSuite
	public void bfs()
	{
		report=new ExtentReports("./Report/learnReport.html");
		 test=report.startTest("Verify Browser");
	}
	
	@Test
	public void start()
	{
		
		 d=new FirefoxDriver();
		 
		d.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser opened");
		d.get("http://www.google.com");
		d.close();
		test.log(LogStatus.INFO, "Browser closed");
		report.endTest(test);
		report.flush();
	}
	
}
