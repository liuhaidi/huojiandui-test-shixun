//����helloworld
package com.webtest.demo;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import com.sun.mail.util.MailSSLSocketFactory;
public class javamail {

public static void main(String[] args) throws Exception {

Properties prop = new Properties();
// ����debug���ԣ��Ա��ڿ���̨�鿴
prop.setProperty("mail.debug", "true"); 
// �����ʼ�������������
prop.setProperty("mail.host", "smtp.qq.com");
// ���ͷ�������Ҫ�����֤
prop.setProperty("mail.smtp.auth", "true");
// �����ʼ�Э������
prop.setProperty("mail.transport.protocol", "smtp");

// ����SSL���ܣ������ʧ��
MailSSLSocketFactory sf = new MailSSLSocketFactory();
sf.setTrustAllHosts(true);
prop.put("mail.smtp.ssl.enable", "true");
prop.put("mail.smtp.ssl.socketFactory", sf);

// ����session
Session session = Session.getInstance(prop);
// ͨ��session�õ�transport����
Transport ts = session.getTransport();
// �����ʼ����������������ͣ��ʺţ���Ȩ��������루����ȫ��
ts.connect("smtp.qq.com","825147384", "ykonxvsdmkygbfei");
// �����ʼ�
Message message = createSimpleMail(session);
// �����ʼ�
ts.sendMessage(message, message.getAllRecipients());
ts.close();
}

/**
* @Method: createSimpleMail
* @Description: ����һ��ֻ�����ı����ʼ�
*/
public static MimeMessage createSimpleMail(Session session)throws Exception {
// �����ʼ�����
MimeMessage message = new MimeMessage(session);
// ָ���ʼ��ķ�����
message.setFrom(new InternetAddress("825147384@qq.com"));
// ָ���ʼ����ռ��ˣ����ڷ����˺��ռ�����һ���ģ��Ǿ����Լ����Լ���
message.setRecipient(Message.RecipientType.TO, new InternetAddress("825147384@qq.com"));
// �ʼ��ı���
message.setSubject("JavaMail����");
// �ʼ����ı�����
message.setContent("hello world��", "text/html;charset=UTF-8");

MimeBodyPart image = new MimeBodyPart();
// ��ȡ�����ļ�
DataHandler dh = new DataHandler(new FileDataSource("data\\1.jpg"));
// ��ͼƬ������ӵ�"�ڵ�"
image.setDataHandler(dh);
// Ϊ"�ڵ�"����һ��Ψһ��ţ����ı�"�ڵ�"�����ø�ID��
image.setContentID("mailTestPic");    
 
// 6. �����ı�"�ڵ�"
MimeBodyPart text = new MimeBodyPart();
// �������ͼƬ�ķ�ʽ�ǽ�����ͼƬ�������ʼ�������, ʵ����Ҳ������ http ���ӵ���ʽ�������ͼƬ
text.setContent("����һ��ͼƬ<br/><a href='http://www.cnblogs.com/ysocean/p/7666061.html'><img src='cid:mailTestPic'/></a>", "text/html;charset=UTF-8");
 
// 7. ���ı�+ͼƬ������ �ı� �� ͼƬ"�ڵ�"�Ĺ�ϵ���� �ı� �� ͼƬ"�ڵ�"�ϳ�һ�����"�ڵ�"��
MimeMultipart mm_text_image = new MimeMultipart();
mm_text_image.addBodyPart(text);
mm_text_image.addBodyPart(image);
mm_text_image.setSubType("related");    // ������ϵ
 
// 8. �� �ı�+ͼƬ �Ļ��"�ڵ�"��װ��һ����ͨ"�ڵ�"
// ������ӵ��ʼ��� Content ���ɶ�� BodyPart ��ɵ� Multipart, ����������Ҫ���� BodyPart,
// ����� mailTestPic ���� BodyPart, ����Ҫ�� mm_text_image ��װ��һ�� BodyPart
MimeBodyPart text_image = new MimeBodyPart();
text_image.setContent(mm_text_image);
 
// 9. ��������"�ڵ�"
MimeBodyPart attachment = new MimeBodyPart();
// ��ȡ�����ļ�
DataHandler dh2 = new DataHandler(new FileDataSource("data\\mail.docx"));
// ������������ӵ�"�ڵ�"
attachment.setDataHandler(dh2);
// ���ø������ļ�������Ҫ���룩
attachment.setFileName(MimeUtility.encodeText(dh2.getName()));       
 
// 10. ���ã��ı�+ͼƬ���� ���� �Ĺ�ϵ���ϳ�һ����Ļ��"�ڵ�" / Multipart ��
MimeMultipart mm = new MimeMultipart();
mm.addBodyPart(text_image);
mm.addBodyPart(attachment);     // ����ж�����������Դ������������
mm.setSubType("mixed");         // ��Ϲ�ϵ

// 11. ���������ʼ��Ĺ�ϵ�������յĻ��"�ڵ�"��Ϊ�ʼ���������ӵ��ʼ�����
message.setContent(mm);
//�����ʼ��ķ���ʱ��,Ĭ����������
message.setSentDate(new Date());
// ���ش����õ��ʼ�����
return message;
}
}