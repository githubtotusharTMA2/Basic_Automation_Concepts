package com.test;

import org.testng.annotations.*;

public class TestNGBasics
{
	
	/*
1 = @BeforeSuite == setup system property for chrome
2 = @BeforeTest == launch chrome browser
3 = @BeforeClass == enter url

	@BeforeMethod == login method
4 = Google Title Test
	@AfterMethod == Logout

	@BeforeMethod == login method
5 = @Test == searchtest
	@AfterMethod == Logout

6 = @AfterClass == deleteAllCookies
7 = @AfterTest == close browser
8 = AFTERSUITE H PR LIKHA NHI H KYUKI PRINT NHI HORA PTA NHI KYU
	PASSED: googleTitleTest
	PASSED: searchTest
	 */
	
	@BeforeSuite
	public void setUp()
	{
		System.out.println("@BeforeSuite == setup system property for chrome");
	}
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("@BeforeTest == launch chrome browser");
	}
	@BeforeClass
	public void enterURL()
	{
		System.out.println("@BeforeClass == enter url");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("@BeforeMethod == login method");
	}
	@Test
	public void googleTitleTest()
	{
		System.out.println("Google Title Test");
	}
	@Test
	public void searchTest()
	{
		System.out.println("@Test == searchtest");
	}
	@AfterMethod
	public void logOut()
	{
		System.out.println("@AfterMethod == Logout");
	}
	@AfterClass
	public void deleteAllCookies()
	{
		System.out.println("@AfterClass == deleteAllCookies");
	}
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("@AfterTest == close browser");
	}
	
}