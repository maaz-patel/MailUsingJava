package demo.EmailSending;

import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class Email 
{
	public boolean sendEmail(String to,String from,String subject,String text)
	{
		boolean flag=false;
		
		Properties pr=new Properties();
		pr.put("mail.smtp.auth",true);
		pr.put("mail.smtp.starttls.enable",true);
		pr.put("mail.smtp.port","587");
		pr.put("mail.smtp.host","smtp.gmail.com");
		
		 final String user="patelmaaz6394@gmail.com";
		 final String pass="gutk uybd kalo ddxi";
		
		Session session=Session.getInstance(pr, new Authenticator()
		{
			protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user,pass);
		}
		});
		
		try
		{
			Message message=new MimeMessage(session);
			message.setRecipient(Message.RecipientType.TO,new InternetAddress(to));
			message.setFrom(new InternetAddress(from));
			message.setSubject(subject);
			message.setText(text);
			
			Transport.send(message);
			flag=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return flag;
	} 
}
