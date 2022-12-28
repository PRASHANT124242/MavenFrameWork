package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.google.co.in/");
         
         driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Gmail account create");
         
           Thread.sleep(3000);
           driver.findElement(By.xpath("(//input[@value=\"Google Search\"])[1]")).click();
           Thread.sleep(3000);
           driver.findElement(By.xpath("(//h3[contains(@class,\"LC20lb MBeuO DKV0Md\")])[1]")).click();
           Thread.sleep(3000);
           driver.findElement(By.xpath("//a[@class=\"action-button\"]")).click();

           Thread.sleep(3000);
           driver.findElement(By.xpath("(//input[contains(@class,\"whsOnd zHQkBf\")])[1]")).click();
           Thread.sleep(5000);
          driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click(); 
       //    driver.findElement(By.xpath("//input[@jsname=\"YPqjbf\"]")).sendKeys("Abhishek");
       //    Thread.sleep(3000);
       //   driver.findElement(By.xpath()).sendKeys("Mudholkar");

        //   driver.findElement(By.xpath("//div[@class=\"rFrNMe N3Hzgf jjwyfe ACpCs pXgSje q0K82e zKHdkd sdJrJc Tyc9J CDELXb\"]")).sendKeys("oyeabhya");
                        


	}

}
