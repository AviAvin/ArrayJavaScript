package webdriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriPageHandle {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		driver.get("https://www.naukri.com/");
		String parentWin=driver.getWindowHandle();
		  //for multiple win
		   Set<String> s1=driver.getWindowHandles();
		   //for iteration
		   
		   Iterator<String> I1=s1.iterator();
		   
		   while(I1.hasNext())
		   {
			  
			   String childWin=I1.next();
			   if(!parentWin.equalsIgnoreCase(childWin))
			   {
				   driver.switchTo().window(childWin);
				   Thread.sleep(1000);
				   System.out.println(driver.getTitle());
				   driver.close();
			   }
			   
			   
			   
		   }
		   
		   
		driver.switchTo().window(parentWin);
		 System.out.println("Naukri opened");
		
        
		driver.findElement(By.linkText("Employer Zone")).click();
		 System.out.println("Employer opened");
	    
	    		
		driver.findElement(By.linkText("Report a Problem")).click();
		 System.out.println("report prob opened");
		 
		 Set<String>allwin=driver.getWindowHandles();
		 ArrayList<String>tab=new ArrayList(allwin);
		 driver.switchTo().window(tab.get(2));
		 
		
		Thread.sleep(2000);
		//driver.switchTo().window(parentWin);
		driver.findElement(By.xpath(".//*[@id='footN']/div[2]/div[1]/div/a[1]")).click();
		System.out.println("post resume opend");
		//driver.findElement(By.linkText("Post Resume")).click();
		//Thread.sleep(5000);
		//driver.switchTo().window(parentWin);
		 
		//Actions a = new Actions(driver);
		//a.sendKeys(Keys.chord(Keys.ALT,"TAB")).perform();
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.ALT+ "TAB"+"TAB");
		//driver.findElement(By.xpath(".//*[@id='footN']/div[2]/div[1]/div/a[1]")).click();
		//driver.findElement(By.linkText("Post Resume")).click();
		Thread.sleep(5000);
		driver.switchTo().window(tab.get(1));
		Thread.sleep(5000);
		driver.close();
		System.out.println("Employer window closed");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
