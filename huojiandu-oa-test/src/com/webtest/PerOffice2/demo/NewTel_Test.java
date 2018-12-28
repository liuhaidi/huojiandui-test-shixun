package com.webtest.PerOffice2.demo;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class NewTel_Test extends BaseTest{
@Test(priority=0)
public void test_noinfo() throws IOException, InterruptedException {
	PageAction action=new PageAction(webtest);
	action.login("admin","123456");
	action.perOffice();
	action.tel();
	action.click();
    action.newtel("", "", "", "");
    assertTrue(webtest.ifContains("公司名称不能为空"));
}

@Test(priority=1)
public void test_nocomName() throws IOException, InterruptedException {
	PageAction action=new PageAction(webtest);
    action.newtel("", "张三", "15221231230", "12222222222");
    assertTrue(webtest.ifContains("公司名称不能为空"));
}

@Test(priority=2)
public void test_noperName() throws IOException, InterruptedException {
	PageAction action=new PageAction(webtest);
    action.newtel("创想OA", "", "12222222222", "12222222222");
    assertTrue(webtest.ifContains("联系人不能为空"));
}

@Test(priority=3)
public void test_notel() throws IOException, InterruptedException {
	PageAction action=new PageAction(webtest);
    action.newtel("创想OA", "张三", "", "12222222222");
    assertTrue(webtest.ifContains("联系电话不能为空"));
}
@Test(priority=4)
public void test_nophone() throws IOException, InterruptedException {
	PageAction action=new PageAction(webtest);
    action.newtel("创想OA", "张三", "12222222222", "");
    assertTrue(webtest.ifContains("手机不能为空"));
}

@Test(priority=5)
public void test_success() throws IOException, InterruptedException {
	PageAction action=new PageAction(webtest);
    action.newtel("创想OA", "张三", "12222222222", "12222222222");
    assertTrue(webtest.ifContains("成功"));
}
@Test(priority=6)
public void test_edit() {
	PageAction action=new PageAction(webtest);
	action.edit();
	assertTrue(webtest.ifContains("未做任何改动"));
}
}
