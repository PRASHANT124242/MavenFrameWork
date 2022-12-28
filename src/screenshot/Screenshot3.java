package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot3 {


      public static void main(String[] args) throws InterruptedException, IOException {
			
        	 
        	 
        System.setProperty("webdriver.chrome.driver","C:\\installer\\chromedriver.exe");
  		
  		WebDriver driver=new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.get("https://www.orangehrm.com/");
  		Thread.sleep(3000);
  		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		         
	    String random=RandomString.make(5);
	    
	    String org="sample";
	    
	    File Dest=new File("C:\\Users\\DELL\\eclipse-workspace\\Automation\\ScreenShot\\"+org+random+".jpg");
	    
	    FileHandler.copy(source, Dest);
	    
	    driver.quit();
		 	 
        	 
     }
}
