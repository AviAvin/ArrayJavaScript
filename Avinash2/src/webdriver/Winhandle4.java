package webdriver;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
       
public class Winhandle4 {
        
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://html.com/javascript/popup-windows/");
	     driver.findElement(By.id("popupClick")).click();

	    for(int i = 0; i < 10; i++)
	    {
	      int handleSize = driver.getWindowHandles().size();
	      System.out.println("Window handle size: " + handleSize );

	      if (handleSize  > 1) {
	        break;
	      }
           
	      try {
	        Thread.sleep(1000);
	      }
	      catch (Exception e) {
          
	      }
	    }
           
	    Set<String> webHandles = driver.getWindowHandles();

	    for(String handle : webHandles)
	    {
	      System.out.println("Web Handle: " + handle);
	    }


	}

}
