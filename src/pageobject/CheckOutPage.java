package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CheckOutPage {
WebDriver driver;
	String Fullname="xpath:(//*[@id=\"enterAddressFullName\"])[1]";
	String Mobilenumber="xpath:(//*[@id=\"enterAddressPhoneNumber\"])[1]";
	String Pincode="xpath:(//*[@id=\"enterAddressPostalCode\"])[1]";
	String Flatno="xpath:(//*[@id=\"enterAddressAddressLine1\"])[1]";
	String Area="xpath:(//*[@id=\"enterAddressAddressLine2\"])[1]";
	String Landmark="xpath://*[@id=\"enterAddressLandmark\"]";
	String Town="xpath:(//*[@id=\"enterAddressCity\"])[1]";
	String State="xpath:(//*[@id=\"enterAddressStateOrRegion\"])[1]";
	String Addresstype="xpath://*[@id=\"AddressType\"]";
	String Deliveraddressbtn="xpath://*[@id=\"addres-new\"]/div[1]/form/div[5]/span/span/input";
	String Continue="xpath://*[@id=\"shippingOptionFormId\"]/div[1]/div[2]/div/span[1]/span/input";

	public PaymentPage(WebDriver driver) {
		this.driver=driver;
	}
	
//Declare the wait time
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
//Enter full name
	public boolean Fullname(String Fullname) throws InterruptedException{
	try {
	driver.findelement(By.xpath(Fullname).sendkeys(Fullname));
	Reporter.log("Full name entered sucessfully");
	}
	catch(Exception e) {
	Reporter.log("Full name not entered sucessfully");
	throw(e);
	}
	}
		
	//Click on mobile number
	public boolean Mobilenumber(String Mobilenumber) throws InterruptedException{
	try {
	driver.findelement(By.xpath(Mobilenumber).sendkeys("mobile number"));
	Reporter.log("mobile number entered sucessfully");
	}
	catch(Exception e) {
	Reporter.log("mobile number not  entered sucessfully");
	throw(e);
	}
	}
	
	//Click on pincode number
		public boolean Pincode(String Pincode) throws InterruptedException{
		try {
		driver.findelement(By.xpath(Pincode).sendkeys("mobile number"));
		Reporter.log("mobile number entered sucessfully");
		}
		catch(Exception e) {
		Reporter.log("mobile number not  entered sucessfully");
		throw(e);
		}
		}
	//Click on Flatno number
		public boolean Flatno(String Flatno) throws InterruptedException{
		try {
		driver.findelement(By.xpath(Flatno).sendkeys("mobile number"));
		Reporter.log("Flat number entered sucessfully");
		}
		catch(Exception e) {
		Reporter.log("Flat number not  entered sucessfully");
		throw(e);
		}
		}
	//Click on Area number
		public boolean Area(String Area) throws InterruptedException{
		try {
		driver.findelement(By.xpath(Area).sendkeys("mobile number"));
		Reporter.log("Area entered sucessfully");
		}
		catch(Exception e) {
		Reporter.log("Area not  entered sucessfully");
		throw(e);
		}
		}
	//Click on Landmark number
		public boolean Landmark(String Landmark) throws InterruptedException{
		try {
		driver.findelement(By.xpath(Landmark).sendkeys("mobile number"));
		Reporter.log("Landmark entered sucessfully");
		}
		catch(Exception e) {
		Reporter.log("Landmark not  entered sucessfully");
		throw(e);
		}
		}
	
	//Click on Town number
		public boolean Town(String Town) throws InterruptedException{
		try {
		driver.findelement(By.xpath(Town).sendkeys("mobile number"));
		Reporter.log("Town entered sucessfully");
		}
		catch(Exception e) {
		Reporter.log("Town not  entered sucessfully");
		throw(e);
		}
		}
		
	//Click on State number
		public boolean State(String State) throws InterruptedException{
		try {
		driver.findelement(By.xpath(State).sendkeys("mobile number"));
		Reporter.log("State entered sucessfully");
		}
		catch(Exception e) {
		Reporter.log("State not  entered sucessfully");
		throw(e);
		}
		}
		
	//Click on Addresstype
		public boolean Addresstype() throws InterruptedException{
		try {
		driver.findelement(By.xpath(Addresstype).click));
		Reporter.log("Address type selected sucessfully");
		}
		catch(Exception e) {
		Reporter.log("Address type not selected sucessfully");
		throw(e);
		}
		}
		
	//Click on Deliveraddressbtn
		public boolean Deliveraddressbtn() throws InterruptedException{
		try {
		driver.findelement(By.xpath(Deliveraddressbtn).click));
		Reporter.log("Clicked on delivery address button sucessfully");
		}
		catch(Exception e) {
		Reporter.log("Unable to click on delivery address");
		throw(e);
		}
		}
	
	//Click on Continue button
		public boolean Continue() throws InterruptedException{
		try {
		driver.findelement(By.xpath(Continue).click));
		Reporter.log("Clicked on Continue button sucessfully");
		}
		catch(Exception e) {
		Reporter.log("Unable to click on Continue");
		throw(e);
		}
		}
}
