package com.webtest.HumanResources.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FaBuJiangCheng_Test extends BaseTest{
	Login_Action action = null;
	@Test
	public void FaBuJiangCheng_Test() throws InterruptedException, IOException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		action.FaBuJiangCheng("68","2018", "12","2018-11-01", "100");
		assertTrue(webtest.ifContains("单位员工不能为空"));
		
	}
}
