package Qsp;

import java.awt.AWTException;
	//import java.awt.Robot;
	//import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException, IOException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
		Alert a1 = driver.switchTo().alert();
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_T);
//		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(3000);
		a1.accept();
		driver.close();

}


}
