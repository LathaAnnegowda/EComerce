package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import java.util.concurrent.TimeUnit;
import utility.Propertyfiles;

public class EcomModuleTest extends Propertyfiles{

	public static void main(String[] args) throws InterruptedException {
		
		String exePath = "C:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		//Launch the Online Store Website
		driver.get(URL);
		 
		// Print a Log In message to the screen
		System.out.println("Successfully opened the amazon application");
		//Reporter.org("Successfully opened the amazon application");
	
		 
	  
	}

}

