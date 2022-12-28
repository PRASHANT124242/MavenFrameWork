package automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
	   System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
		
		String s="https://www.google.co.in/";
 		
 		driver.get(s);
 		URL u=new URL("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.navigate().to(u);
 		Thread.sleep(4000);
		
		
	
	
	}

}
