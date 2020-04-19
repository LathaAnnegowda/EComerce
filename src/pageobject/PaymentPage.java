package pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import main.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import utility.Propertyfiles;

public class PaymentPage {

	String Paycheckbox="xpath://*[@id=\"pp-n0YvxQ-145\"]";
	String Paymentcontinue="xpath://*[@id=\"pp-n0YvxQ-406\"]/span/input";
	String Orderplaced="xpath:";
	
	public PaymentPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Declare the wait time
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Clck on payment checkbox
		public boolean Paycheckbox() throws InterruptedException{
		try {
		driver.findelement(By.xpath(Paycheckbox).click));
		Reporter.log("Clicked on payment checkboox sucessfully");
		}
		catch(Exception e) {
		Reporter.log("Clicked on payment checkboox failed");
		throw(e);
		}
		}
	
	//Clck on payment continue
		public boolean Paymentcontinue() throws InterruptedException{
		try {
		driver.findelement(By.xpath(Paymentcontinue).click));
		Reporter.log("Clicked on Payment continue sucessfully");
		}
		catch(Exception e) {
		Reporter.log("Clicked on payment continue failed");
		throw(e);
		}
		}
	//Check the order placed message
		public boolean Orderplaced() throws InterruptedException{
		try {
		driver.findelement(By.xpath(Orderplaced)).exist;
		Reporter.log("Order placed sucessfully");
		}
		catch(Exception e) {
		Reporter.log("Order placed failed");
		throw(e);
		}
	}
}	
}
