package Pom_DDF_TestNG_utility_base;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pbmyprofilepage 
{
@FindBy(xpath="//input[@type=\"text\"]")private WebElement fullname;
WebDriver driver1;
public pbmyprofilepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	driver1=driver;
}

public void switchToChildwindow() throws InterruptedException 
{
	Set<String> ides=driver1.getWindowHandles();
Thread.sleep(2000);
	ArrayList<String> al=new ArrayList(ides);
	Thread.sleep(2000);
	driver1.switchTo().window(al.get(1));
	
}

public String getfullnameprofilepage ()
{
String actfullName=fullname.getAttribute("value");
return actfullName;

}
//public void grtTextfullname(String text)
//{
//	String actname=fullname.getAttribute("value");
//	//String expcname="shital sumitkumar rasane";
//	
//	if(text.equals(actname))
//	{
//		
//		System.out.println("test case pass");
//	}
//	else
//	{
//		System.out.println("test case fail");
//	}

}




