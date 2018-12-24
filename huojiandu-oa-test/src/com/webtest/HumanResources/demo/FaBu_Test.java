package com.webtest.HumanResources.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FaBu_Test extends BaseTest{
	Login_Action action = null;
	@Test
	public void FaBu_Test() throws InterruptedException, IOException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		action.FaBu("2018-11-21", "2018-11-30", "5", "2018-12-01", "1", "2018-12-30");
		assertTrue(webtest.ifContains("单位员工不能为空"));
	}
}
