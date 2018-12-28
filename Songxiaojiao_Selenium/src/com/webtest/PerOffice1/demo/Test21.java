package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test21 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=20)//42失败
	public void qingchu() throws IOException {
		action.login("admin", "123456");
		action.huiyi();
		action.enter_ifream();
		action.clear();
		assertTrue(webtest.ifContains("未选中数据"));
	}

}
