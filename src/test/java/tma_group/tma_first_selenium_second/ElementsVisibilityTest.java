package tma_group.tma_first_selenium_second;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsVisibilityTest
{
	public static void main(String gsar[]) throws Exception
	{
		// Step 1 - Initials -
		System.setProperty("webdriver.chrome.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		// Step 2 - Testing isDisplayed() method -
		System.out.println("by using name = " + driver.findElement(By.name("btnK")).isDisplayed()); // this is giving false because there are two element in the page which have same name.
		System.out.println("by using class = " + driver.findElement(By.className("gNO89b")).isDisplayed()); // this is also giving false because there are two element in the page which have same class name.
		System.out.println("by using customxpath = " + driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).isDisplayed()); // true because it is unique and is displayed on the page on screen.
		System.out.println("by using cssSelector = " + driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b")).isDisplayed()); // it is also true.
		
		// Step 3 - Testing isEnabled() method - it is primarily used for buttons.
		System.out.println("checking search button is disabled or not = " + driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).isEnabled());
		
		// Step 4 - Testing isSelected() method - it is only applicable for checkbox, dropdown and radiobutton.
		// for this we have to move on to the following website -
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		System.out.println("testing the checkbox = " + driver.findElement(By.id("isAgeSelected")).isSelected());
		// now selecting the checkbox and again checking isSelected() for the same element -
		driver.findElement(By.id("isAgeSelected")).click();
		System.out.println("after clicking on checkbox = " + driver.findElement(By.id("isAgeSelected")).isSelected());
	}
}
