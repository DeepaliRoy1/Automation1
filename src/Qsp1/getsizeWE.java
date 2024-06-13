package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsizeWE {
    static {
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new ChromeDriver();
    	driver .manage().window().maximize();
    	driver.get("https://demoapps.qspiders.com/?scenario=1");
    	driver.findElement(By.xpath("//section[text()='Image']")).click();
    	Thread.sleep(3000);
    	int Height = driver.findElement(By.xpath("//img[@title='Image tooltip']")).getSize().getHeight();
    	int Widht = driver.findElement(By.xpath("//img[@title='Image tooltip']")).getSize().getWidth();
    	System.out.println(Height);
    	System.out.println(Widht);
    	Thread.sleep(3000);
    	driver.close();
	}
}

