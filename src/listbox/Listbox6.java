package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox6 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	    Thread.sleep(3000);
	    WebElement day=driver.findElement(By.id("day"));
	    WebElement month=driver.findElement(By.id("month"));
	    WebElement year=driver.findElement(By.id("year"));
	    String DOB="14/06/1991";
	    String date[]=DOB.split(DOB);
	    
	    

	}

}
