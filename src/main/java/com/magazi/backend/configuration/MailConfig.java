//package com.magazi.backend.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.JavaMailSenderImpl;
//
//import java.util.Properties;
//
//@Configuration
//public class MailConfig {
//
//    @Bean
//    public JavaMailSender javaMailSender(){
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setHost("smtp.office365.com");
//        mailSender.setUsername("mmatismbale@outlook.com");
//        mailSender.setPassword("JanMalema@01");
//        Properties properties = mailSender.getJavaMailProperties();
//        properties.propertyNames();
//        mailSender.setPort(587);
//        return mailSender;
//    }
//
//}
