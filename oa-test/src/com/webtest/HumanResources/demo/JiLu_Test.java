package com.webtest.HumanResources.demo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class JiLu_Test extends BaseTest{
	Login_Action action = null;

	@Test
	public void JiLu_Test() throws IOException {
		action=new Login_Action(webtest);
		action.login("admin", "123456");
		action.JiLu("ÄÚ²¿ÅàÑµ");
		
	}
}
