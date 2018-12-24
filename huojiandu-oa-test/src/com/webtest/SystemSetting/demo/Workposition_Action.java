package com.webtest.SystemSetting.demo;

import java.io.IOException;

import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

public class Workposition_Action {
	private WebDriverEngine webtest;
	public Workposition_Action (WebDriverEngine webtest) {
		this.webtest=webtest;
	}
	public void login(String email,String password) throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url"));
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=登录");
	}
	public void Add_top(String value) {
		webtest.click("id=_M58");
		webtest.click("link=岗位设置");
		webtest.enterFrame("rightMain");
		webtest.click("link=添加顶级岗位");
		webtest.typeAndClear("xpath=//input[@value='顶级岗位名称']", value);
		webtest.click("xpath=//input[@value='提交']");
	}
	public void Add(String value1,String value2) {
		webtest.click("id=_M58");
		webtest.click("link=岗位设置");
		webtest.enterFrame("rightMain");
		webtest.click("link=添加新部岗位");
	    webtest.typeAndClear("xpath=//input[@value='岗位名称']", value1);
	    webtest.selectByVisibleText("name=newinherited[]", value2);
	    webtest.click("xpath=//input[@value='提交']");
	    
	}
	public void Detail() {
		webtest.click("id=_M58");
		webtest.click("link=部门设置");
		webtest.enterFrame("rightMain");
		webtest.click("link=全部折叠");
	}

}
