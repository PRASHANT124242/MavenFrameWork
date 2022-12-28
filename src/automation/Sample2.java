package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

     public static void main(String[] args) throws InterruptedException {
		
    	 System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
    		WebDriver driver = new ChromeDriver();
    		driver.get("https://www.amazon.in/");
    		Thread.sleep(5000);
    		driver.get("https://kite.zerodha.com/forgot");
    		Thread.sleep(5000);
    		driver.get("https://demo.automationtesting.in/Windows.html");
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
    		Thread.sleep(5000);
    		driver.close();
    	 
    	 
    	 
    	 
	}	
	
	
	
	
	
}


