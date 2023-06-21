package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mobNoPage 
{
@FindBy(xpath="(//input[@type=\"number\"])[2]")private WebElement monno;
@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement pwd;

public mobNoPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void sendMonno()
{
	monno.sendKeys("7718859728");
}
public void clickonpwd()
{
	pwd.click();	
}
}