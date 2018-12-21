package com.webtest.office.demo;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
public class VoteTest3 extends BaseTest{
	Login_Action action;
	@BeforeMethod
	public void setup() throws IOException {
		action=new Login_Action(webtest);	
		Login_Action action =new Login_Action(webtest);
		action.login("admin", "123456");
	}
//	@Test(priority=0)
//	public void Vote1() {
//		Vote_Action vote= new Vote_Action(webtest);
//		vote.option1("03","һ��ѡ���ͶƱ","��һ��ѡ��");
//		assertTrue(webtest.ifContains("ͶƱ��Ϣ�����ɹ�"));
//	}
	@Test(priority=0)
	public void Vote2() {
		Vote_Action vote= new Vote_Action(webtest);
		vote.option1("03","��ѡ���ͶƱ","");
		assertTrue(webtest.ifContains("ѡ���Ϊ��"));
	}
	@Test(priority=1)
	public void Vote3() {
		Vote_Action vote= new Vote_Action(webtest);
		vote.option2("03","��������Ϊ���ַ���ͶƱ","��һ��ѡ��","�ڶ���ѡ��");
		assertTrue(webtest.ifContains("ͶƱ��Ϣ�����ɹ�"));
	}
}
