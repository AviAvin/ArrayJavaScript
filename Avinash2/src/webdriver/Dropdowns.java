package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver d=new FirefoxDriver();
		 d.get("http://www.indianrail.gov.in/");
		 d.manage().window().maximize();
		 Thread.sleep(4000);
		 d.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[2]/a")).click();
		 Thread.sleep(4000);
		 d.findElement(By.xpath(".//*[@id='formId']/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[4]/td[2]/select")).click();
		 Thread.sleep(4000);
		 d.findElement(By.xpath(".//*[@id='formId']/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[4]/td[2]/select/option[74]")).click();
		 Thread.sleep(4000);
		 d.findElement(By.xpath(".//*[@id='formId']/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/select")).click();
		 Thread.sleep(4000);
		 d.findElement(By.xpath(".//*[@id='formId']/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/select/option[40]")).click();
		 Thread.sleep(4000);
		 d.findElement(By.xpath(".//*[@id='formId']/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[8]/td[2]/select")).click();
		 Thread.sleep(4000);
		 d.findElement(By.xpath(".//*[@id='formId']/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[8]/td[2]/select/option[7]")).click();
		 Thread.sleep(4000);
		 d.findElement(By.xpath(".//*[@id='formId']/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[10]/td[2]/img")).click();
		 Thread.sleep(4000);
		 d.findElement(By.xpath(".//*[@id='calendarDiv']/div[7]/table/tbody/tr[4]/td[7]")).click();
		 Thread.sleep(4000);
		 d.findElement(By.className("btn_style")).click();
		 
		 

	}

}
