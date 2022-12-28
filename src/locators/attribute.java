package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class attribute {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
       driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("1234");
	//      driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("4567");
	//	driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("4567");
    //xpath-//input[@aria-label="Email address or phone number"]
	//xpath-//input[@placeholder="Email address or phone number"]
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("qwer");
		driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();	
	//	driver.navigate().to("https://www.facebook.com/");
	    driver.navigate().back();
	}

}
