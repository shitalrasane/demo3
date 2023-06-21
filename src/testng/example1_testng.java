package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class example1_testng 
{
	@Test
public void m1() throws InterruptedException
{
WebDriver driver=new FirefoxDriver();
driver.get("http://www.facebook.com");
Thread.sleep(2000);
driver.close();
}
}
