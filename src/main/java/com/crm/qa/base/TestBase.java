package com.crm.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase () {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream (System.getProperty("user.dir")+ "C:\\Users\\Dhanu\\Documents\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config");
			prop.load(ip);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	@BeforeSuite
	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/Dhanu/Documents/eclipse-workspace/FreeCRMTest ");
			driver = new ChromeDriver();
		}
		else if(browsername.contentEquals("FF")){
			//System.setProperty("webdriver./.driver", value);
			//driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	@AfterSuite
	public void close() {
		TestBase.driver.quit();
}
}