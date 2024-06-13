package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		String url = driver.getCurrentUrl();
		// get title using (title variable)
		System.out.println(url);
		//print the title through (title)refrence
		Thread.sleep(5000);
		driver.close();
	}

}
