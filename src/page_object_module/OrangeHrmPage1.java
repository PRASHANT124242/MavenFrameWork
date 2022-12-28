package page_object_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmPage1 {

	
	//Data members and variables should be declared globally with access level private by using @findby annotations
	
		@FindBy(xpath="//input[@name=\"username\"]")
		private WebElement username;
		
		@FindBy(xpath="//input[@name=\"password\"]")
		private WebElement password;
		
		@FindBy(xpath="//button[@type=\"submit\"]")
		private WebElement login;
		
		public OrangeHrmPage1(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}
		
		public void username() {
			
			username.sendKeys("Admin");
			
		}
        public void password() {
			
			password.sendKeys("admin123");
			
		}
        public void login() {
			
			login.click();
			
		}

	
	
	
	
}
