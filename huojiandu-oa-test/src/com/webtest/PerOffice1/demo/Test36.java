package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test36 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=35)//775（失败）
	public void jindu4() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081159","任务3", "2018-12-06", "2018-12-06", "ad");//时间为未开始
	    action.leave_ifream();
	    action.zhixingren("yuangong1", "123456");
	    action.renwuliebiao3();
	    action.jinduluru();
	    assertFalse(webtest.ifContains("录入进度"));
	}

}
