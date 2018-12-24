package com.webtest.HumanResources.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CaiDanTongBu_Test  extends BaseTest{
	Login_Action action = null;
	@Test
	public void CaiDanTongBu_Test() throws InterruptedException, IOException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		action.CaiDanTongBu();
		assertTrue(webtest.ifContains("ºá×ÝÍ¬²½"));
		
	}
}
