package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;


public class takesScreenShot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	public void getsS() throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot t=(TakesScreenshot) driver;
		//To use driver we have to extend BaseClass after Class
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/ss.png");
		Files.copy(src, dest);
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}
	

}
