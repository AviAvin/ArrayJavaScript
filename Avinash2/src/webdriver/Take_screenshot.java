package webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

 

public class Take_screenshot {

	public static void main(String[] args) throws IOException {
		 WebDriver d=new FirefoxDriver();
		 d.get("http://www.google.com/");
		 d.manage().window().maximize();
		 Sleeper.sleepTightInSeconds(2);
		 File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(scrFile, new File("D:\\workspace\\Launch.jpg"));
          		System.out.println("Screenshot done");
	}

}
