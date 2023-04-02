package com.example.user.client.service;
import com.example.user.client.MailgunClient;
import com.example.user.client.mailgun.SendMailForm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class EmailSendServiceTest {

    @Autowired
    private MailgunClient mailgunClient;
    @Test
    public void sendEmail() {
        SendMailForm form = SendMailForm.builder()
                .from("dudwh921112@naver.com")
                .to("dudwh921112@naver.com")
                .subject("Mailgun test")
                .text("test")
                .build();

        String response = mailgunClient.sendEmail(form).getBody();

        Assert.isTrue(response != null);
    }
}