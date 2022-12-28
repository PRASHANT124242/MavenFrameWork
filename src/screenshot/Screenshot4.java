package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
        System.setProperty("webdriver.chrome.driver","C:\\installer\\chromedriver.exe");
  		
  		WebDriver driver=new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.get("https://www.facebook.com/");
  		Thread.sleep(3000);
        WebElement Screen=driver.findElement(By.xpath("//img[@alt=\"Facebook\"]"));
        Thread.sleep(3000);
  		
  	    File Source=((TakesScreenshot)Screen).getScreenshotAs(OutputType.FILE);	
  		
  	    File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\Automation\\ScreenShot\\fb.jpg");
  		
  	    FileHandler.copy(Source, dest);
	}

}
