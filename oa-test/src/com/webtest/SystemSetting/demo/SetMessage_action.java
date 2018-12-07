package com.webtest.SystemSetting.demo;

import java.io.IOException;

import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

public class SetMessage_action {
	private WebDriverEngine webtest;
	public SetMessage_action(WebDriverEngine webtest) {
		this.webtest=webtest;
	}
	
	public void login(String email,String password) throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url"));
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=µÇÂ¼");
	}
	
	public void setMessage(String name,String number) {
		webtest.click("id=_M58");
		webtest.type("name=value[name]", name);
		webtest.type("name=value[pagenum]", number);
		
	}
	

}
