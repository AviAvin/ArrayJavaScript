package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
 
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		 driver.get("http://www.google.com/");
		 WebElement element = driver.findElement(By.name("q"));

		 if(element.isEnabled()) {
		     System.out.println("Enabled");
		     element.sendKeys("Selenium");
		     
		     WebDriverWait wait = new WebDriverWait (driver,15); 
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));
		     //driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		 }
        //driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("Selenium");
        
        
        
      
        driver.close();

	}

}
