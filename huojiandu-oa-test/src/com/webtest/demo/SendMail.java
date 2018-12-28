 package com.webtest.demo;

import java.io.IOException;

import org.testng.annotations.Test;


import com.webtest.utils.ReadProperties;
import com.webtest.mail.Sendmail;


public class SendMail {
	@Test
	public void send() throws IOException, Exception {
		Sendmail send = new Sendmail();
		send.sendMail_TuWen(ReadProperties.getPropertyValue("myEmailAccount"), ReadProperties.getPropertyValue("myEmailPassword"),
	                        ReadProperties.getPropertyValue("myEmailSMTPHost"), ReadProperties.getPropertyValue("receiveMailAccount"), 
	                        ReadProperties.getPropertyValue("mail_title"), ReadProperties.getPropertyValue("mail_text"),
	                        ReadProperties.getPropertyValue("mail_picture"), ReadProperties.getPropertyValue("mail_fujian"));
	}

}
