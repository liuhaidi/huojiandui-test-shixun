package com.webtest.demo;

import com.webtest.core.WebDriverEngine;

public class product_Action {
	private WebDriverEngine webtest;
	public product_Action(WebDriverEngine webtest) {
		this.webtest=webtest;
	}
	public void login(String email,String password) {
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=��¼");
	}
	public void input(String str) {
		webtest.click("id=_M58");
		webtest.click("link=��Ʒ��Ȩ");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@name='t1']");
		webtest.type("xpath=//input[@name='t1']", str);
		webtest.click("xpath=//input[@value='��֤��Ȩ']");
		
	}
	public void qingkong(String str) {
		webtest.click("id=_M58");
		webtest.click("link=��Ʒ��Ȩ");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@name='t1']");
		webtest.type("xpath=//input[@name='t1']", str);
		webtest.click("xpath=//input[@value='�����Ļ']");
		
	}

}
