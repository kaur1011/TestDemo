package projectTestCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.TC005contactUs_Page;

public class TC005contactUs extends BaseClass{
		
		@Test
		public void DropDown() {
			TC005contactUs_Page dd=new TC005contactUs_Page(driver);
			dd.drop_drown();
		}

		
}
