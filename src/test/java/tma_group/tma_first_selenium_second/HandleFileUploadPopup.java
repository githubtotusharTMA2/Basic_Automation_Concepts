package tma_group.tma_first_selenium_second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup
{

	public static void main(String[] args)
	{
		
		// Types of PopUps -
		//1. alerts - javascript popup -- alert api (accept, dismiss)
		//2. file upload popup -- browse button (type = file, sendKeys(path).
		//3. Browser window popup/ advertisement popup (windowhandler api - getWindowsHandles()).
		
		System.setProperty("webdriver.chrome.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://html.com/input-type-file/");
		// THIS CAN ONLY BE USED WHEN THE UPLOAD ITEM IS REQUIRED TO HAVE FILE TYPE, OTHERWISE IT WILL GIVE EXCEPTION.
		// or
		// type = file should be present for browse/attach/uploadfile buttons.
		driver.findElement(By.name("fileupload")).sendKeys("E:\\QA_Infotech\\Training_Works\\Eclipse\\Selenium\\Test_file_browse_upload\\testfile.txt");
		
		
		
	}

}
