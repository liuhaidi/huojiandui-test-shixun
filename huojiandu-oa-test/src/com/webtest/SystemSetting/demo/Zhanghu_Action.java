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
		webtest.click("link=��¼");
	}
	public void add(String username,String pwd,String name) throws InterruptedException {
		webtest.click("id=_M58");
		webtest.click("link=�˻�����");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@value='�����˺�']");
		webtest.type("xpath=//input[@name='username']",username );
		webtest.type("xpath=//input[@name='password']",pwd );
		webtest.click("link=ѡ���λ");
		System.out.println(webtest.getWindowSize());
		webtest.getWindow(1);
		webtest.click("xpath=//input[@value='1']");
		webtest.click("xpath=//input[@value='ȷ�ϲ��ύ']");
		webtest.getWindow(0);
		webtest.click("link=ѡ����");
		webtest.getWindow(1);
		webtest.click("xpath=//input[@value='3']");
		webtest.click("xpath=//input[@value='ȷ�ϲ��ύ']");
		webtest.getWindow(0);
		webtest.type("xpath=//input[@name='name']", name);
		webtest.click("xpath=//input[@value='����']");

	}
	public void select(String username,String name,String value,String value1) throws InterruptedException {
		webtest.click("id=_M58");
		webtest.click("link=�˻�����");
		webtest.enterFrame("rightMain");
		webtest.type("xpath=//input[@name='username']", username);
		webtest.type("xpath=//input[@name='name']", name);
		Thread.sleep(3000);
		webtest.selectByVisibleText("name=department", value);
		webtest.selectByVisibleText("name=usergroup", value1);
		webtest.click("xpath=//input[@value='�� ��']");
		webtest.leaveFrame();
	}
	
	public void intMessage(String adress) {
		webtest.click("id=_M58");
		webtest.click("link=�˻�����");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@value='��������']");
		webtest.type("xpath=//input[@name='address']",adress);
		webtest.click("xpath=//input[@value='��������']");
	}
	
	

}
