package pom_DDF;

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

public void switchToChildwindow() 
{
	Set<String> ides=driver1.getWindowHandles();

	ArrayList<String> al=new ArrayList(ides);
	
	driver1.switchTo().window(al.get(1));
	
}
public void grtTextfullname(String text)
{
	String actname=fullname.getAttribute("value");
	//String expcname="shital sumitkumar rasane";
	
	if(text.equals(actname))
	{
		
		System.out.println("test case pass");
	}
	else
	{
		System.out.println("test case fail");
	}

}



}
