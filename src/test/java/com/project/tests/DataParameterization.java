package com.project.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.project.GenericMethods.ScreenShot;
import com.project.Pom.LoginPOM;
import com.project.util.Driver;
import com.project.util.DriverFactory;
import com.project.util.DriverNames;

public class DataParameterization {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	public String baseurl ="http://www.google.com";
	
	@Parameters({"Browser"})
	@Test(enabled=true)
	public void setUp(String Browser) throws Exception {
		
		System.out.println("Browser is ==>" + Browser);
		
		if ( Browser.equalsIgnoreCase("CHROME"))
		{
			System.setProperty(Driver.CHROME, "./resources/chromedriver.exe");
			
			driver = new ChromeDriver();
					
			
			driver.get(baseurl);
			
			driver.getTitle();
		}
		
		else if ( Browser.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty(Driver.FIREFOX, "./resources/geckodriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get(baseurl);
			
			driver.getTitle();
		}
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
}
