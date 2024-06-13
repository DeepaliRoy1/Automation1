package Qsp;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//        driver.navigate().to("https://www.careinsurance.com/"); 
//        driver.findElement(By.xpath("//a[text()='Renew']")).click();
       driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
        driver.findElement(By.id("policynumber")).sendKeys("3546");
        driver.findElement(By.id("dob")).click();
        WebElement month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
        Select s1=new Select(month);
        s1.selectByValue("11");
       WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
        Select s2=new Select(year);
        s2.selectByVisibleText("2000");
        driver.findElement(By.linkText("8")).click();
        Thread.sleep(2000);
        driver.close();
}
}