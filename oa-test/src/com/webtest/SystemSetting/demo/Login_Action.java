package com.webtest.demo;

import com.webtest.core.WebDriverEngine;

public class Login_Action {
	private WebDriverEngine webtest;
	public Login_Action(WebDriverEngine webtest) {
		this.webtest=webtest;
	}
	
	public void login(String email,String password) {
		webtest.type("name=username", email);
		webtest.type("name=password", password);
		webtest.click("link=µÇÂ¼");
	}
	public void tuichu() {
		webtest.click("[ÍË³ö]");
	}
	

	
	
	

}
