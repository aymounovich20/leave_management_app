package com.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MailSender {

    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(String email,String subject,String text) {
    		SimpleMailMessage mail  = new SimpleMailMessage();
    		mail.setFrom("Leave-Management-App@gmail.com");
    		mail.setTo(email);
    		
    		mail.setSubject("Welcome on board with leave management app");
    			String texte =
    		" Hello ! 🖐 \n\n "+
    		" 📝 : Once your manager verify your acount you can log in. "+"\n\n"+
    		" LET'S MAKE THE WORLD MORE PRODUCTIVE, TOGETHER. \n ©leave App  "
    				;
    		mail.setText(texte);
    		
    		emailSender.send(mail);
}
}
