package com.DDF;

//import org.apache.poi.util.SystemOutLogger;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLoginExcel {
	@Test(dataProvider="WordPressData")
	public void LoginToWordPress(String UserName,String Password)   
	{
		WebDriver d=new FirefoxDriver();
		
		d.manage().window().maximize();
		Reporter.log("Browser opened");
		d.get("https://www.facebook.com/");
		d.getTitle();
		Reporter.log("Application started");
		d.findElement(By.id("email")).sendKeys(UserName);
		d.findElement(By.id("pass")).sendKeys(Password);
		d.findElement(By.xpath("//input[@value='Log In' and @type='submit']")).click();
		Sleeper.sleepTightInSeconds(5);
		
	  Assert.assertTrue(d.getTitle().contains("Facebook – log in or sign up"), "user is not able to login");
		System.out.println("page Title verified- user is able to login successfully");
		d.close();	
		
	}
	@AfterMethod
	
	public void tearDown()
	{
		WebDriver d=new FirefoxDriver(); 
		d.quit();
	}
	
	
	
	@DataProvider(name="WordPressData")
	public Object[][] passData()
	{
		ExcelPOI config=new ExcelPOI("D:\\workspace\\Avinash\\src\\com\\Avinash\\Test_Data\\pr2.xlsx ");
		int rows=config.getRowCount(0);
		Object[][] data=new Object[rows][2];
		for(int i=0;i<rows ;i++)
		{                
	       data[i][0]=config.getData(0, i, 0);
		   data[i][1]=config.getData(0, i, 1);
		   Reporter.log(" current application"+"getData(i)");           
		     

        }
		return data;
	}
	
}
