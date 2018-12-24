package com.webtest.HumanResources.demo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class BianHaoChaXun_Test extends BaseTest{
	Login_Action action = null;
	
	@Test
	public void BianHaoChaXun_Test() throws IOException, InterruptedException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		action.BianHaoChaXun("20181127085529");
	}
}
