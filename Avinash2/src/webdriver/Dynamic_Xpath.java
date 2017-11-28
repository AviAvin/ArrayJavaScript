package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver d=new FirefoxDriver();
		 d.get("http://www.yahoo.com/");
		 d.manage().window().maximize();
		 Thread.sleep(2000);
		 d.findElement(By.xpath(".//*[@id='uh-search-box']")).sendKeys("selenium");
		 Thread.sleep(2000);
		 //List<WebElement> list=d.findElements(By.xpath(".//*[starts-with(@id,'yui_3_18_0_3_1502530')]/a"));
		 List<WebElement> list=d.findElements(By.xpath("//*[contains(@id,'ui_3_18_0_4_150')]/a"));
		 d.findElement(By.xpath(".//*[@id='uh-assist-link-7']")).click();
		 System.out.println(list.size());
		 Thread.sleep(2000);
		 //list.get(6).click();
		 List<WebElement>lks=d.findElements(By.tagName("a"));
		 Thread.sleep(2000);
		 System.out.println(lks.size());
		 for(int i=0;i<lks.size();i++)
		 {
			 
			 lks.get(i).click();
			 Thread.sleep(2000);
			 String urls=d.getCurrentUrl();
			 Thread.sleep(2000);
			 System.out.println(urls);
			 Thread.sleep(2000);
			 d.navigate().back();
			 Thread.sleep(2000);
			 d.findElements(By.tagName("a"));
			 System.out.println(urls);
			 
		 }
			 
		 }
	
	}


