package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test11 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=10)//32（失败）
	public void jihua4() throws IOException {
		action.login("admin", "123456");
		action.jihua();
		action.enter_ifream();
		action.jihuapinglun("");
		assertTrue(webtest.ifContains("评论内容不能为空"));
	}

}
