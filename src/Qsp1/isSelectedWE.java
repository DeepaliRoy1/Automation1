package qsp;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedWE {
 static {
	 System.setProperty("webdriver.chromedriver.driver", "./driver/chromedriver.exe");
 }
 public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
 	driver .manage().window().maximize();
 	driver.get("https://demoapps.qspiders.com/");
 	driver.findElement(By.xpath("//section[text()='Check Box']")).click();
 	
 	boolean Logo = driver.findElement(By.name("Domain")).isSelected();
 	if (Logo==true) {
		System.out.println("Checkbox is selected");
	} else {
System.out.println("checkbox is not selected");
	}
 	Thread.sleep(3000);
 	driver.close();
 }
}
