package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sample1_TestNG
{
	
	@Test
public void m1()throws InterruptedException
{
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook..com");
Thread.sleep(2000);



}
	
	
	
	
}
