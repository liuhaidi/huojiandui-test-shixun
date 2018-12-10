package com.webtest.PerOffice2.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

public class PageAction {
	WebDriverEngine webtest=null;
	public PageAction (WebDriverEngine webtest) {
		this.webtest=webtest;
	}
	
//  登录	
    public void login(String username,String password) throws IOException {
       webtest.open(ReadProperties.getPropertyValue("base_url"));
 	   webtest.type("name=username", username);
 	   webtest.type("name=password", password);
 	   webtest.click("link=登录");
    }
//  个人办公
    public void perOffice() {
    	webtest.click("link=个人办公");
    }
//  通讯录  
    public void tel() {
    	webtest.click("link=通迅录");
    	webtest.enterFrame("rightMain");
    }
//  通讯录全选框
	public void checkBox() {
		webtest.click("xpath=/html/body/form/div/div/div[2]/table/tbody/tr[3]/td[1]/input[1]");
	}
//	通讯录查询
	public void findtel(String keyword,String value) {
		webtest.typeAndClear("name=keyword", keyword);
		webtest.selectByValue("name=ttype", value);
		webtest.click("id=do_search");
	}
//	新增通讯录
	public void click() {
		webtest.click("xpath=/html/body/div[3]/div/div[1]/button[1]");
	}
	public void newtel(String comName,String perName,String tel,String phone) throws InterruptedException {
		webtest.click("name=company");
		webtest.typeAndClear("name=company", comName);
		Thread.sleep(2000);
		webtest.typeAndClear("name=person", perName);
		Thread.sleep(2000);
		webtest.typeAndClear("name=tel", tel);
		Thread.sleep(2000);
		webtest.typeAndClear("name=phone", phone);
		Thread.sleep(2000);
		webtest.click("name=Submit");
	}
	public void edit() {
		webtest.click("link=编辑");
		webtest.click("name=Submit");
	}
//  发送短信
	public void sendMessage(String content) throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div/div[1]/button[2]");
		webtest.type("name=content", content);
		webtest.click("class=BigButton");
		Thread.sleep(2000);
	}
//  短消息
	public void shortMessage() {
		webtest.click("link=短消息");
		webtest.enterFrame("rightMain");
		webtest.click("name=chkall");
		webtest.click("xpath=//button[@class='btn btn-info'and @type='button']");
	}
//	清理手机短信
	public void telMessage() {
		webtest.click("link=手机短信");
		webtest.enterFrame("rightMain");
	}
	public void del() {
		webtest.click("name=chkall");
		webtest.click("xpath=/html/body/div[1]/div/div[1]/button[3]");
	}
	public void nodel() {
		webtest.click("xpath=/html/body/div[1]/div/div[1]/button[3]");
	}
//	公告
	public void notice() {
		webtest.click("link=公告");
		webtest.enterFrame("rightMain");
		webtest.click("link=+阅读");
	}
//	工作日志
	public void workLog() {
		webtest.click("link=工作日志");
		webtest.enterFrame("rightMain");
	}
//  新增工作日志
	public void newworkLog(String contents) {		
		webtest.click("link=新增日志");
	    webtest.click("class=ke-iframe");
	    webtest.type("class=ke-iframe", contents);
	    webtest.click("class=BigButtonBHover");
	}
//	浏览工作日志
	public Boolean readworklog() {
		webtest.click("link=管理员[] 2018-12-04 工作日志");
		String first=webtest.getText("xpath=/html/body/table/tbody/tr/td/span/span/span");
		webtest.click("link=返回列表页");
		webtest.click("link=管理员[] 2018-12-04 工作日志");
		String second=webtest.getText("xpath=/html/body/table/tbody/tr/td/span/span/span");
	    if (first==second) {
	    	System.out.println("错误");
	    	return false;}
	    else {
	    	System.out.println("第一次："+first+"第二次："+second);
	    	return true;
	    }
	}
//	发布工作日志评论浏览次数增加
	public Boolean comment(String content) throws InterruptedException {
		webtest.click("link=管理员[] 2018-12-04 工作日志");
		webtest.click("class=ke-iframe");
		String first=webtest.getText("xpath=/html/body/table/tbody/tr/td/span/span/span");
		webtest.type("class=ke-iframe", content);
		webtest.click("class=BigButtonBHover");
		assertTrue(webtest.ifContains("评论发布成功"));
		Thread.sleep(3000);
		String second=webtest.getText("xpath=/html/body/table/tbody/tr/td/span/span/span");
		if (first==second) {
	    	System.out.println("错误");
	    	return false;}
	    else {
	    	System.out.println("第一次："+first+"第二次："+second);
	    	return true;
	    }
	}
//	评论不得超过68字
	public void limit(String content) {
		webtest.click("link=管理员[] 2018-12-04 工作日志");
		webtest.click("class=ke-iframe");
		webtest.type("class=ke-iframe", content);
		webtest.click("class=BigButtonBHover");
	}
//	通知查询
	public void clickinform() {
		webtest.click("link=通知");
		webtest.enterFrame("rightMain");
	}
	public void inform(String data1,String data2) {
		
		webtest.click("xpath=/html/body/div[1]/form/div/input[2]");
		webtest.type("xpath=/html/body/div[1]/form/div/input[2]", data1);
		webtest.click("xpath=/html/body/div[1]/form/div/input[3]");
		webtest.type("xpath=/html/body/div[1]/form/div/input[3]", data2);
		webtest.click("id=do_search");
	}
//	个人设置——个人系统日志(删除)
	public void perlog() {
		webtest.click("link=个人系统日志");
	    webtest.enterFrame("right");
	    webtest.click("name=chkall");
	    webtest.click("link=删除数据");
	}
//	个人设置——密码修改
	public void perpwd() {
		webtest.click("link=密码修改");
		webtest.enterFrame("right");
	}
	public void setpwd(String oldpwd,String newpwd1,String newpwd2) {
		webtest.typeAndClear("name=oldpassword", oldpwd);
		webtest.typeAndClear("name=password", newpwd1);
		webtest.typeAndClear("name=ppassword", newpwd2);
		webtest.click("class=BigButtonBHover");
		
	}
//	个人设置——个人信息
	public void perinform(String phone,String content,String address) {
		webtest.click("link=个人信息");
		webtest.enterFrame("right");
		webtest.typeAndClear("name=phone", phone);
		webtest.typeAndClear("name=contact", content);
		webtest.typeAndClear("name=address", address);
	}
}

