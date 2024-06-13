package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allSugesstion {
	static {
		 System.setProperty("webdriver.chromedriver.driver", "./driver/chromedriver.exe");
	 }
	 public static void main(String[] args) throws InterruptedException {
		   WebDriver driver=new ChromeDriver();
	 	driver .manage().window().maximize();
	 	driver.get("https://www.flipkart.com/");
	 	driver.findElement(By.name("q")).sendKeys("iphone 15");
	 	Thread.sleep(10000);
	 	List<WebElement> allsug = driver.findElements(By.xpath("//span[.='iphone 15']/.."));
	 	int count = allsug.size();
	 	System.out.println(count);
	 	for (int i = 0; i < count; i++) {
	 		String Sugesstion = allsug.get(i).getText();
	 		System.out.println(Sugesstion);	
		}
	 	Thread.sleep(3000);
	 	driver.close();
}
}