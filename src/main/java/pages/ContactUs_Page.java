package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ContactUs_Page extends BasePage {
	public ContactUs_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	@FindBy(xpath=("/html/body/footer/div/div/div[2]/ul/li[1]/a"))
	public WebElement Conus;
	
	@FindBy(name="name")
	public WebElement Yname;
	
	@FindBy(name="email")
	public WebElement Email;
	
	@FindBy(name="enquiry")
	public WebElement Enquiry;
	
	@FindBy(xpath=("//*[@id=\"content\"]/form/div/div/input"))
	public WebElement btn;
	
	
	public void Contact(String yname,String email,String enq) {
		Conus.click();
		Yname.sendKeys(yname);
		Email.sendKeys(email);
		Enquiry.sendKeys(enq);
		btn.click();
		
	}
	

}
