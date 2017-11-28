package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Link_url {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new FirefoxDriver();
	 d.get(" http://newtours.demoaut.com/");
	 d.manage().window().maximize();
	 Thread.sleep(2000);
	 List<WebElement> elements=d.findElements(By.tagName("a"));
	 System.out.println(elements.size());
	 Thread.sleep(2000);
	 for(int i=0;i<elements.size();i++)
	 {
		 elements.get(i).click();
		 Thread.sleep(2000);
		 String urls=d.getCurrentUrl();
		 Thread.sleep(2000);
		 System.out.println(urls);
		 Thread.sleep(2000);
		 d.navigate().back();
		 d.findElements(By.tagName("a"));
	 }

	}

}
