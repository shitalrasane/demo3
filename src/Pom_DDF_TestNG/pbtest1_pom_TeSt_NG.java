package Pom_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_DDF.pbHomePage;

public class pbtest1_pom_TeSt_NG
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
	public void openBrowser() throws EncryptedDocumentException, IOException
	{

		 WebDriver driver = new FirefoxDriver();
			driver .manage().window().maximize();
			driver.get("https://www.policybazaar.com"); 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
		FileInputStream file=new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
		 sh=WorkbookFactory.create(file).getSheet("PB");
		 pbl=new pbloginpage(driver);
		 mob=new mobNoPage(driver);
		 p=new pbpwdpage(driver);
		 home=new pbHomePage(driver);
		 acc=new pbmyaccpage(driver);
		 pro=new pbmyprofilepage(driver);
	}
	@BeforeMethod
	public void pbLogin()
	{
		
		pbl.clickonpbloginpagesignIn();
		
	
		String mobileno=sh.getRow(0).getCell(0).getStringCellValue();
		mob.sendMonno(mobileno);
		mob.clickonpwd();
		

		String password=sh.getRow(0).getCell(1).getStringCellValue();
		p.pwdfield(password);
		p.mobnofield();
		
	}
		@Test
		public void pbFullName() throws InterruptedException
		{
		
			home.opendropDownoption();
			Thread.sleep(2000);
			acc.clickonmyprofile();
			Thread.sleep(2000);
			pro.switchToChildwindow();
			Thread.sleep(2000);
			String actualResult=pro.getfullnameprofilepage();
			System.out.println(actualResult);
			String ExpectedResult=sh.getRow(0).getCell(2).getStringCellValue();
			Assert.assertEquals(actualResult, ExpectedResult,"failed:both results are different");
			//(FullName2,FullName3);
			
			
		}

		
		private boolean equal(String fullName3, String fullName2) {
			// TODO Auto-generated method stub
			return false;
		}
		@AfterMethod
		public void pbLogout()
		{
			
			
		}
		
//		@AfterClass
//		public void closeBrowser()
//		{
//			driver.close();
//			
//			
//			
//		}
//		
		
		
		
		
		
		
		
		
		
	}


