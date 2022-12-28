package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setzize {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
		
 		driver.manage().window().maximize();
 		Thread.sleep(4000);
 		driver.get("https://www.google.co.in/");
// 		Dimension size=new Dimension(1296,696);
//	    driver.manage().window().setSize(size);
		driver.manage().window().setSize(new Dimension(1024, 768));
 		int width = driver.manage().window().getSize().getWidth();
 		int height = driver.manage().window().getSize().getHeight();
 		System.out.println(width);
 		System.out.println(height);
 		
 		Thread.sleep(4000);
		System.out.println(driver.manage().window().getSize());
		
	}

}
