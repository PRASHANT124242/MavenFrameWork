package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://www.facebook.com/");
 		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("day")).click();
        List<WebElement> day=driver.findElements(By.xpath("//select[@id=\"day\"]//option"));
		
		System.out.println(day.size());
		
		for(int i=0;i<day.size();i++) {
		  String dvalue=day.get(i).getText();
		  
		  if(dvalue.equals("15")) {
			  
			  day.get(i).click();
			  break;
		  }
			
			
		}
		driver.findElement(By.id("month")).click();
		List<WebElement> month=driver.findElements(By.xpath("//select[@id=\"month\"]//option"));
		System.out.println(month.size());
		
		for(int i=0;i<month.size();i++) {
			
			String mvalue=month.get(i).getText();
			if(mvalue.equals("May")) {
				
				month.get(i).click();
				break;
			}
			
		}
		driver.findElement(By.id("year")).click();
		List<WebElement> year=driver.findElements(By.xpath("//select[@id=\"year\"]//option"));
		System.out.println(year.size());
             for(int i=0;i<year.size();i++) {
			
			String yvalue=year.get(i).getText();
			if(yvalue.equals("1996")) {
				
				year.get(i).click();
				break;
			}
			
		}

	}

}
