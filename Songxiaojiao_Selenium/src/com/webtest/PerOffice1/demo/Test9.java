package com.webtest.PerOffice1.demo;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test9 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=8)//30
	public void jihua2() throws IOException {
		action.login("admin", "123456");
		action.jihua();
		action.enter_ifream();
		action.jihuazhuangtai();

	}

}