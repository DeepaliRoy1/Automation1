package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//set the path
		ChromeDriver driver = new ChromeDriver();
		//launch the browser
		driver.manage().window().maximize();
		//maximize the window
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/Webpage.html");
		//navigate the webpage
		driver.findElement(By.linkText("Instagram")).click();
		//<a> is link of <a>youtube</a>is a text so to use link text we can use link it.
		Thread.sleep(5000);
		driver.close();
	}
}
