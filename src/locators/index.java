package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class index {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		
		driver.get("https://www.facebook.com/");
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Rohit sharma");
		driver.findElement(By.xpath("//div[contains(@id,\"u_0_4\")]")).click();
		
	}

}
