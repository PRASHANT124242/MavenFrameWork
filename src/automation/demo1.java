package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
