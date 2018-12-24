package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Jihua3 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test//31
	public void jihua3() throws IOException {
		action.login("admin", "123456");
		action.jihua();
		action.enter_ifream();
		action.jihuapinglun("评论");
		assertTrue(webtest.ifContains("评论发布成功"));
	}

}
