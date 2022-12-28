package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class sample1 {

	public static void main(String[] args) throws InterruptedException {


	    System.setProperty("webdriver.chrome.driver","C:\\installer\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
	    Thread.sleep(5000);
	    System.out.println(driver.getTitle());
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(5000);
	    System.out.println(driver.getTitle());
		driver.get("https://www.facebook.com/login.php/");
		Thread.sleep(5000);
	//	String s=driver.getTitle();
		System.out.println(driver.getTitle());
		driver.get("https://demo.automationtesting.in/Index.html");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"btn1\"]")).click();
        Thread.sleep(5000);
		driver.close();

	}

}
