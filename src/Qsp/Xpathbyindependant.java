package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyindependant {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone15");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String text= driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Black, 128 GB)']/../../../div[2]/div[2]/div/div/div")).getText();
		System.out.println(text);
		Thread.sleep(5000);
		driver.close();
}
}