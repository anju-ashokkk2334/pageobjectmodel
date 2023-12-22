package testes;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.DatepickerPage;

public class DatePickerTest extends BaseClass{
	DatepickerPage datepickerpage;
	@Test
	public void open_datepickerPage() {
		datepickerpage =new DatepickerPage(driver);
		datepickerpage.click_on_datepicker();
		
		datepickerpage.selectDate();
		
	}

}
