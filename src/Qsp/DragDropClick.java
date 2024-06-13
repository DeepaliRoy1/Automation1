package Qsp;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException, IOException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
        driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
        driver.findElement(By.linkText("Drag Position")).click();
        WebElement src = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
        Thread.sleep(5000);
        WebElement desc = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
        Actions a=new Actions(driver);
        a.dragAndDrop(src, desc).perform();
        Thread.sleep(3000);
        driver.close();
	}

}
