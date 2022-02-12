package projectTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.ContactUs_Page;

public class TC005contactUs extends BaseClass{
		
		@Test
		public void ConUs() {
			ContactUs_Page cu=new ContactUs_Page(driver);
			cu.Contact("mandeep", "mkind649@gmail.com", "latest laptop version");
			String expected="Contact Us";
			String actual=driver.getTitle();
			Assert.assertEquals(expected, actual);
		}

		
}
