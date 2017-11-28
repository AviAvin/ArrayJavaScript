package webdriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Multiple_ScreenShots {

	public static void main(String[] args) throws IOException {
		WebDriver d=new FirefoxDriver();
		 d.get("http://www.newtours.demoaut.com/");
		 d.manage().window().maximize();
		 Sleeper.sleepTightInSeconds(2);
		List<WebElement> lks=d.findElements(By.tagName("a"));
		System.out.println(lks.size());
		
		for(int i=0;i<lks.size();i++)
		{
			String str=lks.get(i).getText();
		
		    lks.get(i).click();
		    Sleeper.sleepTightInSeconds(2);
		//For Screen Shots 
		 
		 
		 File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(scrFile, new File("D:\\workspace\\Screen-"+str+",.jpg"));
		 Sleeper.sleepTightInSeconds(2);	
		 d.navigate().back();	
		 lks=d.findElements(By.tagName("a"));

	}

}
}
