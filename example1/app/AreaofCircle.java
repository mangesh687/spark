package com.example1.app;


import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class AreaofCircle{
    public static void main(String[] args) {
      String to = "mangeshpakhale2016@gmail.com";
      String from = "mangeshpakhale2016@gmail.com";
      String host = "smtp.gmail.com";

      Properties properties = System.getProperties();
      properties.put("mail.smtp.host", host);
      properties.put("mail.smtp.port", "465");
      properties.put("mail.smtp.ssl.enable", "true");
      properties.put("mail.smtp.auth", "true");

      Session session = Session.getInstance(properties, new javax.mail.Authenticator(){
        protected PasswordAuthentication getPasswordAuthentication() {
          return new PasswordAuthentication("receiver@gmail.com", "*******");
        }
      });

      try {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject("This is the email subject");
        message.setText("This is the email body");

        Transport.send(message);
      } catch (MessagingException mex) {
        mex.printStackTrace();
      }
   }
}
