package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest
{
	@Test(invocationTimeOut = 2000)
	public void MainTest()
	{
		while(true)
		{
			System.out.println("Hello I am MainAttacker");
		}
	}
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void secondTest()
	{
		Integer.parseInt("200a");
	}
}