package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox5 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("day")).click();
	    List<WebElement>dlist=driver.findElements(By.xpath("//select[@id=\"day\"]//option"));
	    System.out.println(dlist.size());
	    
	    for(int i=0;i<dlist.size();i++) {
	    	       
	    String dvalue=dlist.get(i).getText();
	    
	    if(dvalue.equals("14")){
	    	
	    	dlist.get(i).click();
	    	break;
	    	
	    }
	    
	    
	    }
	    
//	    driver.findElement(By.id("month")).click();
	    List<WebElement> mlist=driver.findElements(By.xpath("//select[@id=\"month\"]//option"));
	    System.out.println(mlist.size());
	    
	     for(int i=0;i<mlist.size();i++) {
	    String mvalue=mlist.get(i).getText();
	    
	    if(mvalue.equals("May")) {
	    	
	    	mlist.get(i).click();
	    	break;
	    }
	    	 
	     }
	    
	    driver.findElement(By.id("year")).click();
	    List<WebElement> ylist=driver.findElements(By.xpath("//select[@id=\"year\"]//option"));
	    System.out.println(ylist.size());
	    
	    for(int i=0;i<ylist.size();i++) {
	    	
	    String yvalue=ylist.get(i).getText();
	    
	    if(yvalue.equals("1947")) {
	    	
	    	ylist.get(i).click();
	    	break;
	    	
	    }
	    	
	    	
	    }
		

	}

}
