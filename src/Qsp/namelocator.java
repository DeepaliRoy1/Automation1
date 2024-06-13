package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class namelocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/Webpage.html");
		Thread.sleep(5000);
		driver.findElement(By.name("instagram")).click();
		Thread.sleep(5000);
		driver.close();
	}
}