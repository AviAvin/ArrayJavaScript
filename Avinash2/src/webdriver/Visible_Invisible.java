package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Visible_Invisible {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver d=new FirefoxDriver();
	 d.get("http://www.google.com/");
	 d.manage().window().maximize();
	 Thread.sleep(2000);
	 List<WebElement> lks=d.findElements(By.tagName("a"));
	 System.out.println(lks.size());
	 for(int i=0;i<lks.size();i++)
	 {
		if(! lks.get(i).getText().isEmpty())
		{
			lks.get(i).click();
			String urls=d.getCurrentUrl();
			System.out.println(urls);
			d.navigate().back();
			lks=d.findElements(By.tagName("a"));
		}
		else
		{
			System.out.println("invisible links" +i);
		}
	 

	}

	}
}
