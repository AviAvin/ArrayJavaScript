package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookselect {
	public static void main(String[] args) {
		 WebDriver d=new FirefoxDriver();
		 String winHandleBefore = d.getWindowHandle();
		 
		 d.get("http://www.facebook.com");
		 d.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[12]/a")).click();
		 for(String winHandle : d.getWindowHandles()){
			    d.switchTo().window(winHandle);
			    Select sel=new Select(d.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[12]/a")));
			    sel.selectByVisibleText("Sardu");
			     
			    
			    d.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[2]/a")).click();
			    
			                                      
			    
			 // Switch back to original browser (first window)
			    d.switchTo().window(winHandleBefore);

		 }
		 
		 
		 
	}

}



