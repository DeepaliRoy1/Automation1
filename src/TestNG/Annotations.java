package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void databaseConnection() {
		Reporter.log("database connected Successfully", true);		
	}
	@BeforeTest
	public void launchBrowser() {
		Reporter.log("browser launched sucessfully", true);
	}
	@BeforeMethod 
	public void login() {
		Reporter.log("logged in successfully",true);
	}
	@Test
	public void createCustomer() {
		Reporter.log("custommer created successfuly",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("loggedout successfully",true);
	}
	@AfterTest 
	public void closeBrowser(){
		Reporter.log("Browser closed successfully",true);
	}
	@AfterSuite
	public void closedDatabase() {
		Reporter.log("Databased connection closed successsfully",true);
	}
}
