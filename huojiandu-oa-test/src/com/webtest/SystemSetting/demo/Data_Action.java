package com.webtest.SystemSetting.demo;

import java.io.IOException;

import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

public class Data_Action {
	private WebDriverEngine webtest;
	public Data_Action(WebDriverEngine webtest) {
		this.webtest=webtest;
	}
	public void login(String email,String password) throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url"));
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=登录");
	}
	public void select(String name) {
		webtest.click("id=_M58");
		webtest.click("link=系统维护");
		webtest.enterFrame("rightMain");
		webtest.click("name=vstartdate");
		webtest.click("xpth=//input[@value='确定']");
		webtest.click("xpath=//inpit[@name='venddate']");
		webtest.click("xpath=//input[@value='今天']");
		webtest.click("xpath=//input[@value='确定']");
		webtest.type("xpath=//input[@name='name']", name);
		webtest.click("xpath=//inpuy[@value='搜 索']");
		
	}
	

}
