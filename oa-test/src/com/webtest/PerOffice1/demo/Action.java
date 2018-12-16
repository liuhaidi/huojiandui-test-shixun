package com.webtest.PerOffice1.demo;

import java.io.IOException;

import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

public class Action {
	WebDriverEngine webtest = null;
	public Action(WebDriverEngine webtest) {
		this.webtest = webtest;
	}
	//��¼
	public void login(String username,String password) throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url"));
		webtest.type("id=vipname", username);
		webtest.type("id=vippassword", password);
		webtest.click("link=��¼");
		
	}
	//���˰칫
	public void perOffice() {
		webtest.click("link=���˰칫");
		webtest.pause(3000);
	}
	
	//1.���߿���
	public void kaoqin() {
		perOffice();
		webtest.click("link=���߿���");
		
	}
	//��
	public void daka() {
		webtest.click("xpath=//input[@value='���ߴ�']");
	}
	//�ύ��ע1
	public void beizhu() {
			webtest.click("xpath=//input[@value='�ύ��ע']");
		}
	//�ύ��ע2
	public void beizhu(String beizhu) {
		webtest.click("xpath=//input[starts-with(@name, 'note')]");
		webtest.typeAndClear("xpath=//input[starts-with(@name, 'note')]",beizhu);
		webtest.click("xpath=//input[@value='�ύ��ע']");
		webtest.pause(5000);
	}
	public void beizhu2(String beizhu) {
		webtest.click("xpath=//input[starts-with(@name, 'note')]");
		webtest.typeAndClear("xpath=//input[starts-with(@name, 'note')]",beizhu);
		webtest.click("xpath=//input[@value='�ύ��ע']");
	}
	//2.�������
	public void renwuguanli() {
		perOffice();
		webtest.click("link=�������");
	}
	//�½�����
	public void xinjianrenwu(String number,String title,String startdate,String enddate,String description) {
		webtest.click("xpath=//button[@action='new_work']");
		webtest.typeAndClear("xpath=//input[@name='number']", number);
		webtest.type("xpath=//input[@name='title']", title);
		webtest.typeAndClear("xpath=//input[@name='startdate']", startdate);
		webtest.typeAndClear("xpath=//input[@name='enddate']", enddate);
		webtest.click("link=+ѡ��ִ����");
		webtest.getWindow(1);
		System.out.println(webtest.getText("xpath=//span[@class='big3']"));
		webtest.click("xpath=//div[@title='�����']/img");
		webtest.click("xpath=//div[@title='������Դ��']/img");
		webtest.click("xpath=//div[@title='������Դ��']/img[@id='tree_16_cb']");
		webtest.click("xpath=//input[@value='ȷ ��']");
		webtest.getWindow(0);
		webtest.click("class=ke-iframe");
		webtest.type("class=ke-iframe", description);
		webtest.click("xpath=//input[@value='������Ϣ']");
	}
	public void xinjianrenwu1(String number,String title,String startdate) {
		webtest.click("xpath=//button[@action='new_work']");
		webtest.typeAndClear("xpath=//input[@name='number']", number);
		webtest.type("xpath=//input[@name='title']", title);
		webtest.typeAndClear("xpath=//input[@name='startdate']", startdate);
		webtest.click("id=user");
	}
	//�½�������ִ����
	public void xinjianrenwu1(String number,String title,String startdate,String enddate,String description) {
		webtest.click("xpath=//button[@action='new_work']");
		webtest.typeAndClear("xpath=//input[@name='number']", number);
		webtest.type("xpath=//input[@name='title']", title);
		webtest.typeAndClear("xpath=//input[@name='startdate']", startdate);
		webtest.typeAndClear("xpath=//input[@name='enddate']", enddate);
		webtest.click("class=ke-iframe");
		webtest.type("class=ke-iframe", description);
		webtest.click("xpath=//input[@value='������Ϣ']");
	}
	//�༭����ʱ��
	public void bianjirenwu(String enddate) {
		webtest.click("xpath=//button[@action='new_work']");
		webtest.typeAndClear("xpath=//input[@name='enddate']", enddate);
		webtest.click("xpath=//input[@value='������Ϣ']");
	}
	//��¼�û����˺�
	public void zhixingren(String username,String password) throws IOException {
		webtest.click("link=[�˳�]");
		login(username, password);
	}
	//ִ���������б�
	public void renwuliebiao1() throws IOException {
		webtest.enterFrame("rightMain");
		webtest.click("link=Դ����");
		webtest.leaveFrame();
		webtest.getWindow(1);
		webtest.click("link=<<�����б�ҳ");
	}
	public void renwuliebiao2() throws IOException {
		webtest.enterFrame("rightMain");
		webtest.click("link=����2");
		webtest.leaveFrame();
		webtest.getWindow(1);
		webtest.click("link=<<�����б�ҳ");
	}
	public void renwuliebiao3() throws IOException {
		webtest.enterFrame("rightMain");
		webtest.click("link=����3");
		webtest.leaveFrame();
		webtest.getWindow(1);
		webtest.click("link=<<�����б�ҳ");
	}
	public void renwuliebiao4() throws IOException {
		webtest.enterFrame("rightMain");
		webtest.click("link=����4");
		webtest.leaveFrame();
		webtest.getWindow(1);
		webtest.click("link=<<�����б�ҳ");
	}
	//��������
	public void fanhuiliebiao() {
		
		webtest.click("link=<<�����б�ҳ");
	}
	//����¼��
	public void jinduluru() throws IOException {
		webtest.click("link=����¼��");
	}
	//¼�����
	public void lurujindu(String progress,String miaoshu) throws IOException {
		webtest.click("xpath=//input[@value='¼�����']");
		webtest.type("xpath=//input[@name='progress']", progress);
		webtest.click("class=ke-iframe");
		webtest.type("class=ke-iframe", miaoshu);
		webtest.click("xpath=//input[@value='������Ϣ']");
	}
	//�鿴������б�
	public void yiwanchengrenwu() throws IOException {
		
		webtest.click("link=���������");//��ҳ������ɵ��Ѵ���
		
	}
	//��ѯ����
	public void chaxunrenwu(String number,String title,String vstartdate,String venddate) {
		webtest.type("xpath=//input[@name='number']",number);
		webtest.type("xpath=//input[@name='title']",title);
		webtest.type("xpath=//input[@name='vstartdate']",vstartdate);
		webtest.type("xpath=//input[@name='venddate']",venddate);
		webtest.click("id=do_search");
	}
	//3.���˼ƻ�
	public void jihua() {
		perOffice();
		webtest.click("link=�����ƻ�");
	}
	//�鿴�����
	public void jihuazhuangtai() {
		webtest.click("link=����ɵļƻ�");//��ҳ������ɵ��Ѵ���
	}
	//�޸�״̬
	public void xiugaizhuangtai() {
		webtest.click("link=���");
		webtest.pause(5000);
	}
	//����
	public void jihuapinglun(String pinglun) throws IOException {
		webtest.click("link=�鿴");
		webtest.click("class=ke-iframe");
		webtest.type("class=ke-iframe",pinglun );
		webtest.click("xpath=//input[@value='��������']");
	}
	//4.�������
	public void huiyi() {
		perOffice();
		webtest.click("link=�������");
	}
	//��������
	public void huiyishenqing(String startdate,String enddate,String value1,String value2,String value3,String value4,String title,String value5,String miaoshu) {
		webtest.click("xpath=//button[@action='new_work']");
		webtest.typeAndClear("xpath=//input[@name='startdate']",startdate);
		
		webtest.selectByValue("xpath=//select[@name='starttime1']", value1);
		webtest.selectByValue("xpath=//select[@name='starttime2']", value2);
		webtest.typeAndClear("xpath=//input[@name='enddate']",enddate);
		webtest.selectByValue("xpath=//select[@name='endtime1']", value3);
		webtest.selectByValue("xpath=//select[@name='endtime2']", value4);
		
		webtest.click("link=+ѡ��������");
		webtest.getWindow(1);
		System.out.println(webtest.getText("xpath=//span[@class='big3']"));
		webtest.click("xpath=//tbody/tr[2]/td[1]/input[4]");
		webtest.click("xpath=//input[@value='ȷ��ѡ��']");
		webtest.getWindow(0);
		
		webtest.click("link=+ѡ���¼Ա");
		webtest.getWindow(1);
		System.out.println(webtest.getText("xpath=//span[@class='big3']"));
		webtest.click("xpath=//tbody/tr[2]/td[3]/input[4]");
		webtest.click("xpath=//input[@value='ȷ��ѡ��']");
		webtest.getWindow(0);
		
		webtest.click("link=+ѡ���ϯ��");
		webtest.getWindow(1);
		webtest.click("xpath=//div[@title='�����']/img");
		webtest.click("xpath=//div[@title='������Դ��']/img");
		webtest.click("xpath=//div[@title='������Դ��']/img[@id='tree_16_cb']");
		webtest.click("xpath=//input[@value='ȷ ��']");
		webtest.getWindow(0);

		webtest.click("link=+ѡ��������");
		webtest.getWindow(1);
		System.out.println(webtest.getText("xpath=//span[@class='big3']"));
		webtest.click("xpath=//tbody/tr[2]/td[1]/input[4]");
		webtest.click("xpath=//input[@value='ȷ��ѡ��']");
		webtest.getWindow(0);
		
		webtest.type("xpath=//input[@name='title']",title );
		webtest.selectByValue("xpath=//select[@id='conferenceroom']", value5);
		webtest.click("class=ke-iframe");
		webtest.type("class=ke-iframe", miaoshu);
		webtest.click("xpath=//input[@value='����']");
		
	}
	//����
	public void shenpi() {
		webtest.click("link=����");
	}
	//�ܾ�
	public void jujue() {
		webtest.click("link=�ܾ�");
	}
	//5.�ֻ�����
	public void messages() {
		perOffice();
		webtest.click("link=�ֻ�����");
	}
	//���Ͷ���
	public void send(String content) {
		webtest.click("xpath=//button[@action='new_work']");
		//ѡ�������
		webtest.click("link=+ѡ ��");
		webtest.getWindow(1);
		System.out.println(webtest.getText("xpath=//span[@class='big3']"));
		webtest.click("xpath=//div[@title='�����']/img");
		webtest.click("xpath=//div[@title='������Դ��']/img");
		webtest.click("xpath=//div[@title='������Դ��']/img[@id='tree_16_cb']");
		webtest.click("xpath=//input[@value='ȷ ��']");
		webtest.getWindow(0);
		webtest.type("xpath=//textarea[@name='content']",content);
		webtest.click("xpath=//input[@value='���Ͷ���']");
	}
	//6.ͨѶ¼
	public void contacts() {
		perOffice();
		webtest.click("link=ͨѸ¼");
	}
	//����ͨѶ¼
	public void addContacts(String company,String person,String tel,String phone) {
		webtest.click("xpath=//button[@action='new_work']");
		webtest.type("xpath=//input[@name='company']",company );
		webtest.type("xpath=//input[@name='person']",person );
		webtest.type("xpath=//input[@name='tel']",tel );
		webtest.type("xpath=//input[@name='phone']",phone );
		webtest.click("xpath=//input[@value='Ů']");
		webtest.click("xpath=//input[@value='������Ϣ']");
	}
	//ѡ����ϵ�˷��Ͷ���
	public void sendMessages() {
		webtest.click("name=chkall");
		webtest.click("xpath=//button[@action='cancel_concern']");
	}
	//ѡ����ϵ�˷��Ͷ���
	public void sendMessage1(String content) {
		webtest.click("xpath=//button[@action='cancel_concern']");
		//ѡ�������
		webtest.click("link=+ѡ ��");
		webtest.getWindow(1);
		System.out.println(webtest.getText("xpath=//span[@class='big3']"));
		webtest.click("xpath=//div[@title='�����']/img");
		webtest.click("xpath=//div[@title='������Դ��']/img");
		webtest.click("xpath=//div[@title='������Դ��']/img[@id='tree_16_cb']");
		webtest.click("xpath=//input[@value='ȷ ��']");
		webtest.getWindow(0);
		webtest.type("xpath=//textarea[@name='content']",content);
		webtest.click("xpath=//input[@value='���Ͷ���']");
	}
	//7.��������
	public void clear() {
		webtest.click("xpath=//button[@action='cancel_concern']");
	}
	public void enter_ifream() {
		webtest.enterFrame("rightMain");
	}
	public void leave_ifream() {
		webtest.leaveFrame();
	}
	
	
	
}
