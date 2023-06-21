package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class example_groups4 
{
	@Test
	public void m1() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com");
Thread.sleep(2000);
driver.close();		
	}
}
