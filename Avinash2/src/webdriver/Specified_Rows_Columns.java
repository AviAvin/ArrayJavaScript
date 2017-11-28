package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Specified_Rows_Columns {

	public static void main(String[] args) {
		 WebDriver d=new FirefoxDriver();
		 d.get("https://www.timeanddate.com/worldclock/");
		 d.manage().window().maximize();
         String path1="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr";
         String path2="]/td[";
	    for(int i=0;i<30;i++)
	    {
	    	String name=d.findElement(By.xpath(path1+i+path2)).getText();
	    	System.out.println(name);
	    }
	
	
	
	}

}
