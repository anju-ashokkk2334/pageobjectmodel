package testes;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass {
	InputFormPage inputformpage;
	@Test
	public void verify_MessageField() {
		inputformpage =new InputFormPage(driver);
		inputformpage.click_on_Inputform();
	}
	@Test
public void verifyShowmessagebutton() {
		inputformpage =new InputFormPage(driver);
		inputformpage.click_on_Inputform();
		String expectedShowMessage="Show Message";
		String actualShowMessage=inputformpage.getShow_Messagelabel();
		System.out.println(actualShowMessage);
		Assert.assertEquals(actualShowMessage, expectedShowMessage);
}
}
