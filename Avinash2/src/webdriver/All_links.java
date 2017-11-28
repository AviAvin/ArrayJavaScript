package webdriver;

 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_links {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver d=new FirefoxDriver();
		 d.get("http://www.gmail.com/");
		 d.manage().window().maximize();
		 Thread.sleep(2000);
		List<WebElement>link= d.findElements(By.tagName("a"));
		 int count=link.size();
		 System.out.println(count);
		 for(int i=0;i<count;i++){
			
			 String name=link.get(i).getText();
			 System.out.println(name);
			 
		 }

	}

}
