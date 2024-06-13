package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectListbox {
	static {
   	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
    public static void main(String[] args) throws InterruptedException {
   	 WebDriver driver=new ChromeDriver();
   	 driver.manage().window().maximize();
   	 driver.get("https://demoapps.qspiders.com/?scenario=1");
   	driver.findElement(By.xpath("//section[.='Dropdown']")).click();
   	WebElement element = driver.findElement(By.xpath("//select[@id='select3']"));
    Select s=new Select(element);
    Thread.sleep(3000);
    s.selectByValue("India");
    WebElement elements = driver.findElement(By.xpath("//select[@id='select5']"));
    Select k=new Select(elements);
    Thread.sleep(3000);
    k.selectByValue("Maharashtra");
    WebElement elements1 = driver.findElement(By.xpath("(//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150'])[4]"));
    Select a=new Select(elements1);
    Thread.sleep(3000);
    a.selectByValue("Mumbai City");
    Thread.sleep(5000);
    driver.close();    
}
}