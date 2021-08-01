package tma_group.tma_first_selenium_second;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait
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
		
		// Step 2 - 
		driver.get("https://www.google.com");
		// this is for search button -
		clickOn(driver, driver.findElement(By.xpath("(//input[@class = 'gNO89b'])[2]")), 20);
		System.out.println("clicked on search button");
		// this is for hindi link -
		clickOn(driver, driver.findElement(By.linkText("हिन्दी")), 10);
		//clickOn(driver, driver.findElement(By.xpath("//a[@href = 'https://www.google.com/setprefs?sig=0_hNmYXSPK6CsJ_kAASWWjlfDzxek%3D&hl=hi&source=homepage&sa=X&ved=0ahUKEwihpcae5LzxAhUVbn0KHZJNDh0Q2ZgBCA4']")), 10);
		System.out.println("clicked on hindi link");
		
	}
	
	static void clickOn(WebDriver driver, WebElement locator, int timeout)
	{
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
}