package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonPresent {

	public static void main(String[] args) {
		 WebDriver driver=new FirefoxDriver();
		 driver.get("http://fb.com");
		 //check wheather radio button available
		 List<WebElement> radioButton=driver.findElements(By.tagName("radio"));
		 System.out.println(radioButton.size());
          driver.findElement(By.xpath(".//*[@id='u_0_3']")).click();
          if(driver.findElement(By.xpath(" .//*[@id='u_0_3']")).getAttribute("class").contains("checked"))
          {
              System.out.println("True");
          }
          else
          {
              System.out.println("False");
          }   
      }
	}


