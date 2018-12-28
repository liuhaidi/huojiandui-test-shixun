package com.webtest.SystemSetting.demo;

import java.io.IOException;

import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

public class Menu_Action {
	private WebDriverEngine webtest;
	public Menu_Action(WebDriverEngine webtest) {
		this.webtest=webtest;
	}
	public void login(String email,String password) throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url"));
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
