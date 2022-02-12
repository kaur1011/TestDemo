package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Registration_page extends BasePage {
	 WebDriver driver;


	public Registration_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	
	@FindBy(xpath=("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]"))
	public WebElement account_login;
	
	@FindBy(partialLinkText=("Register"))
	public WebElement register;
	
	@FindBy(name=("firstname"))
	public WebElement firstName;
	
	@FindBy(name=("lastname"))
	public WebElement lastName;
	@FindBy(name=("email"))
	public WebElement email;
	
	@FindBy(name=("telephone"))
	public WebElement tel;
	
	@FindBy(name=("password"))
	public WebElement pass;
	@FindBy(name=("confirm"))
	public WebElement conf;
	
	@FindBy(name=("agree"))
	public WebElement agree;
	
	@FindBy(xpath=("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]"))
	public WebElement button;
	
	
	public void Registration_Action(String fname,String lname,String e,String telph,String pass1,String con)
	{
		account_login.click();
		register.click();
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		email.sendKeys(e);
		pass.sendKeys(pass1);
		conf.sendKeys(con);
		tel.sendKeys(telph);
		agree.click();
		button.click();
	}
	

}
