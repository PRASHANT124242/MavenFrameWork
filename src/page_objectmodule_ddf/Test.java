package page_objectmodule_ddf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import page_object_module.OrangeHrmPage1;

public class Test {

	
	    public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
			
            WebDriver driver=WebDriverManager.chromedriver().create();
            
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			OrangeHrmPage1 op1=new OrangeHrmPage1(driver);
	    	
			String path="C:\\Users\\DELL\\Desktop\\Read.xlsx";
			
			FileInputStream file=new FileInputStream(path);
			
			Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
			
		   	String username=sh.getRow(1).getCell(0).getStringCellValue();
			System.out.println(username);
			String password=sh.getRow(1).getCell(1).getStringCellValue();
			System.out.println(password);
			String usename=sh.getRow(1).getCell(2).getStringCellValue();
			System.out.println(usename);
			OrangeHrm1 ohp=new OrangeHrm1(driver);
	 		
			ohp.user(username);
			ohp.password(password);
			ohp.log();
			OrangeHrm2 ohp1=new OrangeHrm2(driver);
			
			ohp1.name(usename);
	 		
	 		
	 		Thread.sleep(3000);
			
			
			
			
		}
	    
}
