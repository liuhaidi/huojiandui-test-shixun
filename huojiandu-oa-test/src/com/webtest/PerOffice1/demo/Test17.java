package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test17 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=16)//38
	public void duanxin1() throws IOException {
		action.login("admin", "123456");
		action.messages();
		action.enter_ifream();
		action.send("短信");
		assertTrue(webtest.ifContains("手机短信发送成功"));
	}

}