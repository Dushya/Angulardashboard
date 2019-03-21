package com.hackfse.feedback.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaEmail {

	Session mailSession;

	public void setMailServerProperties() {
		Properties emailProperties = System.getProperties();
		emailProperties.put("mail.smtp.port", "587");
		emailProperties.put("mail.smtp.auth", "true");
		emailProperties.put("mail.smtp.starttls.enable", "true");
		mailSession = Session.getDefaultInstance(emailProperties, null);
	}

	private MimeMessage draftEmailMessage(String toEmails, String emailSubject, String emailBody)
			throws AddressException, MessagingException {
		MimeMessage emailMessage = new MimeMessage(mailSession);
		emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails));
		emailMessage.setSubject(emailSubject);
		emailMessage.setContent(emailBody, "text/html");
		return emailMessage;
	}

	public void sendEmail(String toEmails, String emailSubject, String emailBody)
			throws AddressException, MessagingException {
		
		String fromUser = "hackoverflow3@gmail.com";
		String fromUserEmailPassword = "hackathon";
		String emailHost = "74.125.133.109";
		Transport transport = mailSession.getTransport("smtp");
		transport.connect(emailHost, fromUser, fromUserEmailPassword);
		MimeMessage emailMessage = draftEmailMessage(toEmails, emailSubject, emailBody);
		transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
		transport.close();
		System.out.println("Email sent successfully.");
	}

}
