package com.hackfse.feedback;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hackfse.feedback.model.RegisteredNotParticipated;
import com.hackfse.feedback.service.JavaEmail;
import com.hackfse.feedback.spring.config.AppConfig;
import com.hackfse.feedback.spring.dao.RegisteredNotParticipatedDAO;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		JavaEmail javaEmail = new JavaEmail();
		javaEmail.setMailServerProperties();

		RegisteredNotParticipatedDAO registeredNotParticipatedDAO = context.getBean(RegisteredNotParticipatedDAO.class);

		System.out.println("List of person for whom feedback needs to be sent");
		for (RegisteredNotParticipated regnotpart : registeredNotParticipatedDAO.getAllRegisteredNotParticipated()) {
			try {
				System.out.println("regnotpart"+regnotpart.getBeneficiary_name());
				String emailbody = "<h3>Hello " + regnotpart.getBeneficiary_name()
						+ "</h3><br> <h4>You had registered for the " + regnotpart.getEvent_name() + " event on "
						+ regnotpart.getEvent_date() + ".</h4><br>  <h4>We would like to know the "
						+ "reason for not joining the event to understand if the team which created this event has some room for improvement in their process, so that we get 100%"
						+ " participation from registered attendees.</h4><br> <h4>Click here to provide feedback"
						+ " http://localhost:4200/registeredNotParticipated?firstParamKey=" + regnotpart.getEvent_id()
						+ "&secondParamKey=" + regnotpart.getEmployee_id() + "</h4>";

				javaEmail.sendEmail("hackoverflow3@gmail.com",
						"Feedback for the " + regnotpart.getEvent_name() + " event", emailbody);
				registeredNotParticipatedDAO.updateRegisteredNotParticipated(regnotpart);
			} catch (AddressException e) {
				e.printStackTrace();
			} catch (MessagingException e) {
				e.printStackTrace();
			}
		}

		context.close();
	}
}
