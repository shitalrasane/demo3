package PolicybazarProject1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class example1_ddf {

	public static void main(String[] args) throws InterruptedException 
	{
    WebDriver driver=new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //opn applicatin
     driver.get("https://www.policybazaar.com");
     //click on sign in btn
     driver.findElement(By.xpath("//a[@class=\"sign-in\"]")).click();
     //click on mobile btn
     driver.findElement(By.xpath("(//input[@type=\"number\"])[2]")).sendKeys("7718859728");
     //click onpwd btn
     driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
     //send pwd
     driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("shital06.");
     //click on btn
     driver.findElement(By.xpath("//span[text()='Sign in']")).click();
     //click on profile
    WebElement myAccount= driver.findElement(By.xpath("//div[text()='My Account']"));
     
    Actions act=new Actions(driver);
    Thread.sleep(1000);
    act.moveToElement(myAccount).perform();
    
//act.click(target)
    WebElement MyProfile=driver.findElement(By.xpath("//span[text()=' My profile ']"));
    act.click(MyProfile).perform();
    
    Thread.sleep(1000);
   // String name=  driver.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys("shital");
    
    Set<String>allids=driver.getWindowHandles();
    System.out.println(allids);
    Thread.sleep(1000);
    ArrayList<String> a=new ArrayList<String>(allids);
    System.out.println(a.size());
    String child=a.get(1);
    System.out.println(child);
    Thread.sleep(2000);
   // driver.findElement(By.xpath("//i[@class=\"icon-bg homeIconsBg term-life\"]")).click();

driver.switchTo().window(child);
    Thread.sleep(2000);
 //   driver.switchTo().
   //driver.findElement(By.xpath("//span[text()='Male']")).click();
   String name= driver.findElement(By.xpath("//input[@id=\"outlined-secondary\"]")).getAttribute("value");
   Thread.sleep(2000);
   System.out.println(name);
   String exp="shital sumitkumar rasane";
   
   if(exp.equals(name))
   {
	System.out.println("test case pass");   
	   
   }
   else
   {
	   System.out.println("test case fail");
   }
   //String parent=a.get(0);
   //driver.switchTo().window(parent);
   //Thread.sleep(2000);
  // driver.findElement(By.xpath("//i[@class=\"icon-bg homeIconsBg term-life\"]")).click();





	}

}