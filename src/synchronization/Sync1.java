package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sync1 {

	public static void main(String[] args) {

         WebDriver driver=WebDriverManager.chromedriver().create();
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         //it is applied globally......it is available for all the WebElements
         
         WebElement Fname=driver.findElement(By.xpath("//input[@name=\"username\"]"));
         WebElement Lname=driver.findElement(By.xpath("//input[@name=\"password\"]"));
         WebElement Mailid=driver.findElement(By.xpath("//input[@formcontrolname=\"email\"]"));
         WebElement Password=driver.findElement(By.xpath("//input[@formcontrolname=\"password\"]]"));
         
         
         
		
		

	}

}
