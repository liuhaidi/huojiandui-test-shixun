package com.webtest.demo;
import com.webtest.core.WebDriverEngine;

public class Login_Action {
	private WebDriverEngine webtest;
	public Login_Action(WebDriverEngine webtest) {
		this.webtest=webtest;
	}
//��¼	
	public void login(String email,String password) {
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=��¼");
	}
//������Դ
	public void resource() {
		webtest.click("link=������Դ");
	}
//���ڹ���
	public void Time() {
		webtest.click("id=_M11");
		webtest.click("link=���ڹ���");
		webtest.pause(3000);
		webtest.enterFrame("rightMain");
		webtest.click("link=����");
		webtest.leaveFrame();
	}
	public void ZhouQi(String value,String value1) {
		webtest.click("id=_M11");
		webtest.click("link=���ڹ���");
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@name='vstartdate']");
		webtest.typeAndClear("xpath=//input[@name='vstartdate']",value);
		webtest.typeAndClear("xpath=//input[@name='venddate']",value1);
		webtest.click("link=��ѯ");
		}
	public void ShanChuOne() {
		webtest.click("id=_M11");
		webtest.click("link=���ڹ���");
		webtest.pause(3000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@value='8']");
		webtest.click("link=��������");
	}
	public void ShanChuMore() {
		webtest.click("id=_M11");
		webtest.click("link=���ڹ���");
		webtest.pause(3000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@value='8']");
		webtest.click("xpath=//input[@value='3']");
		webtest.click("link=��������");
	}
	public void DaoChu() {
		webtest.click("id=_M11");
		webtest.click("link=���ڹ���");
		webtest.pause(3000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//input[@name='chkall']");
		webtest.click("id=J-download");
	}
	
	
	
	
	
	
	
//���º�ͬ
	public void BianHaoChaXun(String value) {
		resource();
		webtest.click("link=���º�ͬ");
		webtest.pause(3000);
		webtest.enterFrame("rightMain");
		webtest.type("xpath=//input[@name='number']",value);	
		webtest.click("link=��ѯ");
		
	}
	public void LeiXingChaXun(String value) {
		resource();
		webtest.click("link=���º�ͬ");
		webtest.pause(3000);
		webtest.enterFrame("rightMain");
		webtest.selectByVisibleText("name=type", value);
		webtest.click("link=��ѯ");
		
	}
	public void FaBu(String value,String value1,String value2,String value3,String value4,String value5) {
		resource();
		webtest.click("link=���º�ͬ");
		webtest.pause(3000);
		webtest.enterFrame("rightMain");
		webtest.click("link=������Ϣ");
		webtest.selectByVisibleText("name=signdate", value);
		webtest.selectByVisibleText("name=testdate", value1);
		webtest.selectByVisibleText("name=testday", value2);
		webtest.selectByVisibleText("name=testenddate", value3);
		webtest.selectByVisibleText("name=signnum", value4);
		webtest.selectByVisibleText("name=signenddate", value5);
		
		
		
		
		
		
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
		
		public void FaBuJiangCheng(String value,String value1,String value2,String value3,String value4,String value5) {
			resource();
			webtest.click("link=���ͼ�¼");
			webtest.pause(3000);
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
		public void CaiDanTongBu() {
					resource();
					webtest.click("link=��Ƹ����");
					webtest.pause(3000);
	
		}
		public void XinJianHeTong(String value) {
			resource();
			webtest.click("link=���º�ͬ����");
			webtest.enterFrame("rightMain");
			webtest.click("link=���������º�ͬ����");
			webtest.pause(3000);
			webtest.selectByVisibleText("name=newname[]", value);
			webtest.click("link=����");
}
		public void XueLiShanChu() {
			resource();
			webtest.click("link=ѧ��");
			webtest.enterFrame("rightMain");
			webtest.click("link=ɾ��");
			webtest.pause(3000);
		
}
		
		
						
	
	

	
}
