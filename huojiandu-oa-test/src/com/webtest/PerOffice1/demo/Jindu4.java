package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Jindu4 extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test//775��ʧ�ܣ�
	public void jindu4() throws IOException {
	    action.login("admin","123456");
	    action.renwuguanli();
	    action.enter_ifream();
	    action.xinjianrenwu("20181205081159","����3", "2018-12-30", "2018-12-30", "ad");//ʱ��Ϊδ��ʼ
	    action.leave_ifream();
	    action.zhixingren("yuangong1", "123456");
	    action.renwuliebiao3();
	    action.jinduluru();
	    assertFalse(webtest.ifContains("¼�����"));
	}

}
