package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AUI_dragDrop {

	
	public void launch()
	{
		
 
		 WebDriver d=new FirefoxDriver();
		 
		 d.get("https://jqueryui.com/droppable/");
		 d.manage().window().maximize();
		 Sleeper.sleepTightInSeconds(2);
		 d.switchTo().frame(0);
		 WebElement src=d.findElement(By.xpath(".//*[@id='draggable']"));
		 Sleeper.sleepTightInSeconds(2);
		 WebElement targ=d.findElement(By.xpath(".//*[@id='droppable']"));
		 Sleeper.sleepTightInSeconds(2);
		 Actions obj=new Actions(d);
		 obj.dragAndDrop(src, targ).build().perform();
	}
    public static void main(String args[])
    {
    	AUI_dragDrop dd=new AUI_dragDrop();
    	dd.launch();
    	
    }
	
	
	
}
