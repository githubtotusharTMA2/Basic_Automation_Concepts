package com.test;

import org.testng.annotations.Test;

public class InvocationTest
{
	@Test(invocationCount = 10)
	public void sum()
	{
		int a = 1, b = 2, c = 0;
		c = a + b;
		System.out.println("sum = " + c);
	}
}