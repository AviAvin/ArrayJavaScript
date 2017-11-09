package testAnnotations;

 

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 

public class TestNGannotation2 {
	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Starting TestNG");
		 
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Stoping TestNG");
		 
	}
	
	@BeforeTest
	public void beforeTest()
	{
		
		System.out.println("Start test executions");
		 
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Initialize Selenium for class2");
		 
	}
	
	
	@Test
	
	public void test3()
	{
		
		System.out.println("Inside test3");
		 
	}

	@AfterClass
	public void afterclass()
	{
		System.out.println("Destroy Selenium for class2");
	}
	@AfterTest
	public void afterTest()
	{
		
		System.out.println("Stop test executions");
	}
}
