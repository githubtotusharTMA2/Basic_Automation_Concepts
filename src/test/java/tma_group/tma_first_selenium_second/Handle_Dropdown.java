package tma_group.tma_first_selenium_second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Dropdown
{
	public static void main(String gsar[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		Select select = new Select(driver.findElement(By.id("gh-cat")));
		select.selectByVisibleText("Art");
		
	}
}
