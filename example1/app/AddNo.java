package com.example1.app;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class AddNo {

	public static void main(String[] args) {
		String to = "mangeshpakhale2016.com";//change accordingly  
	      String from = "mangeshpakhale687@gmail.com";//change accordingly  
	      String host = "localhost";//or IP address  
	  
	     //Get the session object  
	      Properties properties = System.getProperties();  
	      properties.setProperty("mail.smtp.host", host);  
	      Session session = Session.getDefaultInstance(properties);  
	  
	     //compose the message  
	      try{  
	         MimeMessage message = new MimeMessage(session);  
	         message.setFrom(new InternetAddress(from));  
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
	         message.setSubject("Ping");  
	         message.setText("Hello, this is example of sending email  ");  
	  
	         // Send message  
	         Transport.send(message);  
	         System.out.println("message sent successfully....");  
	  
	      }catch (MessagingException mex) {mex.printStackTrace();}  
	   }  
}  
//		System.out.println("enter the first number ");
//	Scanner sc=new Scanner(System.in);
//	int a=sc.nextInt();
//	System.out.println("enter the sencond number");
//	int b=sc.nextInt();
//	int s=a+b;
//	System.out.println("sum of two no.");
//	System.out.println(s);
//	    int n = 10, firstTerm = 0, secondTerm = 1;
//	    System.out.println("Fibonacci Series till " + n + " terms:");
//
//	    for (int i = 1; i <= n; i++) {
//	      System.out.print(firstTerm + ", ");
//
//	      // compute the next term
//	      int nextTerm = firstTerm + secondTerm;
//	      firstTerm = secondTerm;
//	      secondTerm = nextTerm;
//	    }
	//}


