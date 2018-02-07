package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPB {

	public static void main(String[] args) {
	 WebDriver driver=new FirefoxDriver();
	 driver.get("http://primusbank.qedgetech.com/");
	 WebElement from1=driver.findElement(By.xpath(".//*[@id='drlist']"));
     // Get the list from the drop down list Selenium WebDriver
     List<WebElement> list1=from1.findElements(By.tagName("option"));
     for(WebElement i:list1)
     {
         System.out.println(i.getText());
         //Reporter.log(i.getText());
     } 
	 Select drop=new Select(driver.findElement(By.xpath(".//*[@id='drlist']")));
	 drop.selectByVisibleText("ameerpet");
	 driver.close();
	}

}
