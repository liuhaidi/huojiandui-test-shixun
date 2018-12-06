package com.edu.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;
import com.edu.pageObjects.PageAction;

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
