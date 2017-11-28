package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectItem_DropDown {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver d=new FirefoxDriver();
		 d.get("http://newtours.demoaut.com/");
		 d.manage().window().maximize();
		 Thread.sleep(4000);
		d.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(4000);
        WebElement drop=d.findElement(By.name("Country:"));
        Thread.sleep(4000);
        List<WebElement> items=drop.findElements(By.tagName("Option"));
        for(int i=0;i<items.size();i++)
        {
        	String iname=items.get(i).getText();
        	items.get(i).click();
        	 Thread.sleep(4000);
        	if(items.get(i).isSelected())
        	{
        		System.out.println("element selected= --"+iname);
        		
        	}
       
        	else
        	{
        		System.out.println("element not selected= --"+iname);
        	}
        }
	}

}
