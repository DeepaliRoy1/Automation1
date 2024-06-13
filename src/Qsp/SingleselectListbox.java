package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleselectListbox {
     static {
    	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
     }
     public static void main(String[] args) throws InterruptedException {
    	 WebDriver driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
    	 driver.findElement(By.xpath("//section[.='Dropdown']")).click();
    	 WebElement element = driver.findElement(By.xpath("//select[@id='select3']"));
    	 Select s=new Select(element);
         s.selectByIndex(7);
    	 Thread.sleep(5000);
         driver.close();		
	}
}