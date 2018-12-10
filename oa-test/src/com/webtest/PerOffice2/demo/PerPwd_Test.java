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
	action.perpwd();
    action.setpwd("123456", "123456", "123456");
    assertTrue(webtest.ifContains("�¾����벻����ͬ"));
}
@Test
public void test_failed2() throws IOException {
	PageAction action=new PageAction(webtest);
//	action.login("admin","123456");
//	action.perOffice();
	action.setpwd("123456", "123452", "223456");
	assertTrue(webtest.ifContains("������������벻һ��"));
}
@Test
public void test_failed3() throws IOException {
	PageAction action=new PageAction(webtest);
//	action.login("admin","123456");
//	action.perOffice();
	action.setpwd("223456", "123456", "123456");
	assertTrue(webtest.ifContains("����ľ����벻ƥ��"));
}
@Test
public void test_failed4() throws IOException {
	PageAction action=new PageAction(webtest);
//	action.login("admin","123456");
//	action.perOffice();
	action.setpwd("123456", "1", "1");
	assertTrue(webtest.ifContains("���볤���������λ"));
}
@Test
public void test_failed5() throws IOException {
	PageAction action=new PageAction(webtest);
//	action.login("admin","123456");
//	action.perOffice();
	action.setpwd("123456", "123 ", "123 ");
	assertTrue(webtest.ifContains("���ɺ��зǷ��ַ�"));
}

}
