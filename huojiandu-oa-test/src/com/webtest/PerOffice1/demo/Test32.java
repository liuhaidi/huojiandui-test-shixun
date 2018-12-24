package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test32 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=31)//27
	public void chakanrenwu4() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.chaxunrenwu("", "任务", "", "");
	    assertTrue(webtest.ifContains("任务2"));
	}

}