package com.webtest.demo;

import com.webtest.core.WebDriverEngine;

public class commanage_Action {
	private WebDriverEngine webtest;
	public commanage_Action(WebDriverEngine webtest) {
		this.webtest=webtest;
	}
	public void login(String email,String password) {
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=��¼");
	}
	public void install(int n) {
		webtest.click("id=_M58");
		webtest.click("link=�������");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//a[contains(@href,'pid="+n+"')][@type='1']");
		webtest.click("xpath=//input[@value='��ʼ��װ']");
	}
	public void uninstall(int n) {
		webtest.click("id=_M58");
		webtest.click("link=�������");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//a[contains(@href,'pid="+n+"')][@type='2']");
		webtest.click("xpath=//input[@value='��ʼж��']");
	}
	
}
