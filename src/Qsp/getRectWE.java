package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRectWE {
	static {
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new ChromeDriver();
    	driver .manage().window().maximize();
    	driver.get("https://demoapps.qspiders.com/?scenario=1");
    	driver.findElement(By.xpath("//section[text()='Image']")).click();
    	Thread.sleep(3000);
    	int Height = driver.findElement(By.xpath("//img[@title='Image tooltip']")).getRect().getHeight();
    	int Widht = driver.findElement(By.xpath("//img[@title='Image tooltip']")).getRect().getWidth();
    	int X = driver.findElement(By.xpath("//img[@title='Image tooltip']")).getRect().getX();
    	int Y= driver.findElement(By.xpath("//img[@title='Image tooltip']")).getRect().getY();
    	System.out.println(Height);
    	System.out.println(Widht);
    	System.out.println(X);
    	System.out.println(Y);
    	Thread.sleep(3000);
    	driver.close();
	}

}
