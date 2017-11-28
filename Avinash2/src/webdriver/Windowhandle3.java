package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandle3 {
	public static void main(String args[])
	{
	WebDriver driver=new FirefoxDriver();
	
	
	   driver.get("https://online.citibank.com");
	   String myWindowHandle = driver.getWindowHandle();
	   driver.findElement(By.xpath(".//*[@id='facebookSprite']")).click();
	// sleep for a bit
	   try {
	    Thread.sleep(3000L);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }   
	   // Returns a set of 1 in IE 8 returns a set of 2 in IE 7 
	    Set<String> handles = driver.getWindowHandles() ;

	    for(String winHandle : driver.getWindowHandles()){
	             if(myWindowHandle.equalsIgnoreCase(winHandle))
	                continue; 
	             driver.switchTo().window(winHandle);
	         
	         String shipperURL =  driver.getCurrentUrl();
	         driver.close();
	}
	         driver.switchTo().window(myWindowHandle);


	}

}
