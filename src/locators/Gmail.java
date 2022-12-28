package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
 		String s="https://www.google.co.in/";
 		driver.get(s);
		driver.navigate().to(s);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("gmail");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value=\"Google Search\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h3[text()=\"Gmail - Google\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class=\"laptop-desktop-only\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label=\"First name\"]")).sendKeys("PRASHANT");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label=\"Last name\"]")).sendKeys("THORAT");

	}

}
