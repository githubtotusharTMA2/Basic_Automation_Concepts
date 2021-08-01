package tma_group.tma_first_selenium_second;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp
{
	public static void main(String gsar[]) throws Exception
	{
		
		// Types of PopUps -
				//1. alerts - javascript popup -- alert api (accept, dismiss)
				//2. file upload popup -- browse button (type = file, sendKeys(path).
				//3. Browser window popup/ advertisement popup (windowhandler api - getWindowsHandles()).
		
		
		// Step 1 - Initials -
		System.setProperty("webdriver.chrome.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Step 2 - popup handles -
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.findElement(By.xpath("//a[@href='https://twitter.com/intent/follow?screen_name=seleniumeasy']")).click();
		Set<String> handlers = driver.getWindowHandles();
		Iterator<String> it = handlers.iterator();
		String parentWindowId = it.next();
		System.out.println("parentWindow id = " + parentWindowId);
		String childWindowId = it.next();
		System.out.println("childWindowId = " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("new window PopUp title = " + driver.getTitle());
		Thread.sleep(2000);
		System.out.println("2 sec ruk k title change ho jata h kabhi kabhar jaise ki abhi hua new title = " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("now parent window title = " + driver.getTitle());
		
		
		
	}
}