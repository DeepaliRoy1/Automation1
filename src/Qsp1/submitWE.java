package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitWE {
	static {
		 System.setProperty("webdriver.chromedriver.driver", "./driver/chromedriver.exe");
	 }
	 public static void main(String[] args) throws InterruptedException {
		   WebDriver driver=new ChromeDriver();
	 	driver .manage().window().maximize();
	 	driver.get("https://demoapps.qspiders.com/");
	 	driver.findElement(By.xpath("//section[text()='Button']")).click();	
	 	driver.findElement(By.xpath("//a[text()='Submit Click']")).click();	
Thread.sleep(3000);
	 	driver.findElement(By.name("satisfaction")).click();
	 	driver.findElement(By.xpath("(//button[@type='submit'])[1]")).submit();
	 	Thread.sleep(3000);
	 	driver.close();
	 }

}
