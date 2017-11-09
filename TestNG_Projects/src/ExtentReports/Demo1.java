package ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo1 {
	
	ExtentReports report;
	ExtentTest test;
	
	
	@Test
	public void start()
	{
		 report=new ExtentReports("D:/learnReport.html");
		 report.startTest("Verify Browser");
		WebDriver d=new FirefoxDriver();
		 
		d.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser opened");
		d.get("http://www.google.com");
		d.close();
	}

}
