package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example_paralleltest2 
{
	@Test
	public void m4()
	{
		Reporter.log("test case m4 pass",true);
	}
	@Test
	public void m5()
	{
		Reporter.log("test case m5 pass",true);
	}
	@Test
	public void m6()
	{
		Reporter.log("test case m6 pass",true);
	}

}
