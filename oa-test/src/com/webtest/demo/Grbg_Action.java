package com.webtest.demo;

import java.io.IOException;

import com.webtest.core.WebDriverEngine;
import com.webtest.utils.ReadProperties;

public class Grbg_Action {
	WebDriverEngine webtest = null;
	public Grbg_Action(WebDriverEngine webtest) {
		this.webtest = webtest;
	}
	public void daka() throws IOException {
		webtest.open(ReadProperties.getPropertyValue("base_url"));
		webtest.type("id=vipname", "admin");
		webtest.type("id=vippassword", "123456");
		webtest.click("link=��¼");
		webtest.click("link=���˰칫");
		webtest.click("link=���߿���");
		webtest.click("xpath=//input[@value='���ߴ�']");
	}


}
