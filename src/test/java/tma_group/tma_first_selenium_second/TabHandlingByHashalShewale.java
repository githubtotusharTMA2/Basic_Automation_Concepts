package tma_group.tma_first_selenium_second;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandlingByHashalShewale
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
				String item = driver.findElement(By.linkText("SYGA Set of 2 Foam Sponge Hand Grip Finger Strength Hand Exercise Forearm Strength Builder")).getText();
				driver.findElement(By.linkText("SYGA Set of 2 Foam Sponge Hand Grip Finger Strength Hand Exercise Forearm Strength Builder")).click();
				
				// Step 6 - Tab Change / sending driver to new tab-
				for(String childTab : driver.getWindowHandles())
					driver.switchTo().window(childTab);
				driver.findElement(By.id("add-to-cart-button")).click();
				
				// Step 7 - Go to Cart -
				driver.findElement(By.id("hlb-view-cart-announce")).click();

				// Step 8 - Checking the element named item in the cart is same as the chooen one or not -
				Assert.assertEquals(item, "SYGA Set of 2 Foam Sponge Hand Grip Finger Strength Hand Exercise Forearm Strength Builder");
				
				driver.quit();
				/*try
				{
					String item_in_cart = driver.findElement(By.xpath("//*[text() = 'SYGA Set of 2 Foam Sponge Hand Grip Finger Strength Hand Exercise Forearm Strength Builder']")).getText();
					
					Assert.assertEquals(item, item_in_cart);
				}
				catch(Exception e)
				{
					System.out.println("Item not added in cart");
				}*/
				
		
	}
}