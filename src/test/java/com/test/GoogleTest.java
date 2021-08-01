package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class GoogleTest
{
	WebDriver driver;
	
	//1 4 7
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
	
	//2
	@Test(priority = 1, groups = "title")
	void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println("title = " + title);
	}
	
	//8
	@Test(priority = 2, groups = "logo")
	public void googleLogoTest()
	{
		driver.findElement(By.xpath("//img[@class = 'lnXdpd']")).isDisplayed();
	}
	
	//5
	@Test(priority = 3, groups = "LinkTest")
	public void mailLinkTest()
	{
		driver.findElement(By.linkText("Mail")).isDisplayed();
	}
	
	@Test(priority = 4, groups = "Test")
	public void Test1()
	{
		System.out.println("Hello");
	}
	
	@Test(priority = 5, groups = "Test")
	public void Test2()
	{
		System.out.println("Bye");
	}
	
	//3 6 9
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}