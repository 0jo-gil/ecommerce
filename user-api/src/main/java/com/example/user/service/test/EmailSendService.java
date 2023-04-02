package com.example.user.service.test;

import com.example.user.client.MailgunClient;
import com.example.user.client.mailgun.SendMailForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSendService {
    private final MailgunClient mailgunClient;

    public String sendEmail() {
        SendMailForm form = SendMailForm.builder()
                .from("portfolio-test@my.com")
                .to("dudwh921112@naver.com")
                .subject("Test Email from 0jo")
                .text("my text")
                .build();
        return mailgunClient.sendEmail(form).getBody();
    }
}
