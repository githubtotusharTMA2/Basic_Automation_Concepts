package tma_group.tma_first_selenium_second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Locators
{
	public static void main(String gsar[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		// there are 8 locators in selenium
		
		// 1. xpath - if it is heirarchi based xpath then dont use that because it may be wrong.
	/*	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("MainAttacker"); // setting the username field
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("tma_micro_to_max"); // setting the password field
	*/	
		// 2. id -
	/*	driver.findElement(By.id("username")).sendKeys("MainAttacker");
		driver.findElement(By.id("password")).sendKeys("Hello");
	*/
		
		// 3. name -
	/*	driver.findElement(By.name("session_key")).sendKeys("MainAttacker");
		driver.findElement(By.name("session_password")).sendKeys("Hello");
	*/	
		// 4. linktText - // only in case of links/ hyperlinks
		//driver.findElement(By.linkText("Forgot password?")).click();
		
		// 5. partialText - not recommended // only in case of links/ hyperlinks
		//driver.findElement(By.partialLinkText("Forgot")).click();
		
		// 6. cssSelector -
		// if class is there then we can use it.
		// if id is there then we can use it like #id.
		//driver.findElement(By.cssSelector("#username")).sendKeys("Hello I am MainAttacker");
		
		// 7. classname - but not useful because two elements can have same classname.
		driver.findElement(By.className("btn__tertiary--medium")).click();
	}
}