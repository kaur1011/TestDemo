package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseClass;

public class ProjectScreenShot extends BaseClass{
	
		
		public static void getScreenshot() throws IOException {
			// coding for taking screenshot using in listner.java
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // driver is from BaseClass
		    Date d=new Date();
			String screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
			FileUtils.copyFile(scrFile,new File("C:\\Users\\mande\\eclipse-workspace\\TestDemo\\target\\surefire-reports" + screenshotName));
			//return screenshotName;

		}
	}



