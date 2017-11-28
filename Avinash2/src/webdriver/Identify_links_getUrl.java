package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Identify_links_getUrl {

	public static void main(String[] args) {
	 WebDriver d=new FirefoxDriver();
	 d.get("https://www.gmail.com//");
     d.manage().window().maximize();
     List<WebElement> elements=d.findElements(By.tagName("a"));
     System.out.println(elements.size());
	 for(int i=0;i<elements.size();i++)       //i initialize as int i=0 to count upto elements.size()
	 {
		elements.get(i).click();
		String urls=d.getCurrentUrl();
		System.out.println(urls);
		d.navigate().back();
		elements=d.findElements(By.tagName("a"));
		 
	 }
	 	 
	}
}
