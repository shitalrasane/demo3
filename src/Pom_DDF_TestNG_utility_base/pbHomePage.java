package Pom_DDF_TestNG_utility_base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pbHomePage 
{
@FindBy(xpath="//div[text()='My Account']")private WebElement myacc;
@FindBy(xpath="//span[text()=' My profile ']")private WebElement myprofile;

WebDriver driver1;
public pbHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	driver1=driver;
}
public void opendropDownoption() throws InterruptedException
{
	
	Actions act=new  Actions(driver1);
	Thread.sleep(2000);
	act.moveToElement(myacc).perform();
}
//public void clickProfilePage()
//{
//	myprofile.click();	
//}



}