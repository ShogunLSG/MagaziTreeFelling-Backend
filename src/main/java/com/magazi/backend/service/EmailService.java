package com.magazi.backend.service;

import com.magazi.backend.requestEntity.QuoteRequest;
import jakarta.mail.internet.InternetAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public class EmailService {

    @Autowired
    public JavaMailSender mailSender;

    @Value("${SPRING_MAIL_USERNAME}")
    private String username;

    @Value("${SPRING_MAIL_PASSWORD}")
    private String password;

    @Value("${SPRING_MAIL_RECIPIENT}")
    private String receiver;

    public void sendEmail(QuoteRequest request) throws UnsupportedEncodingException {
        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setTo(receiver);
        mailMessage.setFrom(String.valueOf(new InternetAddress(username,"Magazi Tree Felling Mailer")));
        mailMessage.setSubject("Quote Request from: "+ request.getNames() + " for " + request.getService() );
        mailMessage.setText("Good Day, \n  You have recieved a quote request for " +
                request.getService() + ". This service is requested from the "+ request.getAddress() + " Area. "
                        + "Customer Name: "+ request.getNames()
                        + " Contact the customer on: "+ request.getContactDetails());
        mailSender.send(mailMessage);

    }
}
