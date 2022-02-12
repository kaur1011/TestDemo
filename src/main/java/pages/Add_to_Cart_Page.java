package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Add_to_Cart_Page  extends BasePage{

	public Add_to_Cart_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	@FindBy(xpath=("//body/div[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]"))
	public WebElement clickPhonePads;
	
	@FindBy(xpath=(" //*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[1]"))
	public WebElement Add;
	
	public void click() {
		clickPhonePads.click();
	}
	public void add_Cart() {
		
		Add.click();
	}
	

}
