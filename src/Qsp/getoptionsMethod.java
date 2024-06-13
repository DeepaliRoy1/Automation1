package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoptionsMethod {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/?scenario=1");
	driver.findElement(By.xpath("//section[.='Dropdown']")).click();
	driver.findElement(By.linkText("Multi Select")).click();
	WebElement country = driver.findElement(By.id("select-multiple-native"));
	Select s=new Select(country);
	List<WebElement> alloptions = s.getOptions();
	int count = alloptions.size();
	System.out.println(count);
	for (int i = 0; i < count; i++) {
		String text = alloptions.get(i).getText();
		Thread.sleep(2000);
		System.out.println(text);
		
	}
	Thread.sleep(5000);
	driver.close();

}
}
