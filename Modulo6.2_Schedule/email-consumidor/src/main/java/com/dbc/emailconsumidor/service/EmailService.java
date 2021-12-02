package com.dbc.emailconsumidor.service;


import com.dbc.emailconsumidor.dto.EmailKafkaDTO;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender emailSender;
    @Value("${spring.mail.username}")
    private String remetente;
    private final Configuration configuration;

    public void enviarEmailComTemplate(EmailKafkaDTO emailKafkaDTO) throws MessagingException, IOException, TemplateException {
        try{
            MimeMessage mimeMessage = emailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

            helper.setFrom(remetente);
            helper.setTo(emailKafkaDTO.getDestinatario());
            helper.setSubject(emailKafkaDTO.getAssunto());

            Template template = configuration.getTemplate("email-template.ftl");
            Map<String, Object> dados = new HashMap<>();
            dados.put("mensagem", emailKafkaDTO.getTexto());
            String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, dados);

            helper.setText(html, true);

            emailSender.send(mimeMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}