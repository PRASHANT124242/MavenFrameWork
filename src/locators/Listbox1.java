package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {

  public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","C:\\installer\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver(); 
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	  Thread.sleep(3000);
	 WebElement day=driver.findElement(By.xpath("//select[@title=\"Day\"]"));
	  Thread.sleep(3000);
	  WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
	  Thread.sleep(3000);
	  WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
	  Thread.sleep(3000);
	  Select select1=new Select(day);
	  select1.selectByVisibleText("20");
	  Thread.sleep(3000);
	  Select select2=new Select(month);
	  select2.selectByVisibleText("May");
	  Thread.sleep(3000);
      Select select3=new Select(year);
	  select3.selectByVisibleText("1991");
	  Thread.sleep(3000);
}
}
