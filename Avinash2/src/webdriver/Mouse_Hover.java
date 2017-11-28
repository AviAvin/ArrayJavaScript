package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_Hover {

	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.get("https://www.emirates.com/in/English/");
        d.manage().window().maximize();
        Sleeper.sleepTightInSeconds(2);
        //Exprience element
       WebElement src1= d.findElement(By.xpath(".//*[@id='gnav-experience']/a"));
        //Book Element
       WebElement src2= d.findElement(By.xpath(".//*[@id='gnav-book']/a"));
        Actions obj=new Actions(d);
        obj.moveToElement(src1).build().perform();
        Sleeper.sleepTightInSeconds(2);
        obj.moveToElement(src2).build().perform();
        Sleeper.sleepTightInSeconds(2);
	}

}
