package tma_group.tma_first_selenium_second;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations
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
		
		//Step 2 - 
		// back and forward simulation -
		//driver.get("https://www.google.com");
		// or -
		driver.navigate().to("https://www.google.com"); // this also performing same task.
		
		//driver.navigate().to("https://www.amazon.in");
		// or -
		driver.get("https://www.amazon.in"); // this also performing same task.
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		
		// Difference between get() and navigate().to() -
		// Both take us to the given website but when get() is used then it waits until page loaded properly and then move forward but navigate().to() don't wait until pageload.
		
		Thread.sleep(2000);
		
		// Step 3 - Refresh the page -
		driver.navigate().refresh();
		
	}
}