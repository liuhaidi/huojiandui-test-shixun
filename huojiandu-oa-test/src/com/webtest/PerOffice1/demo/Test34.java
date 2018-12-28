package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test34 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test(priority=33)//23
	public void jindu1() throws IOException {
	    action.login("admin","123456");
	    action.zhixingren("yuangong1", "123456");
	    action.renwuliebiao1();
	    action.jinduluru();
	    action.lurujindu("50","hdjsh");
	    assertTrue(webtest.ifContains("任务进度信息操作成功"));
	    
	}

}
