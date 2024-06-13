package Qsp;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));       
		
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("(//div[contains(.,'Upload Resume')])[5]")).click();
		File f=new File("./TestData/flower.jpeg");
		 String path = f.getAbsolutePath();
		driver.findElement(By.id("file-upload")).sendKeys(path);
		Thread.sleep(2000);
		driver.close();
		
}
}