package tma_group.tma_first_selenium_second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class Launch_Browser 
{
    public static void main( String[] args ) throws Exception
    {
    	// for firefox -
    /*	System.setProperty("webdriver.gecko.driver","E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\geckodriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver(); // this command launches the firefox.
    */	
    	
    	// for chrome -
    	System.setProperty("webdriver.chrome.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver(); // this command will launch the chrome browser.
    	
    	// to visit google.com -
    	driver.get("https://www.google.com");
    	
    	// to stay for a second -
    	Thread.sleep(1000);
    	
    	// for quiting the browser -
    	//driver.quit();
    	
    	// for retrieving title -
    	String title = driver.getTitle();
    	System.out.println("title = " + title);
    	
    	// validation point -
    	if(title.equals("Google"))
    		System.out.println("Correct title");
    	else 
    		System.out.println("Incorrect title");
    	
    	System.out.println("current url = " + driver.getCurrentUrl());
    	
    	//System.out.println("Page Source = \n" + driver.getPageSource());
    	
    }
}
