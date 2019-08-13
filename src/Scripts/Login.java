package Scripts;

import org.testng.annotations.Test;

import Design.Generic_Class;
import POM.Login_Page;

public class Login extends Generic_Class{
	
	@Test
	public void main()
	{
		Login_Page lp= new Login_Page(driver);
		lp.from();
		lp.dst();
		
	}

}
