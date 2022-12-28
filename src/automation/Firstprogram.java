package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\installer\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	//	 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
         driver.manage().window().minimize();
   //      driver.manage().window().maximize();
//	     Thread.sleep(5000);
//	     driver.get("https://www.youtube.com/");
//	   
//         Thread.sleep(5000);
//         driver.findElement(By.xpath("//yt-icon[@id=\"close-icon\"]")).click();
//         Thread.sleep(5000);
//         driver.findElement(By.xpath("//tp-yt-paper-item[@role=\"tab\"]")).click();
//         driver.get("https://www.facebook.com/login/");
//         Thread.sleep(5000);
//         String s=driver.getTitle();
//         System.out.println(s);
                  
//	     driver.close();
	}

}
