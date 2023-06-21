package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1_keywords 
{
	@Test(invocationCount=5)
	public void tc1()
	{
		Reporter.log("---test case tc1----",true);
		
	}
	@Test(enabled=false)
	public void tc2()
	{
		Reporter.log("---test case tc2----",true);
		
	}
	@Test
	public void tc3()
	{
		Reporter.log("---test case tc3----",true);
		
	}
	
	
	
	
	

}
