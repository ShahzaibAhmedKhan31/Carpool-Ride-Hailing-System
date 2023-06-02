/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
    import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
/**
 *
 * @author HP
 */
public class SendEmail {
    public void send2(String s){
        String sendEmail= s;
        final String username="KarpoolSystem@gmail.com";///senders email
        final String password="Zxcv@321"; ////senders password
Properties properties= new Properties();
properties.put("mail.smtp.auth", "true");
properties.put("mail.smtp.starttls.enable" , "true");
properties.put("mail.smtp.host", "smtp.gmail.com");
properties.put("mail.smtp.port", "587");
properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");

Session session =Session.getInstance(properties, new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(username,password);
    }
});

try {
   NewLogin obj= new NewLogin();
    Verify EmailObj=new Verify();
    String FromEmail="KarpoolSystem@gmail.com";
    MimeMessage message=new MimeMessage(session);
    message.setFrom(new InternetAddress(FromEmail)); ////senders email
    message.addRecipient(Message.RecipientType.TO,
            new InternetAddress(sendEmail)); ///customer email
    message.setSubject("Verification details");
    message.setText(" ");
    MimeBodyPart messagebodypart = new MimeBodyPart();
    messagebodypart.setText("You have booked " + (EmailObj.counter + 1) + " number of Rides. Your Booking Details are in the Attachments. Thank you....." );
    Multipart emailcontant = new MimeMultipart();
   
    if (EmailObj.counter==0){
        MimeBodyPart txtAttachment1=new MimeBodyPart();
        txtAttachment1.attachFile(EmailObj.EmailQueue.poll());
        emailcontant.addBodyPart(txtAttachment1);
    }
     if (EmailObj.counter==1){
        MimeBodyPart txtAttachment1=new MimeBodyPart();
        MimeBodyPart txtAttachment2=new MimeBodyPart();
        txtAttachment1.attachFile(EmailObj.EmailQueue.poll());
        txtAttachment2.attachFile(EmailObj.EmailQueue.poll());
        emailcontant.addBodyPart(txtAttachment1);
        emailcontant.addBodyPart(txtAttachment2);
    }
          if (EmailObj.counter==2){
        MimeBodyPart txtAttachment1=new MimeBodyPart();
        MimeBodyPart txtAttachment2=new MimeBodyPart();
        MimeBodyPart txtAttachment3=new MimeBodyPart();
        txtAttachment1.attachFile(EmailObj.EmailQueue.poll());
        txtAttachment2.attachFile(EmailObj.EmailQueue.poll());
        txtAttachment3.attachFile(EmailObj.EmailQueue.poll());
        emailcontant.addBodyPart(txtAttachment1);
        emailcontant.addBodyPart(txtAttachment2);
        emailcontant.addBodyPart(txtAttachment3);
    }
     
    emailcontant.addBodyPart(messagebodypart);
    //>>>>>>>>>>
    message.setContent(emailcontant);
    Transport.send(message);
    System.out.println("Sent message");
}
catch (MessagingException e) {
    e.printStackTrace();   
}      
catch (IOException ex) {
            Logger.getLogger(SendEmail.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
