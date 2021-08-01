package tma_group.tma_first_selenium_second;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements
{

	public static void main(String[] args)
	{
		
		// Step 1 - Initials -
		System.setProperty("webdriver.chrome.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// all the links are represented by <a> html tag.
		
		// Step 2 - 
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		int len = linklist.size();
		System.out.println("linklist.size() = " + len);
		
		// printing all the elements texts of linklist -
		for(int i = 0; i < len; i++)
			System.out.println(linklist.get(i).getText());
		driver.quit();
		
	}

}