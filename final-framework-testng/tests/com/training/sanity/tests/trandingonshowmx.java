package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LogoutPOM;
import com.training.pom.homepagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class trandingonshowmx {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private homepagePOM HomepagePOM;
	private static Properties properties;
	private ScreenShot screenShot;

	

	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		HomepagePOM=new  homepagePOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
//	@Test(priority=0)
//	public void validLoginTest() {
//		loginPOM.sendUserName("Admin");
//		loginPOM.sendPassword("admin123");
//		loginPOM.clickLoginBtn(); 
//		screenShot.captureScreenShot("First");
//	}
	
	@Test
	
	 public void trandingonshowmxshow() {
		HomepagePOM.tradingonshowmxf();
	}
	 
}
