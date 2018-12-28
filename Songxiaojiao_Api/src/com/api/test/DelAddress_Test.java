package com.api.test;

import org.testng.annotations.Test;

import com.api.core.BaseTest;
import com.api.core.Checker;
import com.api.core.HttpDriver;
import com.api.core.ReadPro;

import net.sf.json.JSONObject;

public class DelAddress_Test extends BaseTest{
	Checker check=null;
	public void login(String phoneArea,String phoneNumber,String password ) throws Exception {
		String url=ReadPro.getPropValue("BaseUrl")+ReadPro.getPropValue("login");
		JSONObject success_user = new JSONObject();
		success_user.element("phoneArea", phoneArea);
		success_user.element("phoneNumber",phoneNumber);
		success_user.element("password", password);
		String content=HttpDriver.doPost(url,success_user);
		check = new Checker(content);
	}

	@Test(priority=0)
	public void LoginBySuccess() throws Exception {
		login("86","20000000000","netease123");
		check.verifyXpath("message", "success");
	}
	@Test(priority=1)
	public void LoginByFail1() throws Exception {
		login("86","20000000000","netease1234");
		check.verifyXpath("message", "�û��������������");
	}
	@Test(priority=2)
	public void LoginByFail2() throws Exception {
		login(" "," ","netease123");
		check.verifyXpath("message", "�û���Ϊ��");
	}

}
