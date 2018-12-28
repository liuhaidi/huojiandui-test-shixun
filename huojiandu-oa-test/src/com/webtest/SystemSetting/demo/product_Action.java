package com.webtest.SystemSetting.demo;

import java.io.IOException;

import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

public class product_Action {
	private WebDriverEngine webtest;
	public product_Action(WebDriverEngine webtest) {
		this.webtest=webtest;
	}
	public void login(String email,String password) throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url"));
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=登录");
	}
	public void input(String str) {
		webtest.click("id=_M58");
		webtest.click("link=产品授权");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@name='t1']");
		webtest.type("xpath=//input[@name='t1']", str);
		webtest.click("xpath=//input[@value='验证授权']");
		
	}
	public void qingkong(String str) {
		webtest.click("id=_M58");
		webtest.click("link=产品授权");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@name='t1']");
		webtest.type("xpath=//input[@name='t1']", str);
		webtest.click("xpath=//input[@value='清除屏幕']");
		
	}

}
