package com.webtest.PerOffice2.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class PerPwd_Test extends BaseTest{
@Test
public void test_failed1() throws IOException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
    action.perpwd("123456", "123456", "123456");
    assertTrue(webtest.ifContains("新旧密码不能相同"));
}
@Test
public void test_failed2() throws IOException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.perpwd("123456", "123452", "223456");
	assertTrue(webtest.ifContains("两次输入的密码不一致"));
}

}
