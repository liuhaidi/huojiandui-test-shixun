package com.api.test;

import org.testng.annotations.Test;
import study.java.mail.Mail;
import study.java.mail.MailSender;

public class JavaMail_Test {
	@Test
	public void testJavaMail() {
        Mail mail = new Mail();
        mail.setFrom("3012115199@qq.com");
        mail.setTo(new String[]{"2310618296@qq.com"});
        mail.setSubject("ÎÒµÄÓÊ¼ş");
        mail.setContent("123456");
        MailSender sender = new MailSender();
        sender.setMailStmpHost("smtp.qq.com");
        sender.setMailStmpPort(25);
        sender.setUserName("3012115199@qq.com");
        sender.setPassword("sjbmhsabizmbdhdj");
        sender.setValidate(true);
        sender.sendMail(mail);
    }

}
