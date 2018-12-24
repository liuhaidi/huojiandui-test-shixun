package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebTestListener;

@Listeners(WebTestListener.class)
public class Grbg_Test extends BaseTest{
	@Test(description="≤‚ ‘")
	public void dakaSuccess() throws IOException {
		Grbg_Action grbg = new Grbg_Action(webtest);
		grbg.daka();
		
		assertTrue(webtest.ifContains("¥Úø®≥…π¶"));
	}

}
