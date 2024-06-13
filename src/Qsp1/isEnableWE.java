package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnableWE {
	static {
		   System.setProperty("webdriver.chromedriver.driver", "./driver/chromedriver.exe");
	   }
	   public static void main(String[] args) throws InterruptedException {
		   WebDriver driver=new ChromeDriver();
	   	driver .manage().window().maximize();
	   	driver.get("https://www.facebook.com/");
	   	boolean Logo = driver.findElement(By.name("login")).isEnabled();
	   	if (Logo==true) {
			System.out.println("Button is Enabled");
		} else {
	System.out.println("Button is Disabled");
		}
	   	Thread.sleep(3000);
	   	driver.close();
	}
}