package tma_group.tma_first_selenium_second;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle
{
	
	public static void main(String gsar[]) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click(); // clicking on sign in button
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		String str = alert.getText();
		
		// validation point -
		if(str.equals("Please enter a valid user name"))
			System.out.println("correct alert");
		else
			System.out.println("incorrect alert");
		
		System.out.println("alert message = " + alert.getText());
		
		alert.accept(); // to click on OK button.
		
		//jalert.dismiss(); // to click on Cancel button.
		
	}
	
}
