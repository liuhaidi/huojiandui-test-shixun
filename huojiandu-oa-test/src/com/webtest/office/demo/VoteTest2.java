package com.webtest.office.demo;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
public class VoteTest2 extends BaseTest {
	Login_Action action;
	@BeforeMethod
	public void setup() throws IOException {
		action=new Login_Action(webtest);	
		Login_Action action =new Login_Action(webtest);
		action.login("admin", "123456");
	}
	@Test(priority=0)
	public void Vote1() { 
		Vote_Action vote= new Vote_Action(webtest);
		vote.content("02","。","及匯倖僉��");
		assertTrue(webtest.ifContains("誘同佚連荷恬撹孔"));
	}
	@Test(priority=1)
	public void Vote2() {
		Vote_Action vote= new Vote_Action(webtest);
		vote.content("02","。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"
				+ "。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。","及匯倖僉��");
		assertTrue(webtest.ifContains("誘同佚連荷恬撹孔"));
	}
	@Test(priority=2)
	public void Vote3() {
		Vote_Action vote= new Vote_Action(webtest);
		vote.content("02","","及匯倖僉��");
		assertTrue(webtest.ifContains("誘同佚連荷恬撹孔"));
	}
}
