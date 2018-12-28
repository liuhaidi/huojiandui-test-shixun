package com.webtest.HumanResources.demo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class LeiXingChaXun_Test extends BaseTest{
	Login_Action action = null;

	@Test
	public void LeiXingChaXun_Test() throws InterruptedException, IOException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		action.LeiXingChaXun("ÆäËü");
		
	}

}
