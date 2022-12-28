package automation;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setposition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
		
 		driver.manage().window().maximize();
 		Thread.sleep(4000);
 		driver.get("https://www.google.co.in/");
 		Thread.sleep(4000);
// 		Point size=new Point(440,550);
// 	    driver.manage().window().setPosition(size);
 	      driver.manage().window().setPosition(new Point(660,330));
 		  int x = driver.manage().window().getPosition().getX();
 		  int y = driver.manage().window().getPosition().getY();
            System.out.println(x);
 		    System.out.println(y);
 		
		//System.out.println(driver.manage().window().getPosition());

        driver.quit();
	}

}
