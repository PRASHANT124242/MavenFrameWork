package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://www.facebook.com/");
 		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		Select s1=new Select(day);
		List<WebElement> dlist=s1.getOptions();
		//we have to print the size of the list
		System.out.println(dlist.size());
		//to print size of the list
		for(int i=0;i<dlist.size();i++) {
		String	dvalue=dlist.get(i).getText();
		System.out.println(dvalue);
			if(dvalue.equals("15")) {
				dlist.get(i).click();
				break;
			}
		}
		
		   Select s2=new Select(month);	
		   List<WebElement> mlist=s2.getOptions();
		   System.out.println(mlist.size());
		   for(int j=0;j<mlist.size();j++) {
			 String mvalue=mlist.get(j).getText();
			 if(mvalue.equals("May")) {
				 
				 mlist.get(j).click();
				 break;
			 }
		   }	 
		 
	  Select s3=new Select(year);
	  List<WebElement> ylist=s3.getOptions();
	  System.out.println(ylist.size());
	  for(int k=0;k<ylist.size();k++) {
		  
		  String yvalue=ylist.get(k).getText();
		  
		  if(yvalue.equals("1993")) {
			  
			 ylist.get(k).click();
			 
			 break; 
		  }
		  
		  
	  }
	  
	  
 }
	   
}


