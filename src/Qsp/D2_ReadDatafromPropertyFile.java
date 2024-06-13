package Qsp;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2_ReadDatafromPropertyFile {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FileInputStream fis=new FileInputStream("./Testdata/Commondata.Property.txt");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		driver.get(url);
		String un = p.getProperty("username");
		driver.findElement(By.id("username")).sendKeys(un);
		String pwd = p.getProperty("password");
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath(".//div[text()='Login ']")).click();
		Thread.sleep(5000);
		driver.close();		
	}
}