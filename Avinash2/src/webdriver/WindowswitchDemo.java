package webdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowswitchDemo {	
	
@Test
public void SwitchChildWindow() throws Exception
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/SignUp?service=mail&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dcarousel-about-en");
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
System.out.println(driver.getTitle());


}

}
