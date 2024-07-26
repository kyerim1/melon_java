package study;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	
	
	public static void sendEmail(String fromEmail, String title, String content) {
		// ���Ǳ� ��� �Ǹ� ������ �̸��Ϸ� �����ϱ�
		
		// ������ �̸��� ���� ����
		final String adminEmail = "zerodimension@naver.com";
		final String password = "XL3HKFMBCLR1";
		
		// ������ �̸��� ȯ�漳�� ���
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.naver.com"); // smtp ������
		prop.put("mail.smtp.port", "587"); // smtp��Ʈ��ȣ
		prop.put("mail.smtp.starttls.enable", "true"); // tls ��뿩��
		prop.put("mail.smtp.auth","true" ); //smtp ��������
		
		// ���Ǳ��� ��� �Ǹ� ������ �̸��Ϸ� ���� �Ǿ���Ѵ�.
		// ������ ����� �޴»�� �� �ʿ��ѵ�
		// ������ ����� Ŭ���̾�Ʈ ������ ���� Ŭ���̾�Ʈ ���Ͽ��� �߼۵Ǵ°�
		// �ƴϰ� �ڹٿ��� �߼��ϴ°��̱⶧���� 
		// ������ �� ������ �ް� �ؾ��Ѵ�.
		Session adminAuth = Session.getInstance(prop,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(adminEmail, password);
					}
				}
				
				); // ������ �̸��� �α��� ����
		
		try {
			
			MimeMessage msg = new MimeMessage(adminAuth);
			msg.setFrom( new InternetAddress(adminEmail) ); // ������ �̸����ּ�
			msg.setRecipients(Message.RecipientType.TO, 
					InternetAddress.parse(adminEmail));// �޴� �̸����ּ�
			
			msg.setSubject("���� �� ��� [ "+title+" ]-"+fromEmail); // �̸��� ����
			
			msg.setText(   // �̸��� ����   
				"<h3>���� ����</h3>  <b>"+content+
		"</b>  <div> <a href='http://localhost:8080/jsp_study1/study/?part=inquiry'>"+
		"���Ǳ� Ȯ��</a> </div>"
					); 
			
			Transport.send(msg); // ���� ����
			
		}catch(MessagingException e) {
			e.printStackTrace();
			System.out.println(" �̸��� ���� ���� ");
		}
	}
}






