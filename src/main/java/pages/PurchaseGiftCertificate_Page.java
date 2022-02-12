package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class PurchaseGiftCertificate_Page extends BasePage{
	public PurchaseGiftCertificate_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	@FindBy(xpath=("/html/body/footer/div/div/div[3]/ul/li[2]/a"))
	public WebElement RGC;
	@FindBy(name="to_name")
	public WebElement recipitentName;
	
	@FindBy(name="to_email")
	public WebElement recipitentNameEmail ;
	
	@FindBy(name="from_name")
	public WebElement YName;
	
	@FindBy(name="from_email")
	public WebElement Yemail;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div[5]/div/div[1]/label")
	public WebElement GCTheme;
	
	@FindBy(xpath="//*[@id=\"input-message\"]")
	public WebElement Messg;
	
	@FindBy(name="amount")
	public WebElement Amount;
	
	@FindBy(name="agree")
	public WebElement checkack;
	
	@FindBy(xpath=("//body/div[@id='account-voucher']/div[1]/div[1]/form[1]/div[8]/div[1]/input[2]"))
	public WebElement btn;
	
	public void p_Gift(String rname,String rEmail,String yname,String yemail,String msg,String amt) {
		RGC.click();
		recipitentName.sendKeys(rname);
		recipitentNameEmail.sendKeys(rEmail);
		YName.sendKeys(yname);
		Yemail.sendKeys(yemail);
		GCTheme.click();;
		Messg.sendKeys(msg);
		Amount.sendKeys(amt);
		checkack.click();
	btn.click();	
	}
	
	
}
