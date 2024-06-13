package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class Baseclass {
	
	public static WebDriver driver;
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database connected successfully",true);
	}
	@BeforeClass 
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Reporter.log("browser launch successfully",true);
		
	}
	@BeforeMethod
	public void login() {
	driver.get("https://online.actitime.com/allied/login.do");
	driver.findElement(By.id("username")).sendKeys("rdeepali179@gmail.com");
	driver.findElement(By.name("pwd")).sendKeys("Deepali081100");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Reporter.log("logged in successfully",true);
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logged out successfully",true);
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
		Reporter.log("Browser close sucessfully",true);
	}

	@AfterSuite
	public void databaseDisconnected() {
		Reporter.log("Closed Database successfully");
	}
}

