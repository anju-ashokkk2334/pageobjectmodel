package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage {
	WebDriver driver;
	By inputform=By.xpath("//a[contains(text(),'Input Form')]");
	By showMessage=By.xpath("//button[@id='button-one']");
	
	public InputFormPage(WebDriver driver) {
		this.driver=driver;
	}
public void click_on_Inputform() {
	WebElement inputformElement=driver.findElement(inputform);
	inputformElement.click();
}
public String getShow_Messagelabel() {
	WebElement showMsgelement=driver.findElement(showMessage);
	return showMsgelement.getText();
}
}
