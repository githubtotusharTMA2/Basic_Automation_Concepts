package tma_group.tma_first_selenium_second;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait
{
	
	public static void main(String gsar[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // it is the wait time for the page to load.
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // its also called as dynamic wait.
		
		
		
		
	}
	
}
