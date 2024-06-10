package com.magicmoments.backendapi.controllers;


import com.magicmoments.backendapi.service.srv.EmailService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;

    @GetMapping("/send-html-email")
    public String sendHtmlEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String name, @RequestParam String body, @RequestParam String footer) {
        try {
            emailService.sendHtmlEmail(to, subject, name, body, footer);
            return "HTML Email sent successfully";
        } catch (MessagingException e) {
            e.printStackTrace();
            return "Error while sending HTML email";
        }
    }

}
