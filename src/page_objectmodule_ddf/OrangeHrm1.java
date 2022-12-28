package page_objectmodule_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrm1{

	@FindBy(xpath="//input[@name=\"username\"]")
	private WebElement user;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement pass;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement login;
	
	
	public OrangeHrm1(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void user(String username) {
		
		user.sendKeys(username);
	}
    public void password(String password) {
		
		pass.sendKeys(password);
	}
    public void log() {
		
		login.click();
	}



	
	
}
