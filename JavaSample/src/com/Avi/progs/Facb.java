package com.Avi.progs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facb {

	public static void main(String[] args) {
		 WebDriver d=new FirefoxDriver();
		 d.get("http://www.facebook.com");
		 d.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[12]/a")).click();
	}

}
