package com.webtest.demo;

import com.webtest.core.WebDriverEngine;

public class Datacopy_Action {
	private WebDriverEngine webtest;
	public Datacopy_Action(WebDriverEngine webtest) {
		this.webtest=webtest;
	}
	public void login(String email,String password) {
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=登录");
	}
	public void copy(String name) {
		webtest.click("id=_M58");
		webtest.click("link=数据备份");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@value='"+name+"']");
		webtest.click("xpath=//input[@value='备份数据']");
		
	}
	public void restore(String name) {
		webtest.click("id=_M58");
		webtest.click("link=数据备份");
		webtest.enterFrame("rightMain");
		webtest.click("link=数据还原");
		webtest.click("xpath=//input[@value='"+name+"']");
		webtest.click("xpath=//a[contains(@href,'fn="+name+"')]");
		
	}
	public void delete(String name) {
		webtest.click("id=_M58");
		webtest.click("link=数据备份");
		webtest.enterFrame("rightMain");
		webtest.click("link=数据还原");
		webtest.click("xpath=//input[@value='"+name+"']");
		webtest.click("xpath=//input[@value='删 除']");
	}
}
