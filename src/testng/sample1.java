package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com"); 
        Thread.sleep(2000);
	driver.close();
	
	
	}

}
