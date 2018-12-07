package com.webtest.SystemSetting.demo;



import java.io.IOException;

import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

public class QuanXianSet_action {
	private WebDriverEngine webtest;
	public QuanXianSet_action(WebDriverEngine webtest) {
		this.webtest=webtest;
	}
	
	public void login(String email,String password) throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url"));
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=登录");
	}
	public void New(String usename) throws InterruptedException {
		webtest.click("id=_M58");
		webtest.click("link=权限设置");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@value='新增权限组']");
		Thread.sleep(2000);
		webtest.type("name=groupname", usename);
		webtest.click("xpath=//input[@value='保存']");
		
	}
	public void GengZheng(String name) throws InterruptedException {
		webtest.click("id=_M58");
		webtest.click("link=权限设置");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//a[contains(@href,'id=3')]");
		webtest.leaveFrame();
		webtest.enterFrame("rightMain");
		webtest.typeAndClear("name=groupname", name);
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value='保存']");
		
	}
	
	public void Delete() throws InterruptedException {
		webtest.click("id=_M58");
		webtest.click("link=权限设置");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//table[id='tradeRecordsIndex']//tbody//tr[4]//td[class='checkbox']");
		Thread.sleep(3000);
		webtest.click("link=删除数据");
		webtest.leaveFrame();
	}
	public void ALLdelete() {
		webtest.click("id=_M58");
		webtest.click("link=权限设置");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@value='1'][@name='chkall']");
		webtest.click("link=删除数据");
		webtest.leaveFrame();
	}
		
}

