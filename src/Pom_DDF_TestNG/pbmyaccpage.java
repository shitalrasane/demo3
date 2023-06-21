package Pom_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pbmyaccpage 
{
	@FindBy(xpath="//span[text()=' My profile ']") private WebElement myprofile;
	@FindBy(xpath="//span[text()='Sign out']") private WebElement signout;

	public pbmyaccpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonmyprofile()
	{
		myprofile.click();	
	}
	public void clickonsignout()
	{
		signout.click();
	}
	
}
