package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pom_DDF.pbHomePage;
import testng.pbloginpage;

public class pbsignout {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		pbloginpage login=new pbloginpage(driver);
		login.clickonpbloginpagesignIn();
		
		mobNoPage mob=new mobNoPage(driver);
		mob.sendMonno();
		mob.clickonpwd();
		
		pbpwdpage pd=new pbpwdpage(driver);
		pd.pwdfield();
        pd.mobnofield();
        
        
        pbHomePage home=new pbHomePage(driver);
        home.opendropDownoption();
        
        pbmyaccpage acc=new pbmyaccpage(driver);
        acc.clickonsignout();
        
	}

}
