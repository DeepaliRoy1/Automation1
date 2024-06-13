package Qsp;

//import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

public class MouseHover {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.vtiger.com/");
		WebElement element = driver.findElement(By.partialLinkText("Resources"));
		Actions a= new Actions(driver);
		a.moveToElement(element).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String Mobile = driver.findElement(By.xpath("//p[contains(text(),'+91 9243602352')]")).getText();
		System.out.println(Mobile);
		Thread.sleep(3000);
		driver.close();
}
}