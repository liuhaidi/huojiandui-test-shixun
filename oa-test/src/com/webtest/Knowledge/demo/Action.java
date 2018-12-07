package com.webtest.Knowledge.demo;

import java.io.IOException;

import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

public class Action {
	private WebDriverEngine webtest;
	  public Action(WebDriverEngine webtest) {
		  this.webtest=webtest;
	  }
	  //��¼OAϵͳ
	  public void login(String username,String password) throws IOException
	  {
		  webtest.open(ReadProperties.getPropertyValue("base_url"));
		  webtest.type("name=username", username);
		  webtest.type("name=password", password);
		  webtest.click("class=loginBtn");

	  }
      //1.���롰֪ʶ���������
	  public void knowledge() throws IOException 
	  {
		  webtest.click("id=_M9");
		    
	  }
	  //2.�鿴��֪ʶ�������ĸ���ģ��
	  public void others() throws IOException 
	  {
		  webtest.click("link=֪ʶ����");
		  webtest.click("link=_MP151");
		  webtest.click("link=_MP150");
		  webtest.click("link=���ع���");
		  webtest.click("link=����Ӳ��");
		  webtest.click("link=�����ļ���");
		  webtest.click("link=�����ƶ�");
		  webtest.click("link=�����ڿ�");
		  webtest.click("link=�������");
	  }
	  //3.������Ϣʱδ��д����
	  public void message(String content) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=֪ʶ����");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//button[@action='new_work']");
		  webtest.click("class=ke-iframe");
	      webtest.type("class=ke-iframe",content);
		  webtest.click("xpath=//input[@value='����']");
		  webtest.leaveFrame();
	  }
	  //4.������Ϣʱδ��д����
	  public void message2(String title) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=֪ʶ����");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//button[@action='new_work']");
		  webtest.typeAndClear("xpath=//input[@class='BigInput']",title);
		  webtest.click("xpath=//input[@value='����']");
		  webtest.leaveFrame();
	  }
	  //5.��д��������ݷ�������
	  public void message3(String title,String content) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=֪ʶ����");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//button[@action='new_work']");
		  webtest.typeAndClear("xpath=//input[@class='BigInput']",title);
		  webtest.click("class=ke-iframe");
		  webtest.type("class=ke-iframe",content);
		  webtest.click("xpath=//input[@value='����']");
		  webtest.leaveFrame();
	  }
	  //6.�������������ѯ�ѷ�����֪ʶ
	  public void search(String tname) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=֪ʶ����");
		  webtest.enterFrame("rightMain");
		  webtest.type("xpath=//input[@name='title']",tname);
		  webtest.click("xpath=//button[@id='do_search']");
		  webtest.leaveFrame();
	  }
	  //7.�����������ڲ�ѯ�ѷ�����֪ʶ
	  public void search2() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=֪ʶ����");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@name='vstartdate']");
		  webtest.click("xpath=//td[@onclick='day_Click(2018,12,5);']");
		  webtest.click("xpath=//input[@name='venddate']");
		  webtest.click("xpath=//td[@onclick='day_Click(2018,12,6);']");
		  webtest.click("xpath=//button[@id='do_search']");
		  webtest.leaveFrame();
	  }
	  //8.����������������ڲ�ѯ�ѷ�����֪ʶ
	  public void search3(String tname) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=֪ʶ����");
		  webtest.enterFrame("rightMain");
		  webtest.type("xpath=//input[@name='title']",tname);
		  webtest.click("xpath=//input[@name='vstartdate']");
		  webtest.click("xpath=//td[@onclick='day_Click(2018,12,5);']");
		  webtest.click("xpath=//input[@name='venddate']");
		  webtest.click("xpath=//td[@onclick='day_Click(2018,12,6);']");
		  webtest.click("xpath=//button[@id='do_search']");
		  webtest.leaveFrame();
	  }
	 // 9.ѡ�в�ɾ���ѷ�����֪ʶ���������ݣ�
	  public void deletekn() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=֪ʶ����");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@value='3']");
		  webtest.click("xpath=//button[@action='cancel_concern']");
		  webtest.leaveFrame();
	  }
	  //10.δѡ��ɾ���ѷ�����֪ʶ���������ݣ�
	  public void deletekn2() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=֪ʶ����");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//button[@action='cancel_concern']");
		  webtest.leaveFrame();
	  }
	  //11.���롰�������ӡ�ģ��
	  public void tiezi() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=֪ʶ����");
		  webtest.enterFrame("rightMain");
		  webtest.click("id=_MP151");
		  webtest.leaveFrame();
	  }
	  //12.��֤�����̳��鹦��
	  public void forum(String forumtitle) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP149");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=+�����°��");
		  webtest.click("xpath=//input[@name='newname[]']");
		  webtest.type("xpath=//input[@name='newname[]']",forumtitle);
		  webtest.click("xpath=//input[@value='����']");
	      webtest.leaveFrame();
	  }
	  //13.��֤ɾ����̳��鹦��
	  public void forum2() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP149");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//a[contains(@href,'id=6')]");
        webtest.leaveFrame();
	  }
	  //14.��֤������̳������͹���
	  public void forum3() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP149");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@name='type[5]']");
		  webtest.click("xpath=//option[@value='2']");
		  webtest.click("xpath=//input[@value='����']");
        webtest.leaveFrame();
	  }
	  //15.��������δѡ����
	  public void tiezi2(String tztitle,String content) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP151");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@name='title']");
		  webtest.type("xpath=//input[@name='title']",tztitle);
		  webtest.click("class=ke-iframe");
		  webtest.type("class=ke-iframe",content);
		  webtest.click("xpath=//input[@value='����']");
        webtest.leaveFrame();	  
	  }
	  //16.��������δ��д����
	  public void tiezi3(String content) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP151");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//select[@name='bbsclass']");
		  webtest.click("xpath=//option[@value='5']");
		  webtest.click("class=ke-iframe");
		  webtest.type("class=ke-iframe",content);
		  webtest.click("xpath=//input[@value='����']");
        webtest.leaveFrame();
	  }
	//17.��������δ��д����
	  public void tiezi4(String title) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP151");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//select[@name='bbsclass']");
		  webtest.click("xpath=//option[@value='5']");
		  webtest.click("xpath=//input[@name='title']");
		  webtest.type("xpath=//input[@name='title']",title);
		  webtest.click("xpath=//input[@value='����']");
        webtest.leaveFrame();
	  }
	//18.��֤�������ӹ���
	  public void tiezi5(String title,String content) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP151");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//select[@name='bbsclass']");
		  webtest.click("xpath=//option[@value='5']");
		  webtest.click("xpath=//input[@name='title']");
		  webtest.type("xpath=//input[@name='title']",title);
		  webtest.click("class=ke-iframe");
		  webtest.type("class=ke-iframe",content);
		  webtest.click("xpath=//input[@value='����']");
        webtest.leaveFrame();
	  }
	  //19.��֤�����б���ֱ�ӷ�����������
	  public void tiezi6() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("id=_MP150");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//button[@action='new_work']");
        webtest.leaveFrame();
	  }
	  //20-23ͬ��
	  //24.25�޷���λԪ��
	  //26.��֤�������ļ��Ĺ���
	  public void rename(String ceshi) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//a[(@id='8')]");
		  webtest.click("xpath=//input[@name='filename']");
		  webtest.typeAndClear("xpath=//input[@name='filename']",ceshi);
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	  //27.��֤����ɾ���ļ�����
	  public void deletefile() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@value='6']");
		  webtest.click("link=����ɾ��");
		  webtest.leaveFrame();
	  }
	  //28.δѡ���ļ����޷�����ɾ���ļ�
	  public void deletefile2() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=����ɾ��");
		  webtest.leaveFrame();
	  }
	  //29.ѡ�в��ɹ�ɾ��ȫ���ļ�
	  public void deletefile3() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=ȫѡ");
		  webtest.click("link=����ɾ��");
		  webtest.leaveFrame();
	  }
	  //30.��������Ա�ɹ������ļ���δ�ɹ���û����ַ�޷���λ��
	  public void share() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@value='6']");
		  webtest.click("link=�������");
		  webtest.click("link=����");
		  webtest.click("link=+ѡ����Ա");
		  webtest.click("xpath=//img[@id='tree_1_cb']");
		  webtest.click("xpath=//input[@value='ȷ��']");
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	  //31.32ͬ��δ�ɹ�ִ��
	  //33.�½��ļ������Ʋ���Ϊ��
	  public void newfile() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=�½��ļ���");
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	  //34.��֤�ļ����Ѵ��ں��½��ļ��й���
	  public void newfile2(String newtitle) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=�½��ļ���");
		  webtest.click("xpath=//input[@id='title']");
		  webtest.type("xpath=//input[@id='title']",newtitle);
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	  //35.�½��ļ�������Ϊ�ո�
	  public void newfile3(String kongge) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=�½��ļ���");
		  webtest.click("xpath=//input[@id='title']");
		  webtest.type("xpath=//input[@id='title']",kongge);
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	//36.��֤�½��ļ������ƹ���
	  public void newfile4(String sname) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=�½��ļ���");
		  webtest.click("xpath=//input[@id='title']");
		  webtest.type("xpath=//input[@id='title']",sname);
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	  //37.��֤�������ļ��еĹ���
	  public void newfile5(String mm) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//a[(@title='huojian')]");
		  webtest.click("xpath=//input[@id='title']");
		  webtest.typeAndClear("xpath=//input[@id='title']",mm);
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	//38.��֤ɾ���ļ��еĹ���
	  public void deletefile4() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//a[@did='1']");
		  webtest.leaveFrame();
	  }
	//39.��֤��ѯ�ļ��ܷ�Ϊ��
	  public void search4() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=��ѯ");
		  webtest.leaveFrame();
	  }
	//40.��֤��ѯ�ļ��Ĺ���
	  public void search5(String titlename) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@name='title']");
		  webtest.type("xpath=//input[@name='title']",titlename);
		  webtest.click("link=��ѯ");
		  webtest.leaveFrame();
	  }
	//41.��ѯ�ļ����벻���ڵ��ļ���
	  public void search6(String titlename) throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@name='title']");
		  webtest.type("xpath=//input[@name='title']",titlename);
		  webtest.click("link=��ѯ");
		  webtest.leaveFrame();
	  }
	  //42.��֤�����С��ƶ��ļ����Ĺ���
	  public void move() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("xpath=//input[@value='6']");
		  webtest.click("link=�������");
		  webtest.click("link=�ƶ�");
		  webtest.click("xpath=//select[@name='typeid']");
		  webtest.click("xpath=//option[@value='1']");
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }
	  //43.δѡ���ļ���������������-�ƶ��ļ���
	  public void move2() throws IOException 
	  {
		  webtest.click("id=_M9");
		  webtest.click("link=���ع���");
		  webtest.enterFrame("rightMain");
		  webtest.click("link=�������");
		  webtest.click("link=�ƶ�");
		  webtest.click("xpath=//select[@name='typeid']");
		  webtest.click("xpath=//option[@value='1']");
		  webtest.click("xpath=//button[@class='btn btn-danger']");
		  webtest.leaveFrame();
	  }


}
