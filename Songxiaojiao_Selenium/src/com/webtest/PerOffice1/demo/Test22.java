package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test22 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=21)//748失败
	public void xinjianrenwu1() throws IOException {
		Action action =new Action(webtest);
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205141413","任务", "2018-12-07", "2018-12-06", "描述");
	    assertTrue(webtest.ifContains("时间非法"));
	}

}
