package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Rows_and_Column {

	public static void main(String[] args) {
		 WebDriver d=new FirefoxDriver();
		 d.get("https://www.timeanddate.com/worldclock/");
		 d.manage().window().maximize();
		 Sleeper.sleepTightInSeconds(2);
		 //Web table
		 WebElement table=d.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table"));
		 //rows from table
		 List<WebElement> rows=table.findElements(By.tagName("tr"));
		 System.out.println(rows.size());
		 //loop for rows
		 for(int i=0;i<rows.size();i++)
		 {
			 //System.out.println(rows.get(i).getText()+ " ");
			 //cols from table
			 List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			 System.out.println(cols.size());
			 
			 	 		 
		 //loop for col
		for(int j=0;j<cols.size();j++)
		 {
			 System.out.println(cols.get(j).getText()+ " ");
			 
		 }
		 System.out.println();
	}
              
}
}

