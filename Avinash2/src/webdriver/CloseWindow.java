package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
 

public class CloseWindow {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 d.get("https://www.naukri.com/");
		 
		 d.findElement(By.linkText("Employer Zone")).click();
		  
		 d.findElement(By.linkText("Report a Problem")).click();
		 
		  Thread.sleep(2000);
		  Actions actions = new Actions(d);
		  WebElement element = d.findElement(By.xpath("//contains[ text()='Post Resume']"));
		  actions.moveToElement(element).click();
		 // d.findElement(By.linkText("Post Resume")).click(); 
		// d.findElement(By.xpath("//a[text()='Post Resume']")).click();
		  
		 d.findElement(By.linkText("Contact Us")).click();
		 
		 
		 
		// WebDriver childDriver = Utility.getHandleToWindow("Title");
		 
			 System.out.println("its ok");
		     }

	 }


