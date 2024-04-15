package com.magazi.backend.controller;

import com.magazi.backend.requestEntity.QuoteRequest;
import com.magazi.backend.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
public class MagaziController {

    @Autowired
    public EmailService emailService;

    @PostMapping("/requestQuote")
    public void requestQuote(@RequestBody QuoteRequest request) throws UnsupportedEncodingException {
        emailService.sendEmail(request);
        System.out.println("Email successfully sent!");
    }
}
