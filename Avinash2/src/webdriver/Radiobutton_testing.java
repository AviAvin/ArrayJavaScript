package webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Radiobutton_testing {

	public static void main(String[] args) {
		 WebDriver d=new FirefoxDriver();
		 
		 d.manage().window().maximize();
		 d.get("http://www.facebook.com/");
		 d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 //Click on radio button to know if selected
		 d.findElement(By.xpath(".//*[@id='u_0_4']")).click();
		 //Identify radio elements
		 
		 List<WebElement> radio=d.findElements(By.name("sex"));
		 System.out.println(radio.size());
		 System.out.println();
		 for(int i=0;i<radio.size();i++)
		 {
			String str1=radio.get(i).getAttribute("value");
			String str2=radio.get(i).getAttribute("checked");
			
			 //System.out.println(str1+" "+str2);
			 System.out.println(radio.get(i).getTagName().getClass());
		 }

	}

}
