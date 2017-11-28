package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("amarendra.pani@yahoo.in");
		driver.findElement(By.id("pass")).sendKeys("sweetmother");
		Thread.sleep(2000);
		driver.findElement(By.id(" loginbutton")).click();
		
		/*driver.findElement(By.xpath("//*[@id='userNavigationLabel']a")).click();
		driver.findElement(By.xpath("//*[@id='js_97']/div/div/ul/li[17]/a/span/span")).click();*/
		
	}

}
