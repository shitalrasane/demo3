package PolicybazarProject1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class sample_gettextpb
{
	public static void main(String[]args) throws InterruptedException
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.policybazaar.com");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    
    driver.findElement(By.xpath("//a[@class=\"sign-in\"]")).click();
    driver.findElement(By.xpath("(//input[@type=\"number\"])[2]")).sendKeys("7718859728");
    driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
    driver.findElement(By.xpath("//input[@id=\"central-login-password\"]")).sendKeys("shital06.");
    driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	//driver.findElement(By.xpath("//a[@class="sign-in"]")).click();
	//driver.findElement(By.xpath("(//input[@type="number"])[2]")).sendkeys("7718859728");
	//driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
	//driver.findElement(By.xpath("//input[@id="central-login-password"]")).sendkeys("shital06.");
	//driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	WebElement myaccount=driver.findElement(By.xpath("//div[text()='My Account']"));

	Actions act=new Actions(driver);
	Thread.sleep(2000);
	act.moveToElement(myaccount).perform();
	Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
	//driver.findElements(By.xpath("//span[text()=' My profile ']")).click();
    Set<String> allids=driver.getWindowHandles();
    
    ArrayList<String> ids=new ArrayList<String>(allids);
    System.out.println(ids.size());
   Thread.sleep(2000);
	//Set<WebElement> allids=driver.windowhandals();
	driver.switchTo().window(ids.get(1));
	Thread.sleep(2000);
	String text= driver.findElement(By.xpath("//input[@id=\"outlined-secondary\"]")).getAttribute("value");
	Thread.sleep(2000);
	System.out.println(text);
	//String text=driver.findelement(By.xpath("(//input[@id="outlined-secondary"])[2]")).getText();
	Thread.sleep(2000);
	String dateOfBirth=driver.findElement(By.xpath("(//input[@id=\"outlined-secondary\"])[4]")).getAttribute("value");
System.out.println(dateOfBirth);
	String expetext="shital sumitkumar rasane"; 

	if(expetext.equals(text))
	{
	System.out.println("test case pass");
	}
	else
	{
	System.out.println("test case fail");
	}



	}
	}

