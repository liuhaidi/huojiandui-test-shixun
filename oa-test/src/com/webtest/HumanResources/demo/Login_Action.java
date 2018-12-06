package com.edu.pageObjects;

import java.io.IOException;

import com.edu.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

public class Login_Action {
	WebDriverEngine webtest=null;
	public Login_Action (WebDriverEngine webtest) {
		this.webtest=webtest;
	}
//��¼	
	public void login(String email,String password) throws IOException {
		webtest.open(ReadProperties.getPropertyValue("baseUrl"));
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=��¼");
	}
//������Դ
	public void resource() {
		webtest.click("link=������Դ");
	}
//���ڹ���
	public void Time() throws InterruptedException {
		webtest.click("id=_M11");
		webtest.click("link=���ڹ���");
		Thread.sleep(3000);
		webtest.enterFrame("rightMain");
		webtest.click("link=����");
		webtest.leaveFrame();
	}
	public void ZhouQi(String value,String value1) {
		webtest.click("id=_M11");
		webtest.click("link=���ڹ���");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@name='vstartdate']");
		webtest.type("xpath=//input[@name='vstartdate']",value);
		webtest.click("xpath=//input[@name='venddate']");
		webtest.type("xpath=//input[@name='venddate']",value1);
		webtest.click("class=SmallButton");
		}
	public void ShanChuOne() throws InterruptedException {
		webtest.click("id=_M11");
		webtest.click("link=���ڹ���");
		Thread.sleep(3000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@value='8']");
		webtest.click("link=��������");
	}
	public void ShanChuMore() throws InterruptedException {
		webtest.click("id=_M11");
		webtest.click("link=���ڹ���");
		Thread.sleep(3000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@value='8']");
		webtest.click("xpath=//input[@value='3']");
		webtest.click("link=��������");
	}
	public void DaoChu() throws InterruptedException {
		webtest.click("id=_M11");
		webtest.click("link=���ڹ���");
		Thread.sleep(3000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@name='chkall']");
		webtest.click("id=J-download");
		
	}
	
	
	
	
	
	
	
//���º�ͬ
	public void BianHaoChaXun(String value) throws InterruptedException {
		resource();
		webtest.click("link=���º�ͬ");
		Thread.sleep(3000);
		webtest.enterFrame("rightMain");
		webtest.type("xpath=//input[@name='number']",value);	
		webtest.click("id=do_search");
		
	}
	public void LeiXingChaXun(String value) throws InterruptedException {
		resource();
		webtest.click("link=���º�ͬ");
		Thread.sleep(3000);
		webtest.enterFrame("rightMain");
		webtest.selectByVisibleText("name=type", value);
		webtest.click("link=��ѯ");
		
	}
	public void FaBu(String value,String value1,String value2,String value3,String value4,String value5) throws InterruptedException {
		resource();
		webtest.click("link=���º�ͬ");
		Thread.sleep(3000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=/html/body/div[2]/div/div[1]/button[1]");
		webtest.type("name=signdate", value);
		webtest.type("name=testdate", value1);
		webtest.type("name=testday", value2);
		webtest.type("name=testenddate", value3);
		webtest.type("name=signnum", value4);
		webtest.type("name=signenddate", value5);
		webtest.click("class=BigButtonBHover");
		
		
		
		
		
		
	}
//��ѵ����
	public void HengChaiDan() {
		resource();
		webtest.click("link=��ѵ����");
		webtest.enterFrame("rightMain");
		webtest.click("link=�Ҹ������ѵ");
		
	}
	public void QuanXuanShanChu() {
		resource();
		webtest.click("link=��ѵ����");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@name='chkall']");
		webtest.click("link=��������");
		
	}
	public void CanYu(String value) {
		resource();
		webtest.click("link=��ѵ����");
		webtest.enterFrame("rightMain");
		webtest.click("link=�Ҳ������ѵ");
		webtest.typeAndClear("xpath=//input[@name='channel']",value);
		webtest.click("link=��ѯ");
		
	}
//���ͼ�¼
		public void JiLu(String value) {
			resource();
			webtest.click("link=���ͼ�¼");
			webtest.selectByVisibleText("name=channel", value);
			webtest.click("link=��ѯ");
		}
		
		public void FaBuJiangCheng(String value,String value1,String value2,String value3,String value4,String value5) throws InterruptedException {
			resource();
			webtest.click("link=���ͼ�¼");
			Thread.sleep(3000);
			webtest.enterFrame("rightMain");
			webtest.click("link=������Ϣ");
			webtest.selectByVisibleText("name=rewardsdate", value);
			webtest.selectByVisibleText("name=rewardskey", value1);
			webtest.selectByVisibleText("name=price", value2);
			webtest.selectByVisibleText("name=project", value3);
			webtest.selectByVisibleText("name=wagesmonth_year", value4);
			webtest.selectByVisibleText("name=wagesmonth_month", value5);
			webtest.click("link=����");
		}
//����������
		public void CaiDanTongBu() throws InterruptedException {
					resource();
					webtest.click("link=��Ƹ����");
					Thread.sleep(3000);
	
		}
		public void XinJianHeTong(String value) throws InterruptedException {
			resource();
			webtest.click("link=���º�ͬ����");
			webtest.enterFrame("rightMain");
			webtest.click("link=���������º�ͬ����");
			Thread.sleep(3000);
			webtest.selectByVisibleText("name=newname[]", value);
			webtest.click("link=����");
}
		public void XueLiShanChu() throws InterruptedException {
			resource();
			webtest.click("link=ѧ��");
			webtest.enterFrame("rightMain");
			webtest.click("link=ɾ��");
			Thread.sleep(3000);
		
}
		
		
						
	
	

	
}
