package testes;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.TablePage;

public class TableTestes extends BaseClass {
	TablePage tablepage;
	@Test
	public void verify_heading()
	{
		tablepage=new TablePage(driver);
		tablepage.click_on_tableLink();
	}
	@Test
	public void verify_tableheading() {
		tablepage=new TablePage(driver);
		tablepage.click_on_tableLink();
	String actual=tablepage.get_heading();
	System.out.println(actual);
	String expected="Table with Pagination Example";
	Assert.assertEquals(actual, expected);
	String attri=tablepage.check_attribute();
	System.out.println(attri);
		
		
	}
	@Test
	public void getNames() {
		tablepage=new TablePage(driver);
		tablepage.click_on_tableLink();
		tablepage.print_all_names();
	
		}
	@Test
	public void printOffice_ofparticularPerson() {
		tablepage=new TablePage(driver);
		tablepage.click_on_tableLink();

		String printoffice=	tablepage.get_OfficeofPerson("Cedric Kelly");
		System.out.println("The office of given person is "+printoffice);
		
	}
	

}
//mukalil kodukatha tablepage null ayi intialize cheyum becoz of  compile tym polymorphism thazhye kodutha run time polymorphism