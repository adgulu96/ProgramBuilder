package SSC.ProgramBuilder;

import org.testng.annotations.Test;

import com.pageObject_Repository.PBLoginPage;

import generics_Utilities.BaseClass;


public class LoginTest extends BaseClass
{
    
	@Test
	/**
	 * This Test case is use to login into the OLP application successfully.
	 */
	void loginToProgramBuilderAPP() throws InterruptedException
	{
		login = new PBLoginPage(driver);
		login.loginIntoProgramBuilder(comp,userid,password);
	}
	
	@Test
	void createNewProgram()
	{
		
	}
}
