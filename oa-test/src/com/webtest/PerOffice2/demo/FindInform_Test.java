package com.edu.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;
import com.edu.pageObjects.PageAction;

public class FindInform_Test extends BaseTest{
@Test(priority=0)
public void test_findbyright() throws IOException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.clickinform();
	action.inform("", "2018-12-12");
}
@Test(priority=1)
public void test_findbyleft() throws IOException {
	PageAction action=new PageAction(webtest);
	
	action.inform("2018-12-12", "");
}
@Test(priority=2)
public void test_findbyfailed() throws IOException {
	PageAction action=new PageAction(webtest);
	
	action.inform("2018-12-12", "2018-12-1");
}
@Test(priority=3)
public void test_findbysame() throws IOException {
	PageAction action=new PageAction(webtest);
	
	action.inform("2018-12-12", "2018-12-12");
}
@Test(priority=4)
public void test_findsuccess() throws IOException {
	PageAction action=new PageAction(webtest);
	
	action.inform("2018-12-1", "2018-12-6");
}
}
