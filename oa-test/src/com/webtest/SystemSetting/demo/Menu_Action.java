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
		webtest.click("link=登录");
	}
	public void add_menu(String name,String adress,String value) {
		webtest.click("id=_M58");
		webtest.click("link=菜单设置");
		webtest.enterFrame("rightMain");
		webtest.click("link=添加新菜单");
		webtest.typeAndClear("xpath=//input[@value='菜单名称']", name);
		webtest.type("xpath=//input[@value='URL地址']", value);
		webtest.selectByVisibleText("name=newinherited[]", value);
		webtest.click("xpath=//input[@value='提交']");
	}


}
