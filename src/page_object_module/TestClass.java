package page_object_module;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class TestClass {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
		
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 		OrangeHrmPage1 op1=new OrangeHrmPage1(driver);
 		
 		op1.username();
 		op1.password();
 		op1.login();
 		
 		OrangeHrmPage2 op2=new OrangeHrmPage2(driver);
 		
 		op2.name();
 		op2.timeatwork();
 		
 		
	
	
	}
	
	
	
	
}
