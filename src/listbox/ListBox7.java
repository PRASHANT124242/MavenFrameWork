package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
	    driver.get("https://www.ixigo.com/buses");
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Leaving from\"]")).sendKeys("pune");
		Thread.sleep(3000);
		 List<WebElement> frlist=driver.findElements(By.xpath("//div[@class=\"result-row bus-station u-box-result\"]"));
		 System.out.println(frlist.size());
		 
		 for(int i=3;i<frlist.size();i++) {
			 
		String fvalue=frlist.get(i).getText();
		System.out.println(fvalue);
			 
		 }

	}

}
