package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Without_DDF {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

      
			System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
	 		WebDriver driver = new ChromeDriver();
	 		driver.manage().window().maximize();
	 		
	 		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 		
	 		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
            driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
            
            driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
            
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
            Thread.sleep(3000);
            
            String Ecpected="Paul Collings";
            
            
            String Actual=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
            Thread.sleep(3000);
            if(Actual.equals(Ecpected))
            {
            	
            	System.out.println("Test case Passed");

            }
            else
            {
            
            	System.out.println("Test case failed");
            }	
            
            	
            
            
            driver.quit();
            		 

	}

}
