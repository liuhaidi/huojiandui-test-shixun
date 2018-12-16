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
	
//  ��¼	
    public void login(String username,String password) throws IOException {
       webtest.open(ReadProperties.getPropertyValue("base_url"));
 	   webtest.type("name=username", username);
 	   webtest.type("name=password", password);
 	   webtest.click("link=��¼");
    }
//  ���˰칫
    public void perOffice() {
    	webtest.click("link=���˰칫");
    }
//  ͨѶ¼  
    public void tel() {
    	webtest.click("link=ͨѸ¼");
    	webtest.enterFrame("rightMain");
    }
//  ͨѶ¼ȫѡ��
	public void checkBox() {
		webtest.click("xpath=/html/body/form/div/div/div[2]/table/tbody/tr[3]/td[1]/input[1]");
	}
//	ͨѶ¼��ѯ
	public void findtel(String keyword,String value) {
		webtest.typeAndClear("name=keyword", keyword);
		webtest.selectByValue("name=ttype", value);
		webtest.click("id=do_search");
	}
//	����ͨѶ¼
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
		webtest.click("link=�༭");
		webtest.click("name=Submit");
	}
//  ���Ͷ���
	public void sendMessage(String content) throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div/div[1]/button[2]");
		webtest.type("name=content", content);
		webtest.click("class=BigButton");
		Thread.sleep(2000);
	}
//  ����Ϣ
	public void shortMessage() {
		webtest.click("link=����Ϣ");
		webtest.enterFrame("rightMain");
		webtest.click("name=chkall");
		webtest.click("xpath=//button[@class='btn btn-info'and @type='button']");
	}
//	�����ֻ�����
	public void telMessage() {
		webtest.click("link=�ֻ�����");
		webtest.enterFrame("rightMain");
	}
	public void del() {
		webtest.click("name=chkall");
		webtest.click("xpath=/html/body/div[1]/div/div[1]/button[3]");
	}
	public void nodel() {
		webtest.click("xpath=/html/body/div[1]/div/div[1]/button[3]");
	}
//	����
	public void notice() {
		webtest.click("link=����");
		webtest.enterFrame("rightMain");
		webtest.click("link=+�Ķ�");
	}
//	������־
	public void workLog() {
		webtest.click("link=������־");
		webtest.enterFrame("rightMain");
	}
//  ����������־
	public void newworkLog(String contents) {		
		webtest.click("link=������־");
	    webtest.click("class=ke-iframe");
	    webtest.type("class=ke-iframe", contents);
	    webtest.click("class=BigButtonBHover");
	}
//	���������־
	public Boolean readworklog() {
		webtest.click("link=����Ա[] 2018-12-04 ������־");
		String first=webtest.getText("xpath=/html/body/table/tbody/tr/td/span/span/span");
		webtest.click("link=�����б�ҳ");
		webtest.click("link=����Ա[] 2018-12-04 ������־");
		String second=webtest.getText("xpath=/html/body/table/tbody/tr/td/span/span/span");
	    if (first==second) {
	    	System.out.println("����");
	    	return false;}
	    else {
	    	System.out.println("��һ�Σ�"+first+"�ڶ��Σ�"+second);
	    	return true;
	    }
	}
//	����������־���������������
	public Boolean comment(String content) throws InterruptedException {
		webtest.click("link=����Ա[] 2018-12-04 ������־");
		webtest.click("class=ke-iframe");
		String first=webtest.getText("xpath=/html/body/table/tbody/tr/td/span/span/span");
		webtest.type("class=ke-iframe", content);
		webtest.click("class=BigButtonBHover");
		assertTrue(webtest.ifContains("���۷����ɹ�"));
		Thread.sleep(3000);
		String second=webtest.getText("xpath=/html/body/table/tbody/tr/td/span/span/span");
		if (first==second) {
	    	System.out.println("����");
	    	return false;}
	    else {
	    	System.out.println("��һ�Σ�"+first+"�ڶ��Σ�"+second);
	    	return true;
	    }
	}
//	���۲��ó���68��
	public void limit(String content) {
		webtest.click("link=����Ա[] 2018-12-04 ������־");
		webtest.click("class=ke-iframe");
		webtest.type("class=ke-iframe", content);
		webtest.click("class=BigButtonBHover");
	}
//	֪ͨ��ѯ
	public void clickinform() {
		webtest.click("link=֪ͨ");
		webtest.enterFrame("rightMain");
	}
	public void inform(String data1,String data2) {
		
		webtest.click("xpath=/html/body/div[1]/form/div/input[2]");
		webtest.type("xpath=/html/body/div[1]/form/div/input[2]", data1);
		webtest.click("xpath=/html/body/div[1]/form/div/input[3]");
		webtest.type("xpath=/html/body/div[1]/form/div/input[3]", data2);
		webtest.click("id=do_search");
	}
//	�������á�������ϵͳ��־(ɾ��)
	public void perlog() {
		webtest.click("link=����ϵͳ��־");
	    webtest.enterFrame("right");
	    webtest.click("name=chkall");
	    webtest.click("link=ɾ������");
	}
//	�������á��������޸�
	public void perpwd(String oldpwd,String newpwd1,String newpwd2) {
		webtest.click("link=�����޸�");
		webtest.enterFrame("right");
		webtest.typeAndClear("name=oldpassword", oldpwd);
		webtest.typeAndClear("name=password", newpwd1);
		webtest.typeAndClear("name=ppassword", newpwd2);
		webtest.click("class=BigButtonBHover");
	}
//	�������á���������Ϣ
	public void perinform(String phone,String content,String address) {
		webtest.click("link=������Ϣ");
		webtest.enterFrame("right");
		webtest.typeAndClear("name=phone", phone);
		webtest.typeAndClear("name=contact", content);
		webtest.typeAndClear("name=address", address);
	}
}

