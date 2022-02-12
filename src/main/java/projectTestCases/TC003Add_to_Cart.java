package projectTestCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.Add_to_Cart_Page;


public class TC003Add_to_Cart extends BaseClass {
	
	public class Login {
		
		 
		@Test
		public void Add_to_Cart_page() {
			
		Add_to_Cart_Page a=new Add_to_Cart_Page(driver);
		a.click();
		a.add_Cart();

		String expected="Phones & PDAs";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
	  }
		}
		

	}

