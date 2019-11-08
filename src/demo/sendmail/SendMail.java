package demo.sendmail;

import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.sun.mail.util.MailSSLSocketFactory;
/**
 * 发送qq邮件  并  附带文本文件(暂有问题)
 * @author 76519
 *
 */
public class SendMail {
	public static void main(String[] args) throws GeneralSecurityException {
		// 收件人电子邮箱
		String to = "765199214@qq.com";

		// 发件人电子邮箱
		String from = "302592372@qq.com";

		// 指定发送邮件的主机为 smtp.qq.com
		String host = "smtp.qq.com"; // QQ 邮件服务器

		// 获取系统属性
		Properties properties = System.getProperties();

		// 设置邮件服务器
		properties.setProperty("mail.smtp.host", host);

		properties.put("mail.smtp.auth", "true");
		// 关于QQ邮箱，还要设置SSL加密，加上以下代码即可
		MailSSLSocketFactory sf = new MailSSLSocketFactory();
		sf.setTrustAllHosts(true);
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.ssl.socketFactory", sf);

		// 获取默认session对象
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("302592372", "nfbbrilybnvlbhab"); // 发件人邮件用户名、密码
			}
		});

		try {
			// 创建默认的 MimeMessage 对象
			MimeMessage message = new MimeMessage(session);

			// Set From: 头部头字段
			message.setFrom(new InternetAddress(from));

			// Set To: 头部头字段
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Set Subject: 头部头字段
			message.setSubject("This is the Subject Line!");

			// 设置消息体
			message.setText("66666");

			//附带附件部分-----暂存在空指针异常
			// 创建消息部分   
			BodyPart messageBodyPart = new MimeBodyPart();
			// 设置消息
			messageBodyPart.setText("This is message body");
			// 创建多消息
			Multipart multipart = new MimeMultipart();
			// 设置消息部分
			multipart.addBodyPart(messageBodyPart);
			// 附件部分
			messageBodyPart = new MimeBodyPart();
			String filename = "file.txt";
			DataSource source = new FileDataSource(filename);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(filename);
			multipart.addBodyPart(messageBodyPart);
			// 发送完整消息
			message.setContent(multipart);

			// 发送消息(邮箱账户需要开启POP3/SMTP服务)
			System.out.println(message.getFileName());
			Transport.send(message);
			System.out.println("Sent message successfully....from runoob.com");
		} catch (MessagingException mex) {
			mex.printStackTrace();
			System.out.println("*****************");
		} catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("##########");
		}
	}

}
