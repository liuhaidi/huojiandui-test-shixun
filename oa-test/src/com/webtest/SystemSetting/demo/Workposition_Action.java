package com.webtest.demo;

import com.webtest.core.WebDriverEngine;

public class Workposition_Action {
	private WebDriverEngine webtest;
	public Workposition_Action (WebDriverEngine webtest) {
		this.webtest=webtest;
	}
	public void login(String email,String password) {
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=��¼");
	}
	public void Add_top(String value) {
		webtest.click("id=_M58");
		webtest.click("link=��λ����");
		webtest.enterFrame("rightMain");
		webtest.click("link=��Ӷ�����λ");
		webtest.typeAndClear("xpath=//input[@value='������λ����']", value);
		webtest.click("xpath=//input[@value='�ύ']");
	}
	public void Add(String value1,String value2) {
		webtest.click("id=_M58");
		webtest.click("link=��λ����");
		webtest.enterFrame("rightMain");
		webtest.click("link=����²���λ");
	    webtest.typeAndClear("xpath=//input[@value='��λ����']", value1);
	    webtest.selectByVisibleText("name=newinherited[]", value2);
	    webtest.click("xpath=//input[@value='�ύ']");
	    
	}
	public void Detail() {
		webtest.click("id=_M58");
		webtest.click("link=��������");
		webtest.enterFrame("rightMain");
		webtest.click("link=ȫ���۵�");
	}

}
