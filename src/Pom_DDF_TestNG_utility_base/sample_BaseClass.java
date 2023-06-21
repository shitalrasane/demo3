package Pom_DDF_TestNG_utility_base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sample_BaseClass 
{
WebDriver driver;
	public void browseropen()
	{
		 driver = new FirefoxDriver();
			driver .manage().window().maximize();
			driver.get("https://www.policybazaar.com"); 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
	}
	

}
