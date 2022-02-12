package projectTestCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.PurchaseGiftCertificate_Page;

public class TC004PurchaseGiftCertificate extends BaseClass{
	
	  
	@Test
	public void Gift_Certificate() {
		PurchaseGiftCertificate_Page gc=new PurchaseGiftCertificate_Page(driver);
		gc.p_Gift("mandy", "mkind649@gmail.com", "mandeep", "mandeepsaini151988@gmail.com", "ksksjjsjjsjsjsjsks", "1");
	}
	

	
}
