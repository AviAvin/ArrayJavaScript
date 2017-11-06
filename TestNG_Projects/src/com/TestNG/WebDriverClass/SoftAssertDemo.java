package com.TestNG.WebDriverClass;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	@Test
	public void softassert()
	{
		SoftAssert soft=new SoftAssert();
		System.out.println("Test1 started");
		soft.assertEquals(12, 15);
		System.out.println("Assert1 passed");
		soft.assertAll();
	}
	@Test
	public void hardassert()
	{
		
		System.out.println("Test2 started");
		Assert.assertEquals(12, 12);
		System.out.println("Assert2 passed");
		
	}
}
