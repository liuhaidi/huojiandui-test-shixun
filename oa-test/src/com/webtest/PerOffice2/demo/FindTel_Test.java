package com.webtest.PerOffice2.demo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FindTel_Test extends BaseTest{
@Test(priority=0)
public void test_findbykey() throws IOException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.tel();
	action.findtel("管理员", "");
}
@Test(priority=1)
public void test_findall() {
	PageAction action=new PageAction(webtest);
	action.findtel("","");
}
@Test(priority=2)
public void test_findbysex() {
	PageAction action=new PageAction(webtest);
	action.findtel("男", "");
}
@Test(priority=3)
public void test_findbyvalue() {
	PageAction action=new PageAction(webtest);
	action.findtel("", "company");
}
@Test(priority=4)
public void test_findbyfailed() {
	PageAction action=new PageAction(webtest);
	action.findtel("张三", "fax");
}
@Test(priority=5)
public void test_success() {
	PageAction action=new PageAction(webtest);
	action.findtel("创想OA", "company");
}
}
