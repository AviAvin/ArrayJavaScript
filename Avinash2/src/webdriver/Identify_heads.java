package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Identify_heads {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver d=new FirefoxDriver();
		 d.get("http://www.newtours.demoaut.com/");
		 d.manage().window().maximize();
		 Thread.sleep(2000);
		 WebElement block=d.findElement(By.id("SC-hdu"));
		 List<WebElement>elements=block.findElements(By.tagName("a"));
		 System.out.println("elements.size()");
		 for(int i=0;i<elements.size();i++)
		 {
			 System.out.println(elements.get(i).getText());
		 }

	}

}
