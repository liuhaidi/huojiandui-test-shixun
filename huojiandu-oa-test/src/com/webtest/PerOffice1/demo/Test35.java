package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test35 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=34)//25
	public void jindu3() throws IOException {
	    action.login("admin","123456");
	    action.zhixingren("yuangong1", "123456");
	    action.renwuliebiao1();
	    action.jinduluru();
	    action.lurujindu("100","hdjsh");
	    action.fanhuiliebiao();
	    action.enter_ifream();
	    assertTrue(webtest.ifContains("ÒÑÍê³É"));
	}

}
