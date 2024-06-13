package Qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutusingQuitmethodUsingLoop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.xpath("//button[text()='Click to open multiple popup windows']")).click();
		Set<String> child = driver.getWindowHandles();
		String parent=driver.getWindowHandle();
//		for (String Win : child) {
//////			driver.switchTo().window(Win);
//////			Thread.sleep(3000);
//////			driver.close();
////		
		for (String Win : child) {
			if(!parent.endsWith(Win)) {
				driver.switchTo().window(Win);
				driver.close();
			}
		}
			
		}

}