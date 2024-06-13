package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeWE {
	static{
		System.setProperty("webdriver.chromedriver.driver", "./Driver/chromedriver.exe");
		
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver .manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String Text=driver.findElement(By.xpath("//img[@alt='Facebook']")).getAttribute("src");
	System.out.println(Text);
	Thread.sleep(5000);
	driver.close();	
}
}
