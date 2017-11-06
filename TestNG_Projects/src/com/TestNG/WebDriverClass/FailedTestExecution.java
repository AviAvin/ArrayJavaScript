package com.TestNG.WebDriverClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestExecution {
	
	@Test
	public void f1()
	{
		System.out.println("First Test passed");
	}

	@Test
	public void f2()
	{
		Assert.assertEquals(20, 20);
		System.out.println("Second assertion passed ");
		
	}
	@Test
	public void f3()
	{
		
		Assert.assertEquals("Avinash", "Avinash");
		System.out.println("Third assertion passed ");
		
	}
}
