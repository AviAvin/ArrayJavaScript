package webdriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefox_profile {

	public static void main(String[] args) {
		 ProfilesIni obj=new ProfilesIni();
		FirefoxProfile fp=obj.getProfile("SeleniumUser");
		 WebDriver d=new FirefoxDriver(fp);
		 d.get("http://www.google.com/");
		 
	}

}
  