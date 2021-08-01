package tma_group.tma_first_selenium_second;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling
{
	public static void main(String gsar[]) throws Exception
	{
		
		// In case of w3school.com -
		
		System.setProperty("webdriver.chrome.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.cssSelector("body > button")).click();
		
		
		
		
		
	/* In case of freeCRM.com -


		System.setProperty("webdriver.chrome.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for launching browser.
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.freecrm.com");
		
		driver.findElement(By.cssSelector("body > div.page > header > div > nav > div > div > div.rd-navbar-nav-wrap.toggle-original-elements > ul > li:nth-child(1) > a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("body > div.page > header > div > nav > div > div > a > span.icon.icon-xs.mdi-chart-bar")).click(); // click on about button.
		
		Thread.sleep(5000); 
		// now login -
		driver.findElement(By.name("email")).sendKeys("tushar.singh.mm@gmail.com"); 
		driver.findElement(By.name("password")).sendKeys("helomainFreCmR21_");
		driver.findElement(By.xpath("//div[contains(text(), 'Login')]")).click(); // to click on login button.
		
		Thread.sleep(2000);
		

		// after login we have to move the cursor to the frame in which contacts button is located because without going into frame,
		// we can't able to click on the contacts button.
		
		// now going to frame in which contact button is present. -
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.cssSelector("#main-nav > div:nth-child(3) > a > span")).click(); // to click on contacts button.

		// the above two lines of code was ok in 2017 but now it is not, because i think the freecrm wale have removed the frame and i can click on the 
		// contacts button without taking the cursor into frame because now i could'nt find any frame in the website.
		
		// so now we can only write as -
		driver.findElement(By.cssSelector("#main-nav > div:nth-child(3) > a > span")).click(); // to click on contacts button.
		
	*/
		
		
	}
}