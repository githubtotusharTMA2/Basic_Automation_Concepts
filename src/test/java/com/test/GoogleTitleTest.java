package com.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest
{
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
	}
	
	@Test(priority = 1, groups = "title")
	void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println("title = " + title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test
	public void googleLogoTest()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//img[@class = 'lnXdpd']")).isDisplayed());
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
