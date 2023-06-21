package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example_groups
{
@Test(groups="login")
public void m1()
{
	Reporter.log("test case m1 pass",true);
	
}
@Test(groups="profile")
public void m2()
{
	Reporter.log("test case m2 pass",true);
	
}
@Test (groups="settings")
public void m3()
{
Reporter.log("test case m3 pass",true);	

}
@Test(groups="login")
public void m4()
{
	Reporter.log("test case m4 pass",true);
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
