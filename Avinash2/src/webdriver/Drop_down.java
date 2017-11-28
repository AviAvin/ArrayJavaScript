package webdriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) {
		 WebDriver d=new FirefoxDriver();
		 d.get("http://www.spicejet.com/");
		 d.manage().window().maximize();
		 Sleeper.sleepTightInSeconds(2);
          //One way
		 d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 Sleeper.sleepTightInSeconds(2);
		Select obj=new Select(d.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")));
		    obj.selectByVisibleText("Hyderabad (HYD)"); 
		   
		// WebElement drop=d.findElement(ctl00_mainContent_ddl_originStation1_CTXT"));
		  
		//d='ctl00_mainContent_DropDownListCurrency']/option[2]")).click();
		 //Search flight
		 d.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		 
	}

}
