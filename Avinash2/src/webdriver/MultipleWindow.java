package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow {

	public static void main(String[] args) throws Exception {
		WebDriver d=new FirefoxDriver();
		d.get("http://yahoo.com");
		d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		d.get("http://google.com/");
		Thread.sleep(2000);
		d.close();

	}

}
