package tma_group.tma_first_selenium_second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FreeCRM
{
	public static void main(String gsra[]) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\geckodriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://freecrm.com/");

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div/a/span[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div.field:nth-child(1) > div:nth-child(1) > input:nth-child(2)")).sendKeys("tushar.singh.mm@gmail.com");
		driver.findElement(By.cssSelector("div.field:nth-child(2) > div:nth-child(1) > input:nth-child(2)")).sendKeys("helomainFreCmR21_");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
	
	}
}