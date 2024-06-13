package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//set the path
		ChromeDriver driver = new ChromeDriver();
		//launch the browser
		driver.manage().window().maximize();
		//maximize the window
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/Webpage.html");
		//navigate the webpage
		driver.findElement(By.tagName("a")).click();
		//a is tagname of <a href> so we will write tagname bcz of duplicate entry we cant use tagname locator.
		Thread.sleep(5000);
		driver.close();
	}
}
