package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Alert {

	public static void main(String[] args) {
		 WebDriver d=new FirefoxDriver();
		 d.get("http://primusbank.qedgetech.com/");
		 d.manage().window().maximize();
		 Sleeper.sleepTightInSeconds(2);
		 //Login button
		 d.findElement(By.id("login")).click();
		 Sleeper.sleepTightInSeconds(2);
		 //Connect window to alerts
		 String src=d.switchTo().alert().getText();
		 System.out.println(src);
		 Sleeper.sleepTightInSeconds(2);
		 d.switchTo().alert().accept();

	}

}
