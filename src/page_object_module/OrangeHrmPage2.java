package page_object_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmPage2 {

	@FindBy(xpath="//p[@class=\"oxd-userdropdown-name\"]")
	private WebElement name;
	
	@FindBy(xpath="(//p[@class=\"oxd-text oxd-text--p\"])[1]")
	private WebElement timeatwork;
	
	public OrangeHrmPage2(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
	}
	
	public void name() {
		
		String Uname=name.getText();
		
		if(Uname.equals("Siri Gundu")) {
			
			System.out.println("test Passed");
		}
		else {
			
			System.out.println("test failed");
		}
   
		
	}
	
   public void timeatwork() {
		
	boolean time=timeatwork.isDisplayed();
	
	System.out.println(time);
		
	}
	
	
}
