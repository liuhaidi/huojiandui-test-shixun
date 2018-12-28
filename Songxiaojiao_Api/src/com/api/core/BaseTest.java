package com.api.core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	public DbHelper db ;
	public WebDriver driver;
	@BeforeMethod
	public void setUp()	throws Exception {
		db=DbHelper.getInstance();
		
  }
	public WebDriver getDriver() {
        return driver;
    }

	@AfterMethod
	public void tearDown() throws Exception {
		
		db.close();
	}

}
