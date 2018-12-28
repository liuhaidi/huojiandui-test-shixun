package com.api.core;

import org.openqa.selenium.WebDriver;
import org.testng.TestListenerAdapter;

import com.api.core.BaseTest;
import com.api.core.SeleniumScreenShot;
import com.api.core.Log;
import org.testng.ITestResult;

public class ApiListener extends TestListenerAdapter{
	@Override
	public void onTestFailure(ITestResult tr) {
		Log.error(tr.getInstance()+"-"+tr.getName()+"运行失败，需要截屏");
		BaseTest tb = (BaseTest) tr.getInstance();
        WebDriver driver = tb.getDriver();    
		SeleniumScreenShot ss = new SeleniumScreenShot(driver);
		ss.screenShot();
	}

}
