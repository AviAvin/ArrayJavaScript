package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Launch_Facebook_mozilla {

	public static void main(String[] args) throws InterruptedException {
		ProfilesIni obj=new ProfilesIni();
		FirefoxProfile fp=obj.getProfile("SeleniumUser");
		 WebDriver d=new FirefoxDriver(fp);
		 
		 d.get("http://www.facebook.com");
		 d.manage().window().maximize();
		 Thread.sleep(4000);
		 d.findElement(By.id("email")).sendKeys("abinashkate");

		 Thread.sleep(2000);
		 d.findElement(By.id("pass")).sendKeys("avi@lipu");
		 Thread.sleep(4000);
		 d.findElement(By.id("u_0_0")).click();
		 Thread.sleep(2000);
		 //d.findElement(By.id("Passwd")).sendKeys("arindam@7");
		 Thread.sleep(2000);
		 //d.findElement(By.id ("signIn")).click();
		  
		 //for logout
		 d.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		 Thread.sleep(2000);
		// WebElement navigationclick = d.findElement(By.id("logoutMenu"));
		  //  WebElement logout = navigationclick();
		 //d.findElement(By.xpath("//*span[@class='_54nh']")).click();
		    
		 d.findElement(By.xpath("//a[contains(@data-gt,'menu_logout')]")).click();
	
		// d.findElement(By.xpath("//a[.='Log out']")).click();  
	
	}   

}


