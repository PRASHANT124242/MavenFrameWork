package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_With_DDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
 		
 		
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 		
 		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 		
 		String Path="C:\\Users\\DELL\\Desktop\\Read.xlsx";
 		
 		
 		FileInputStream file=new FileInputStream(Path);
 		  
	    Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");  
	    String user=sh.getRow(1).getCell(0).getStringCellValue();
	    System.out.println(user);
	    String pass=sh.getRow(1).getCell(1).getStringCellValue();
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(user);
        
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pass);
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(3000);
        
        String Expected="Paul Collings";
        
        
        String Actual=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
        Thread.sleep(3000);
        if(Actual.equals(Expected))
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
