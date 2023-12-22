package testes;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class HomeTestes extends BaseClass {
	HomePage homepage;
	@Test
	public void verify_logo() {
		homepage=new HomePage(driver);
		homepage.isLogo_Displayed();
		
		
	}
	

}
