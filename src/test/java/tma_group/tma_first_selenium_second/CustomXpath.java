package tma_group.tma_first_selenium_second;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath
{
	public static void main(String gsar[]) throws Exception
	{
		// Step 1 - Initials -
		System.setProperty("webdriver.chrome.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Step 2 - 
		driver.get("https://www.amazon.in"); // go to site.
		
		/* example of absolute xpath - //*[@id="search"] or //*[@id="Onbuy0HtSzIylV-0ejO8-g"]/div[1]/h2 i.e which contains things like id or div1/div2 like that.
		here we can use the first xpath i.e //*[@id="search"] but we should not use the second one because it contains div tag and we
		should not use any xpath which is in the form of hierarchy.
		Disadvantages of Absolute Xpath -
		1 - Performance issue because it is slow as it is very long.
		2 - not reliable.
		3 - can be changed at anytime in future. */
		
		/* Advantages of using Customize Xpath -
		1 - very fast.
		2 - syntax is very simple.
		3 - performance issue are not there.
		4 - it is unique.
		5 - it is generic.
		 */
		
		
		
		// and the following xpaths are examples of customize xpath -
		
		// Step 3 -
		//driver.findElement(By.xpath("//a[@data-csa-c-content-id = 'nav_cs_newreleases_b9144c00866c4016b948d9b5b5215b45']")).click();
		
		// or -
		//driver.findElement(By.xpath("//a[@href = '/gp/new-releases/?ref_=nav_cs_newreleases_b9144c00866c4016b948d9b5b5215b45']")).click();
		
		// or -
		driver.findElement(By.xpath("//a[contains(@href, '/gp/new-releases/?ref_=nav_cs_newreleases_b9144c00866c4016b948d9b5b5215b45']")).click();
		
		// dynamic id - input
		// id = test_123
		//By.id("test_123")
		
		// start with -
		// id = test_456
		// id = test_780
		// id = test_test_789_test
		
		// ends with -
		// id = 123_test_t
		// id = 2345_test_t
		// id = 678_test_t
		
		driver.findElement(By.xpath("//input[contains(@id, 'test_')]")).click();
		driver.findElement(By.xpath("//input[starts-with(@id, 'test_')]")).click();
		driver.findElement(By.xpath("//input[ends-with(@id, '_test_t)]")).click();
		
		
		
		
		
		
	}
}
