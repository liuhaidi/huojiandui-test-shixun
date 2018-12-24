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
