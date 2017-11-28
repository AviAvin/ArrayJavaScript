package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textmethod {
	 
	public static void main(String[] args) {
		 WebDriver d=new FirefoxDriver();
		 d.get("http://projects.qedgetech.com/xpath/");
		//d.findElement(By.xpath(" //button[@class='btn btn-info btn-lg' and @type='button']")).click();
		d.findElement(By.xpath("//*[contains(text() ='Click Here')]")).click();
		// WebElement radiobutton = d.findElement(By.cssSelector("input[value='Click Here']"));
		// radiobutton.click();
		 //("Click Here");
	} 

}
