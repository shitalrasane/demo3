package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample_priority 
{

	@Test(priority=1)
	public void  TC1()
	{
		
		Reporter.log("---Test case TC1---",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("---Test Case TC2---",true);
	}
	
	
}
