package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example_beforclass 
{	@BeforeClass
	public void driveropen()
	{
	Reporter.log("open driver",true);
	}
	@Test(priority=2)
	public void m1()
	{
		Reporter.log("test m1 case pass",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("test m2 case pass",true);	
	}
   @AfterMethod
   public void logout()
   {
	   
	   Reporter.log("test m3 case pass",true);
   }
   @Test(priority=2)
   public void m4()
   {
	   Reporter.log("test m4 case pass",true);  
   }
   @AfterClass
   public void driverclose()
   {
	 Reporter.log("driver close",true);  
   }
	}


