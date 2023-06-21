package Pom_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pom_DDF.pbHomePage;
import testng.pbloginpage;

public class pbtest 
{
	public static void main(String []args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("PB");
		
		WebDriver driver=new FirefoxDriver();
		driver .manage().window().maximize();
		driver.get("https://www.policybazaar.com"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		pbloginpage pbl=new pbloginpage(driver);
		pbl.clickonpbloginpagesignIn();
		
		mobNoPage mob=new mobNoPage(driver);
		String mobileno=sh.getRow(0).getCell(0).getStringCellValue();
		mob.sendMonno(mobileno);
		mob.clickonpwd();
		
		pbpwdpage p=new pbpwdpage(driver);
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		p.pwdfield(password);
		p.mobnofield();
		
		pbHomePage home=new pbHomePage(driver);
		home.opendropDownoption();
		
		pbmyaccpage acc=new pbmyaccpage(driver);
		Thread.sleep(2000);
		acc.clickonmyprofile();
		
		pbmyprofilepage pro=new pbmyprofilepage(driver);
		String Text=sh.getRow(0).getCell(2).getStringCellValue();
		pro.switchToChildwindow();
       pro.grtTextfullname(Text);

}
}
