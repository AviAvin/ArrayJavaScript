package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BowserBackForward {
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://seleniumhq.org/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //maximize the window
	    driver.manage().window().maximize();

	    driver.findElement(By.linkText("Documentation")).click();
	    System.out.println(driver.getCurrentUrl());
	    driver.navigate().back();
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(30000);
	    driver.navigate().forward();
	    System.out.println("Forward");
	    Thread.sleep(30000);
	    driver.navigate().refresh();

	}
	}

