package tma_group.tma_first_selenium_second;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_First
{
	public static void main(String gsar[]) throws Exception
	{
		// Step 1- Initials -
		System.setProperty("webdriver.chrome.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Step 2 - Go to website -
		driver.get("https://www.amazon.in");
		
		// Step 3 - Login -
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click(); // click on sign in button.
		driver.findElement(By.id("ap_email")).sendKeys("tushar.singh.mm@gmail.com"); // type email.
		driver.findElement(By.id("continue")).click(); // click on continue button.
		driver.findElement(By.id("ap_password")).sendKeys("ApneRolleAmazontma@1"); // entering password.
		driver.findElement(By.id("signInSubmit")).click(); // click on sign-in button.
		
		// Step 4 - Search for a product -
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("SYGA Set of 2 Foam Sponge Hand Grip Finger Strength Hand Exercise Forearm Strength Builder");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		// Step 5 - Choose the item -
		driver.findElement(By.linkText("SYGA Set of 2 Foam Sponge Hand Grip Finger Strength Hand Exercise Forearm Strength Builder")).click();

		// Step 6 - Add to Cart -
		
		
		
	}
}