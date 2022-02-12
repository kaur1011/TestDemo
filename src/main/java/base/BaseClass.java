package base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import com.mongodb.diagnostics.logging.Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Utilities.ExtentManager;
import pages.Add_to_Cart_Page;
import pages.Login_Page;
import pages.PurchaseGiftCertificate_Page;
import pages.Registration_page;
import java.util.logging.*;


public class BaseClass {
	public static WebDriver driver=null;
	Add_to_Cart_Page ac;
	Login_Page l;
	PurchaseGiftCertificate_Page pgc;
	Registration_page r;
	ExtentReports er=ExtentManager.getInstance();
	public static ExtentTest test;
	//public static Logger app_logs = (Logger) org.apache.log4j.Logger.getLogger("qaLogger");
	
	public static Properties config = new Properties();

@BeforeSuite
public void beforeMethod() {
	er = new ExtentReports("C:\\Users\\mande\\eclipse-workspace\\TestDemo\\target\\surefire-reports\\extentreports1.html");
    test=er.startTest("Start Test");

	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
	driver = new ChromeDriver();
	//app_logs.debug("lodding start");
	ac=PageFactory.initElements(driver, Add_to_Cart_Page.class);
	l=PageFactory.initElements(driver, Login_Page.class);
	pgc=PageFactory.initElements(driver, PurchaseGiftCertificate_Page.class);
	r=PageFactory.initElements(driver, Registration_page.class);
	
	test.log(LogStatus.INFO, "intializing website");
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}
@AfterSuite
public void closer() {
	er.endTest(test);
	er.flush();
}
}




