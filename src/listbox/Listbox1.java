package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://www.facebook.com/");
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
 		Thread.sleep(3000);
        WebElement day=driver.findElement(By.id("day"));
        WebElement month=driver.findElement(By.id("month"));
        WebElement year=driver.findElement(By.id("year"));
        
        Select s1=new Select(day);
        
     //   Q-how will you find the total size of the list
        
        List<WebElement> lday=s1.getOptions();
        
        System.out.println("total days:"+lday.size());
        for(int i=0;i<lday.size();i++) {
        
        	String dayvalue=lday.get(i).getText();
        	System.out.println(dayvalue);
        	if(dayvalue.equals("15")) {
        		
        		lday.get(i).click();
        		break;
        	}
        }
        Select s2=new Select(month);
        
        List<WebElement> lmonth=s2.getOptions();
        
        System.out.println("total months:"+lmonth.size());
        
        for(int i=0;i<lmonth.size();i++) {
        	
        	String monthvalue=lmonth.get(i).getText();	
        System.out.println(lmonth.get(i).getText());
        if(monthvalue.equals("May")) {
    		
    		lmonth.get(i).click();
    		break;
    	}
        }
        Select s3=new Select(year);   
       List<WebElement> lyear=s3.getOptions();
        
        System.out.println("total years:"+lyear.size());
        
        for(int i=0;i<lyear.size();i++) {
        	 String yearvalue=lyear.get(i).getText();	
        	 System.out.println(lyear.get(i).getText());	
            if(yearvalue.equals("1996")) {
        		
        		lyear.get(i).click();
        		break;
       
        }
           
     }

}
}