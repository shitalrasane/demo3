package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class example_parallel1 
{
	@Test
	public void m2() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		driver.close();
	}
	

}
