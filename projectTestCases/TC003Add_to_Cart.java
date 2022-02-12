package projectTestCases;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.Add_to_Cart_Page;


public class TC003Add_to_Cart extends BaseClass {
	
	public class Login {
		
		 
		@Test
		public void Add_to_Cart_page() {
			
			//String expected="Account Login";
			//String actual=driver.getTitle();
			//Assert.assertEquals(expected, actual);
		Add_to_Cart_Page a=new Add_to_Cart_Page(driver);
		a.click();
		a.add_Cart();
	  }
		}
		

	}

