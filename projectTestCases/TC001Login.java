package projectTestCases;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Login_Page;

public class TC001Login {
	WebDriver driver;
	Login_Page l;
	@BeforeMethod
	 public void Setup() {
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
	  }
	
	
	@Test
	public void enter_user_details() {
		
        l=new Login_Page(driver);
        l.Header_1();
        l.ClickOnLogin();
        l.enterEmail("mandeepsaini151988@gmail.com");
        l.enterPasswrod("Kuldip1957@");
        l.ClickOnButton();
          
	}
	
	public void assetion()
	{
		String expected="Account Login";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
	
	}
	 
	
	@AfterMethod
	
		public void closer() {
			 driver.quit();
		  
	}
}

