package webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Screen_Comparision {

	public static void main(String[] args) throws IOException {
		 WebDriver d=new FirefoxDriver();
		 d.get("http://www.google.com/");
		 d.manage().window().maximize();
		 Sleeper.sleepTightInSeconds(2);
		 File Screen1= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(Screen1, new File("D:\\workspace\\screen3.jpg"));
		 d.get("http://www.google.com/");
		 File Screen2=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(Screen2, new File("D:\\workspace\\screen4.jpg"));
		 if(FileUtils.contentEquals(Screen1, Screen2))
		 {
			 System.out.println("Screens are same");
		 }
		 else
		 {
			 System.out.println("Screens are not same");
		 }
	}

}
