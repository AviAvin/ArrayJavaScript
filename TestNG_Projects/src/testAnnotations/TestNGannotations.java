package testAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGannotations {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Initialize Selenium for class1");
	}

	@BeforeMethod
	
	public void beforemethod()
	{
		System.out.println("opening Browser");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Inside test1");
	}
	@Test
	public void test2()
	{
		System.out.println("Inside test2");
	}
   @AfterMethod
	
	public void aftermethod()
	{
		System.out.println("Close Browser");
	}
   
   @AfterClass
	public void afterclass()
	{
		System.out.println("Destroy Selenium for class1");
	}
  
}
