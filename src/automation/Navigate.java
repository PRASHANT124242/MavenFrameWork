package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
		
 		driver.manage().window().maximize();
 		driver.get("https://www.google.co.in/");
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		driver.get("https://www.myntra.com/men-casual-shirts");
		Thread.sleep(4000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.navigate().to("https://www.javatpoint.com/");
		Thread.sleep(4000);
		driver.navigate().to("https://kite.zerodha.com/");
		Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.quit();
	}

}
