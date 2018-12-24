package com.webtest.HumanResources.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class XinJianHeTong_Test extends BaseTest{
	Login_Action action = null;
	@Test
	public void XinJianHeTong_Test() throws InterruptedException, IOException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		action.XinJianHeTong("保密合同");
		assertTrue(webtest.ifContains("已存在该合同类型"));
		
	}
}
