package com.webtest.demo;

import com.webtest.core.WebDriverEngine;

public class Data_Action {
	private WebDriverEngine webtest;
	public Data_Action(WebDriverEngine webtest) {
		this.webtest=webtest;
	}
	public void login(String email,String password) {
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=��¼");
	}
	public void select(String date,String name) {
		webtest.click("id=_M58");
		webtest.click("link=ϵͳά��");
		webtest.enterFrame("rightMain");
		webtest.click("name=vstartdate");
		webtest.remove("xpath=//input[@name='vstartdate']");
		webtest.type("xpath=//input[@name='vstartdate']", date);
		webtest.click("xpth=//input[@value='ȷ��']");
		webtest.click("xpath=//inpit[@name='venddate']");
		webtest.click("xpath=//input[@value='����']");
		webtest.click("xpath=//input[@value='ȷ��']");
		webtest.type("xpath=//input[@name='name']", name);
		webtest.click("xpath=//inpuy[@value='�� ��']");
		
	}
	

}