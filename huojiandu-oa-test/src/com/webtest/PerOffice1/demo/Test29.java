package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test29 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=28)//986
	public void xinjianrenwu9() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081151","任务1", "2018-12-05", "2018-12-05", "");
	    assertTrue(webtest.ifContains("不能为空"));
	}

}
