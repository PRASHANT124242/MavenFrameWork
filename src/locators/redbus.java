package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("pune");
	//	driver.findElement(By.xpath("//li[@data-id=\"67159\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("satara");
	//	driver.findElement(By.xpath("//li[@data-id=\"82895\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"fl icon-calendar_icon-new icon-onward-calendar icon\"]")).click();
	 //   driver.findElement(By.xpath("//input[@tabindex=\"3\"]")).click();
	    driver.findElement(By.xpath("//td[text()=\"23\"]")).click();
	    driver.findElement(By.xpath("//button[@class=\"fl button\"and\"@id=\"search_btn\"]")).click();
	
	}

}
