package pageobject;

import org.testng.Reporter;
import main.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import utility.Propertyfiles;

public class HomePage extends Base {
	WebDriver driver;
	String ProductType="xpath://*[@id=\"twotabsearchtextbox\"]";
	String Searchresult="xpath://*[@id=\"search\"]/div[1]/div[1]/div/span[4]/div[1]/div[1]/div/span/div/div/span/a/div/img";
	String Buyyingoptions="xpath://*[@id=\"buybox-see-all-buying-choices-announce\"]";
	String Addtocart="xpath://*[@id=\"a-autoid-6\"]/span/input";
	String Proceedtobuy="xpath://*[@id=\"hlb-ptc-btn-native\"]";
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Declare the wait time
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	//Enter the value in Product search
	
	public boolean ProductType(String Product) throws InterruptedException{
	try {		
	driver.findelement(By.xpath(ProductType).sendkeys("ProductType"));
	Reporter.log("Able to enter product in the search field sucessfully");
	}
	catch(Exception e) {
	Reporter.log("Product search failed");
	throw(e);
	}
	}
	
	
	//Click on search result
	public boolean Searchresult() throws InterruptedException{
	try {	
	driver.findelement(By.xpath("Searchresult").click());
	Reporter.log("clicked on Search resuts sucessfully");
		}
	catch(Exception e) {
	Reporter.log("unable to click on search result");
	throw(e);
	}
	}

	//Click on buying options
	public boolean Buyingoptions() throws InterruptedException{
		try {	
	driver.findelement(By.xpath("Buyyingoptions").click());
	Reporter.log("Clicked on buying options sucessfully");
		}
	catch(Exception e) {
	Reporter.log("unable to click on buying optiond");
	throw(e);
	}
	}
	
	//click on add to cart
	public boolean Addtocart() throws InterruptedException{
		try {
	driver.findelement(By.xpath("Addtocart").click());
	Reporter.log("Clicked on Add to cart sucessfully");
		}
		catch(Exception e) {
			Reporter.log("unable to click on Add to cart");
			throw(e);
			}
			}
		
	//click on Proceed to buy
	public boolean proceedtobuy() throws InterruptedException{
		try {
	driver.findelement(By.xpath(Proceedtobuy).click());
	Reporter.log("Clicked on proceed to buy sucessfully");
		}
	catch(Exception e) {
		Reporter.log("unable to click on Add to cart");
		throw(e);
		}
		}
	
	
}
