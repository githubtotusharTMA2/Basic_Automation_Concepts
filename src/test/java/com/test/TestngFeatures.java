package com.test;

import org.testng.annotations.Test;

public class TestngFeatures
{
	@Test
	public void firstTest()
	{
		System.out.println("first Test");
		int i = 9 / 0;
	}
	
	@Test(dependsOnMethods = "firstTest")
	public void secondTest()
	{
		System.out.println("Second Test");
	}
	
	@Test(dependsOnMethods = "firstTest")
	public void thirdTest()
	{
		System.out.println("thirdTest");
	}
	
}