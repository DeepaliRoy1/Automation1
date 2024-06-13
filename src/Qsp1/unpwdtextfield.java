package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class unpwdtextfield {
	public static void main(String[] args) throws InterruptedException {
		//main method
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//set the path
		ChromeDriver driver = new ChromeDriver();
		//launch the browser
		driver.manage().window().maximize();
		//maxmize
 	   driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_1aeuamiuit_b&adgrpid=58746164597&hvpone=&hvptwo=&hvadid=617721280249&hvpos=&hvnetw=g&hvrand=13419622716960773810&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-298741529014&hydadcr=5903_2362026&gclid=EAIaIQobChMIq57nmIGlgwMV9iqDAx3znQl_EAAYASAAEgLKK_D_BwE");
		//navigate to facebook
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("@deep08@gmail.com");
		//enter untextfield
		driver.findElement(By.id("pass")).sendKeys("Deep@08");
		//enter pwdtextfield
 	   driver.findElement(By.id("nav-search-submit-button")).click();

		Thread.sleep(5000);
		//wait
		driver.close();
		//closeii
	}

}
