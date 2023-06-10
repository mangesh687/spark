package com.example1.app;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;



public class Print1To25 {

	public static void main(String[] args) {
		// Recipient's email ID needs to be mentioned.
	      String to = "mangeshpakhale2016@gmail.com";

	      // Sender's email ID needs to be mentioned
	      String from = "mangeshpakhale2016@gmail.com";

	      // Assuming you are sending email from localhost
	      String host = "localhost";

	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try {
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("This is the Subject Line!");

	         // Now set the actual message
	         message.setText("This is actual message");

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      } catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	
//for(int i=1;i<=25;i++) {
//	System.out.println(i);
//}
}

}
