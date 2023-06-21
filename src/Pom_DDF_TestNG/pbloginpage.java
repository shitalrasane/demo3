package Pom_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pbloginpage
{
@FindBy(xpath="//a[@class=\"sign-in\"]")	private WebElement signIn;
public pbloginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickonpbloginpagesignIn()
{
	signIn.click();
}

}



