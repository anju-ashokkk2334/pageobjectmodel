package utlites;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class UtlityClass {
public String get_attribute(WebElement element,String attribute) {
/*This code defines a method called "get_attribute" that takes two parameters: 
 * element" of type WebElement and "attribute" of type String.
 * The method returns the value of the specified attribute of the given element
 */
	
   
		return element.getAttribute(attribute);
	}

public List<String> getTextOfElements(List<WebElement> elements) {
	/*This code defines a method called "getTextOfElements" that takes a parameter called "elements" of type List<WebElement>.
	 *The method returns a List of Strings, which contains the text values of all the elements in the given list. */
	 
	List<String> data = new ArrayList<String>();
	for (WebElement element : elements) {
		data.add(element.getText());

	}
	return data;
}
}