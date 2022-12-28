package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hubspot {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Thread.sleep(3000);
		WebElement country=driver.findElement(By.tagName("select"));
		Thread.sleep(2000);
		Select s1=new Select(country);
		s1.selectByValue("IND");
		Thread.sleep(2000);
		s1.selectByVisibleText("Belarus");
		Thread.sleep(2000);
	    s1.selectByIndex(1);

	}

}
