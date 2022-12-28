package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
