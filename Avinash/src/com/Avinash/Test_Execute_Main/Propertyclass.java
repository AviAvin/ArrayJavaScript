package com.Avinash.Test_Execute_Main;

import java.io.FileInputStream;
 
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Propertyclass {

	public static void main(String[] args) throws IOException {
		 FileInputStream fis=new FileInputStream("D:/workspace/Avinash/src/com/Avinash/Properties/LaunchBr");
		 Properties p=new Properties();
         p.load(fis);
         WebDriver d=new FirefoxDriver();
         d.get(p.getProperty("url"));
         d.findElement(By.id(p.getProperty("Uname.path"))).clear();
         d.findElement(By.id(p.getProperty("Uname.path"))).sendKeys(p.getProperty("Uname"));
        d.findElement(By.id(p.getProperty("Pwd.path"))).clear();
         d.findElement(By.id(p.getProperty("Pwd.path"))).sendKeys(p.getProperty("Pwd"));
         d.findElement(By.id(p.getProperty("Login.path"))).click();
}
}