package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import main.Base;
import pageobject.CheckOutPage;
import pageobject.HomePage;
import pageobject.PaymentPage;

import java.util.concurrent.TimeUnit;
import utility.Propertyfiles;

public class EcomModuleTest extends Base 
{
	@Test(dataProvider="TestData")
	public void ECOM(String runmode,String Username,String Password,String Product type,String Mobile Number, String Pincode, String Faltno, String Area, String Landmark, String Town, String State ) throws InterruptedException {
		
		if(runmode.contentEquals(No)){
			throw new skipExcetion("Skipping the execution");
		}
	//Calling the page oobjects
	LoginPage LoginPage=new LoginPage(driver);
	HomePage HomePage=new HomePage(driver);
	PaymentPage PaymentPage=new PaymentPage(driver);
	CheckOutPage CheckOutPage=new CheckOutPage(driver);
		 
	//Login to application
	LoginPage.Username(Username);
	LoginPage.Password(Password);
	Reporter.log("Login is sucessfull");

	//Select the product
	HomePage.ProductType(Product);
	HomePage.Buyingoptions();
	HomePage.
	Reporter.loog("Product selected sucessfully");
	
	//check out the product
	CheckOutPage.Fullname(Fullname);
	CheckOutPage.Mobilenumber(Mobilenumber);
	CheckOutPage.Flatno(Flatno);
	CheckOutPage.Area(Area);
	CheckOutPage.Pincode(Pincode);
	CheckOutPage.Landmark(Landmark);
	CheckOutPage.State(State);
	CheckOutPage.Town(Town);
	CheckOutPage.Deliveraddressbtn();
	CheckOutPage.Continue();
	Reporter.log("payment is sucessful");
	
	//Payment for product
	PaymentPage.Paycheckbox();
	PaymentPage.Paymentcontinue();
	PaymentPage.Orderplaced();
	Reporter.log("Order placed sucessfully");

	//Quit the browser
	driver.quit();
	}
}




