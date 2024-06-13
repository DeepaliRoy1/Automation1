package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		//main method
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrver.exe");
		//(java.lang)(java package)(class) (setproperty->static method)(string-key->webdriver.chrome.driver)(string value->./driver/chromedriver.exe)
		ChromeDriver driver=new ChromeDriver();
		//launch the browser whichever u want here we use chrome thats why we take chromedriver
		Thread.sleep(5000);
		//wait time for 5s
		driver.close();
		//close the browser
		
	
		
	}
}
