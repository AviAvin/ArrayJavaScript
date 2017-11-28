package com.DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLogin {
	@Test(dataProvider="wordPressData")
	public void LoginTowordPress(String UserName,String Password) throws InterruptedException
	{
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("http://demosite.center/wordpress/wp-login.php");
		 
		d.findElement(By.id("user_login")).sendKeys(UserName );
		 
		d.findElement(By.id("user_pass")).sendKeys(Password);
	 
		d.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		Thread.sleep(5);
		System.out.println(d.getTitle());
		d.quit();
		
	}
	@DataProvider(name="wordPressData")
	public Object[][] passData()
	{
		Object[][] data=new Object[3][2];
	       data[0][0]="admin1";
		   data[0][1]="demo1";
		   
		   data[1][0]="admin";
		   data[1][1]="demo123";
		   
		   data[2][0]="admin2";
		   data[2][1]="demo1234";
		   return data;
		   
		   
	}

}
