package com.webtest.demo;

import com.webtest.core.WebDriverEngine;

public class Menu_Action {
	private WebDriverEngine webtest;
	public Menu_Action(WebDriverEngine webtest) {
		this.webtest=webtest;
	}
	public void login(String email,String password) {
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=��¼");
	}
	public void add_menu(String name,String adress,String value) {
		webtest.click("id=_M58");
		webtest.click("link=�˵�����");
		webtest.enterFrame("rightMain");
		webtest.click("link=����²˵�");
		webtest.typeAndClear("xpath=//input[@value='�˵�����']", name);
		webtest.type("xpath=//input[@value='URL��ַ']", value);
		webtest.selectByVisibleText("name=newinherited[]", value);
		webtest.click("xpath=//input[@value='�ύ']");
	}


}
