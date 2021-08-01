package tma_group.tma_first_selenium_second;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile
{
	static WebDriver driver = null;
	public static void main(String gsar[]) throws Exception
	{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("E:\\QA_Infotech\\Training_Works\\Eclipse\\tma_first_selenium\\src\\test\\java\\tma_group\\tma_first_selenium_second\\config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		String url = prop.getProperty("URL");
		System.out.println("url = " + url);
		String browsername = prop.getProperty("browser");
		String email_id = prop.getProperty("email_id");
		System.out.println("email_id = " + email_id);
		String password_id = prop.getProperty("password_id");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
				
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\\\QA_Infotech\\\\Training_Works\\\\Eclipse\\\\Selenium\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equals("FireFox"))
		{
			System.setProperty("webdriver.geckodriver.driver", "E:\\\\QA_Infotech\\\\Training_Works\\\\Eclipse\\\\Selenium\\\\chromedriver\\\\geckodriver\\\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("InternetExplorer"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\\\QA_Infotech\\\\Training_Works\\\\Eclipse\\\\Selenium\\\\chromedriver\\\\InternetExplorer\\\\IEdriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(url);
		driver.findElement(By.id(email_id)).sendKeys(email);
		driver.findElement(By.id(password_id)).sendKeys(password);
		System.out.println("email_id = " + email_id);
		System.out.println("password_id = " + password_id);
		
		System.out.println("Thats it");
	}
}