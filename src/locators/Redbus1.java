package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/bus-tickets/pune-to-satara?fromCityName=Pune&fromCityId=130&toCityName=Satara&toCityId=362&onward=30-Sep-2022&srcCountry=IND&destCountry=IND&opId=0&busType=Any");
		driver.findElement(By.xpath("//img[@src=\"https://s3-ap-southeast-1.amazonaws.com/rb-plus/BI/APP/IND/WM/10215/1060/GW/DL/UEYIwn.jpeg\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"clearfix m-top-16\"]")).click();
	//	driver.findElement(By.xpath("//img[@src=\"https://st.redbus.in/images/offers/dussera_rav/274x148_EarlyBus.png\"]")).click();
   //     driver.findElement(By.xpath("//li[@id=\"signInLink\"]")).click();
	}

}
