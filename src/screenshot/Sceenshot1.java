package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Sceenshot1 {




	public static void main(String[] args) throws InterruptedException, IOException {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\installer\\chromedriver.exe");
		
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		   File source =driver.getScreenshotAs(OutputType.FILE); 
		   
		   System.out.println(source);
		   
		   File dest=new File("C:\\Users\\DELL\\Desktop\\Screenshot\\sample.jpg");
		
		   FileHandler.copy(source, dest);
		   driver.quit();
		
		
		
		
	}
}
