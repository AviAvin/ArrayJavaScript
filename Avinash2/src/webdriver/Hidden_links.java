package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden_links {

	public static void main(String[] args) {
		 WebDriver d=new FirefoxDriver();
		 d.get("http://www.facebook.com/");
		 List<WebElement> lks=d.findElements(By.tagName("a"));
		 System.out.println("Total links="+lks.size());
		 int count=0;
		 for(int i=0;i<lks.size();i++)
		 {
			 if(!lks.get(i).getText().isEmpty())
			 {
				count=count+1;
				System.out.println("Visisble links="+count);
				System.out.println("Hidden links="+(lks.size()+count));
				
			 }
		 }

	}

}
