package Pom_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_DDF.pbHomePage;

public class pbTest2_pom_TestNG extends sample_BaseClass
{
pbloginpage pbl;
mobNoPage mob;
pbpwdpage p;
pbHomePage home;
pbmyaccpage acc;
pbmyprofilepage pro;
Sheet sh;
WebDriver driver;
@BeforeClass
public void openBrowser() throws EncryptedDocumentException, IOException, InterruptedException
{
	
	//FileInputStream file=new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
	 //sh=WorkbookFactory.create(file).getSheet("PB");
	 
	 browseropen();
	 Thread.sleep(2000);
	 pbl=new pbloginpage(driver);
	 mob=new mobNoPage(driver);
	 p=new pbpwdpage(driver);
	 home=new pbHomePage(driver);
	 acc=new pbmyaccpage(driver);
	 pro=new pbmyprofilepage(driver);
}
@BeforeMethod
public void pbLogin() throws EncryptedDocumentException, IOException
{
	
	pbl.clickonpbloginpagesignIn();
	
	//String mobileno =utilityclass.utility(0,0);
	//String mobileno=sh.getRow(0).getCell(0).getStringCellValue();
	mob.sendMonno(utilityclass.utility(0,0));
	mob.clickonpwd();
	

	String password=sh.getRow(0).getCell(1).getStringCellValue();
	p.pwdfield(utilityclass.utility(0,1));
	p.mobnofield();
	
}
	@Test
	public void pbFullName() throws InterruptedException, EncryptedDocumentException, IOException
	{
	
		home.opendropDownoption();
		Thread.sleep(2000);
		acc.clickonmyprofile();
		Thread.sleep(2000);
		pbmyprofilepage pro=new pbmyprofilepage(driver);
		//String Text=sh.getRow(0).getCell(2).getStringCellValue();
		pro.switchToChildwindow();
		String ActResult=pro.getfullnameprofilepage();
		String ExpectedResult=utilityclass.utility(0,2);
		Assert.assertEquals(ActResult, ExpectedResult,"failted:both result are differrent");
		//pro.grtTextfullname(Text);
		
	}

}
