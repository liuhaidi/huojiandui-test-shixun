package com.webtest.PerOffice2.demo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Comment_Test extends BaseTest{
	@Test
	public void testComment() throws IOException, InterruptedException {
		PageAction action=new PageAction(webtest);
		action.login("admin", "123456");
		action.perOffice();
		action.workLog();
		action.comment("’‚ «∆¿¬€");
	}
}
