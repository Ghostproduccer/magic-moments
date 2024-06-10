package com.magicmoments.backendapi.service.srv;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendHtmlEmail(String to, String subject, String name, String body, String footer) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");

        String htmlContent = "<html>" +
                "<body style='font-family: Arial, sans-serif;'>" +
                "<h2 style='text-align: center;'>¡Hola, " + name + "!</h2>" +
                "<p>" + body.replace("\n", "<br>") + "</p>" +
                "<p style='text-align: center; font-size: small;'>" + footer + "</p>" +
                "</body>" +
                "</html>";

        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(htmlContent, true);
        helper.setFrom("rdiazmarey@gmail.com");

        mailSender.send(mimeMessage);
    }

}
