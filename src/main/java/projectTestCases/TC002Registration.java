package projectTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.Registration_page;

public class TC002Registration extends BaseClass{

	
	
	
	@Test
	public void Registration_page1() {
		
		Registration_page r=new Registration_page(driver);
		r.Registration_Action("mandeep", "kaur", "mandeepsaini151988@gmail.com", "Kuldip1957@","Kuldip1957@","2267240645");
		String expected="Register Account";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
	
	}
	 
	
	//@AfterMethod
	
		//public void closer() {
		//	 driver.quit();
		  
	//}

}
