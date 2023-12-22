package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DatepickerPage  {
	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Date Pickers')]")
	WebElement datePickerElement;
	
	@FindBy(xpath="(//span[@id='basic-addon1']//i[@class='fa fa-calendar'])[1]")
	WebElement clickCalender;
	
	@FindBy(xpath="(//table[@class='table-condensed']//tr[2]//th[2])[1]")
	WebElement monthElement;
	
	@FindBy(xpath="(//table[@class='table-condensed']//tr[2]//th[1])[1]")
	WebElement previousArrow;
	
	@FindBy(xpath="(//table[@class='table-condensed']//tr[2]//th[3])[1]")
	WebElement nextArrow;
	
	public DatepickerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void click_on_datepicker() {
	datePickerElement.click();
}
public void selectDate() {
	clickCalender.click();
	String date="16-12-2000";
	String arry[]=date.split("-");
	String day=arry[0];
	String monthIndex=arry[1];
	String yearIndex=arry[2];
	int m=Integer.parseInt(monthIndex);
	int y=Integer.parseInt(yearIndex);
	String month="";
	switch (m) {
	case 01:
		month = "January";
		break;
	case 2:
		month = "February";
		break;
	case 3:
		month = "March";
		break;
	case 4:
		month = "April";
		break;
	case 5:
		month = "May";
		break;
	case 6:
		month = "June";
		break;
	case 7:
		month = "July";
		break;
	case 8:
		month = "August";
		break;
	case 9:
		month = "September";
		break;
	case 10:
		month = "October";
		break;
	case 11:
		month = "November";
		break;
	case 12:
		month = "December";
}
	String month_year=month+" "+yearIndex;
	System.out.println(month_year);
	while(true) {
		String acutal_monthDate=monthElement.getText();
		//System.out.println(acutal_monthDate);
		
		if(month_year.equals(acutal_monthDate))
		{
			break;
		}
		else if(m<=12 && y<2023)
		{
			previousArrow.click();
		}
		else
		{
			nextArrow.click();
		}
	
	}
	WebElement element=driver.findElement(By.xpath("//td[text()='"+day+"' and @class='day']"));
	element.click();
	}
}

