package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deslectMultiselectedListbox {
	static {
  	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
    public static void main(String[] args) throws InterruptedException {
   	 WebDriver driver=new ChromeDriver();
   	 driver.manage().window().maximize();
   	 driver.get("https://demoapps.qspiders.com/?scenario=1");
   	 driver.findElement(By.xpath("//section[.='Dropdown']")).click();
   	 driver.findElement(By.linkText("Multi Select")).click();
   	 WebElement country = driver.findElement(By.id("select-multiple-native"));
   	 Select s=new Select(country);
   	 s.selectByIndex(0);
   	 Thread.sleep(3000);
   	 s.selectByValue("Canada");
   	 Thread.sleep(3000);
       s.selectByVisibleText("Germany");
   	 Thread.sleep(3000);
       s.selectByVisibleText("Brazil");
   	 Thread.sleep(3000);
       s.deselectByIndex(2);
   	 Thread.sleep(3000);
       s.deselectByValue("Germany");
       Thread.sleep(3000);
       s.deselectByVisibleText("Brazil");
       Thread.sleep(5000);
       driver.close();
    }
}
