package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String title = driver.getTitle();
		// get title using (title variable)
		System.out.println(title);
		//print the title through (title)refrence
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.close();
	}


}
