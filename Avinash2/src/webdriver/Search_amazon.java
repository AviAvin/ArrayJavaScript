package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Search_amazon {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver d=new FirefoxDriver();
		 d.get("http://www.amazon.com");
		 d.manage().window().maximize();
		 Thread.sleep(2000);
		 d.findElement(By.id("searchDropdownBox")).click();
		 Thread.sleep(2000);
		 d.findElement(By.xpath(".//*[@id='searchDropdownBox']/option[12]")).click();
		 Thread.sleep(2000);
		 d.findElement(By.id("twotabsearchtextbox")).sendKeys("java");
		 Thread.sleep(2000);
		 d.findElement(By.className("nav-input")).click();
		 
				 

	}

}
