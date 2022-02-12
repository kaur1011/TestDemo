package pages;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {

	WebDriver driver;
	By Header = By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]");
	By Login=By.partialLinkText("Login");
	By Email = By.name("email");
	By password = By.name("password");
	By Button = By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
	
	public Login_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void Header_1() {
		driver.findElement(Header).click();
	}
	
	public void ClickOnLogin() {
		
		driver.findElement(Login).click();
		}
		public void enterEmail(String arg1) {
		driver.findElement(Email).sendKeys(arg1);
		}
		public void enterPasswrod(String arg2) {
		driver.findElement(password).sendKeys(arg2);
		}
		public void ClickOnButton() {
			driver.findElement(Button).click();
			}
}
