package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test37 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=36)//254
	public void jindu5() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081160","任务4", "2018-12-06", "2018-12-06", "ad");//超过时间
	    action.leave_ifream();
	    action.zhixingren("yuangong1", "123456");
	    action.renwuliebiao4();
	    action.jinduluru();
	    assertFalse(webtest.ifContains("录入进度"));
	}

}