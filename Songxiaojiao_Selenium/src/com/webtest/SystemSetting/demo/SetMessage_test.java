package com.webtest.SystemSetting.demo;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;


public class SetMessage_test extends BaseTest{
	SetMessage_action action;

	
	@BeforeMethod
	public void setup() {
		action=new SetMessage_action(webtest);
		
	}
	@Test
	public void Set() throws IOException {
		action.login("admin", "123456");
		action.setMessage("��������OAЭͬ�칫���","30");
	}

	
	
	

}
