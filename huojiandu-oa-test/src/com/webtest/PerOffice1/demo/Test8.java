package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test8 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=7)//29Ê§°Ü
	public void jihua1() throws IOException {
		action.login("admin", "123456");
		action.jihua();
		action.enter_ifream();
		action.xiugaizhuangtai();
		assertTrue(webtest.ifContains("ÒÑÍê³É"));
	}

}
