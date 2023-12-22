package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utlites.UtlityClass;

public class TablePage {
	WebDriver driver;
	UtlityClass utlityclass;
	
	
	@FindBy(xpath = "(//a[contains(text(),'Table')])[1]")
	WebElement tablelink;
	@FindBy(xpath="//div[contains(text(),'Table with Pagination Example')]")
	WebElement tableHeading;
	@FindBy(xpath="//table//tbody//tr//td[1]")
	List<WebElement>elementName;
	/*variable called "elementName" is declared as a List of WebElements. This means that "elementName" can hold multiple WebElement objects. 
	t can be used to store a collection of web elements for further use in the code.*/
	public TablePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//this current class object//driver web element intialize cheyn
		// initElements is a static method in Page Factory class. 
		//using it initialize all the web elements located by @FindBy annotation. 
	}
@FindBy(xpath="//table[@id='dtBasicExample']//tbody//tr[4]//td[3]")
WebElement credlylic;
	
	public void click_on_tableLink() {
	tablelink.click();
}
public String get_heading() 
{
return tableHeading.getText();	
}


public String check_attribute() {
	utlityclass=new UtlityClass();
	String attribute=utlityclass.get_attribute(tableHeading, "class");
	/*a variable called "attribute" is declared and assigned the value returned by the "get_attribute" method of the "utlityclass"
	 *The method takes two parameters: "tableHeading" (which is a WebElement) and "class" (which is a String). 
	 *The "get_attribute" method retrieves the value of the specified attribute 
	 *("class" in this case) from the "tableHeading" element and assigns it to the "attribute" variable.  */
	
	return attribute;
}

public void print_all_names() {
	List<String>names=new ArrayList<String>();
	utlityclass=new UtlityClass();
	names=utlityclass.getTextOfElements(elementName);
	System.out.println(names);
}
public String get_OfficeofPerson(String personName) {
	List<String>person=new ArrayList<String>();
	utlityclass=new UtlityClass();
	person=utlityclass.getTextOfElements(elementName);
	System.out.println(person);
	int index=0;
	for(index=0;index<person.size();index++)
	{
		if(personName.equals(person.get(index)))
		{
			index++; 
			break;
		}
	}
	WebElement office=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+index+"]//td[3]"));
	return office.getText();
}
}

