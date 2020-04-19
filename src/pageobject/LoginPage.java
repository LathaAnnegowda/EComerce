package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import main.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import utility.Propertyfiles;

public class LoginPage {
	WebDriver driver;
	String Username="xpath://*[@id=\"ap_email\"]";
	String Password="xpath://*[@id=\"ap_password\"]";
	String Login="xpath://*[@id=\"signInSubmit\"]";
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Declare the wait time
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Enter the user name
	public boolean Username(String Username) throws InterruptedException{
	try {
	driver.findelement(By.xpath(Username).sendkeys(Username));
	Reporter.log("user name entered sucessfully");
	}
	catch(Exception e) {
		Reporter.log("username not entered sucessfully");
		throw(e);
		}
		}
	
	//Enter the password
	public boolean password(String password) throws InterruptedException{
		try {
	driver.findelement(By.xpath(Password).sendkeys("password"));
	Reporter.log("password sucessfully");
		}
		catch(Exception e) {
			Reporter.log("Password not entered sucessfully");
			throw(e);
			}
			}
	//Click on login button
	public boolean Login() throws InterruptedException{
		try {
	driver.findelement(By.xpath(Login).click());
	Reporter.log("Clicked on login button sucessfully");
		}
		catch(Exception e) {
			Reporter.log("Password not entered sucessfully");
			throw(e);
			}
			}
}
	
