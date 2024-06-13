package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMEalllinks {
	
	static {
		 System.setProperty("webdriver.chromedriver.driver", "./driver/chromedriver.exe");
	 }
	 public static void main(String[] args) throws InterruptedException {
		   WebDriver driver=new ChromeDriver();
	 	driver .manage().window().maximize();
	 	driver.get("https://www.flipkart.com/");
	 	List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	 	int Count = alllinks.size();
	 	System.out.println(Count);
	 	for (int i = 0; i < Count; i++) {
	 		String text = alllinks.get(i).getText();
			System.out.println(text);
		}
	 	Thread.sleep(3000);
	 	driver.close();
	 	
}
}