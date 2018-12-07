package com.webtest.SystemSetting.demo;

import java.io.IOException;

import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

public class Zhanghu_Action {
	private WebDriverEngine webtest;
	public Zhanghu_Action(WebDriverEngine webtest) {
		this.webtest=webtest;
	}
	public void login(String email,String password) throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url"));
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=登录");
	}
	public void add(String username,String pwd,String name) throws InterruptedException {
		webtest.click("id=_M58");
		webtest.click("link=账户设置");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@value='新增账号']");
		webtest.type("xpath=//input[@name='username']",username );
		webtest.type("xpath=//input[@name='password']",pwd );
		webtest.click("link=选择岗位");
		System.out.println(webtest.getWindowSize());
		webtest.getWindow(1);
		webtest.click("xpath=//input[@value='1']");
		webtest.click("xpath=//input[@value='确认并提交']");
		webtest.getWindow(0);
		webtest.click("link=选择部门");
		webtest.getWindow(1);
		webtest.click("xpath=//input[@value='3']");
		webtest.click("xpath=//input[@value='确认并提交']");
		webtest.getWindow(0);
		webtest.type("xpath=//input[@name='name']", name);
		webtest.click("xpath=//input[@value='保存']");

	}
	public void select(String username,String name,String value,String value1) throws InterruptedException {
		webtest.click("id=_M58");
		webtest.click("link=账户设置");
		webtest.enterFrame("rightMain");
		webtest.type("xpath=//input[@name='username']", username);
		webtest.type("xpath=//input[@name='name']", name);
		Thread.sleep(3000);
		webtest.selectByVisibleText("name=department", value);
		webtest.selectByVisibleText("name=usergroup", value1);
		webtest.click("xpath=//input[@value='查 找']");
		webtest.leaveFrame();
	}
	
	public void intMessage(String adress) {
		webtest.click("id=_M58");
		webtest.click("link=账户设置");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@value='导入数据']");
		webtest.type("xpath=//input[@name='address']",adress);
		webtest.click("xpath=//input[@value='导入数据']");
	}
	
	

}
