package com.dbc.pessoaapi.service;

import com.dbc.pessoaapi.dto.EmailKafkaDTO;
import com.dbc.pessoaapi.dto.PessoaDTO;
import com.dbc.pessoaapi.entity.PessoaEntity;
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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender emailSender;
    @Value("${spring.mail.username}")
    private String remetente;
    private final Configuration configuration;

    public void enviarEmailComTemplate(PessoaDTO pessoaDTO) throws MessagingException, IOException, TemplateException {
        MimeMessage mimeMessage = emailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setFrom(remetente);
        helper.setTo(pessoaDTO.getEmail());
        helper.setSubject("Bem Vindo!");

        Template template = configuration.getTemplate("email-template.ftl");
        Map<String, Object> dados = new HashMap<>();
        dados.put("nome", pessoaDTO.getNome());
        dados.put("idPessoa", pessoaDTO.getIdPessoa());
        dados.put("emailRemetente", remetente);
        String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, dados);

        helper.setText(html, true);

        emailSender.send(mimeMessage);
    }

    public void enviarEmailComTemplateUpdate(PessoaDTO pessoaDTO) throws MessagingException, IOException, TemplateException {
        MimeMessage mimeMessage = emailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setFrom(remetente);
        helper.setTo(pessoaDTO.getEmail());
        helper.setSubject("Mudanças Cadastrais");

        Template template = configuration.getTemplate("email-template-update.ftl");
        Map<String, Object> dados = new HashMap<>();
        dados.put("nome", pessoaDTO.getNome());
        dados.put("emailRemetente", remetente);
        String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, dados);

        helper.setText(html, true);

        emailSender.send(mimeMessage);
    }

    public void enviarEmailComTemplateDelete(PessoaDTO pessoaDTO) throws MessagingException, IOException, TemplateException {
        MimeMessage mimeMessage = emailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setFrom(remetente);
        helper.setTo(pessoaDTO.getEmail());
        helper.setSubject("Cadastro Excluído");

        Template template = configuration.getTemplate("email-template-delete.ftl");
        Map<String, Object> dados = new HashMap<>();
        dados.put("nome", pessoaDTO.getNome());
        dados.put("emailRemetente", remetente);
        String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, dados);

        helper.setText(html, true);

        emailSender.send(mimeMessage);
    }

    public void enviarEmailComTemplateSchedule(PessoaEntity pessoaEntity) throws MessagingException, IOException, TemplateException {
        MimeMessage mimeMessage = emailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setFrom(remetente);
        helper.setTo(pessoaEntity.getEmail());
        helper.setSubject("Temos um presente pra você.");

        Template template = configuration.getTemplate("schedule-template.ftl");
        Map<String, Object> dados = new HashMap<>();
        dados.put("nome", pessoaEntity.getNome());
        dados.put("emailRemetente", remetente);
        String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, dados);

        helper.setText(html, true);

        emailSender.send(mimeMessage);
    }

    public void enviarEmailComTemplateScheduleMarketing(PessoaEntity pessoaEntity) throws MessagingException, IOException, TemplateException {
        MimeMessage mimeMessage = emailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setFrom(remetente);
        helper.setTo(pessoaEntity.getEmail());
        helper.setSubject("Oferta para você!");

        Template template = configuration.getTemplate("schedule-template_marketing.ftl");
        Map<String, Object> dados = new HashMap<>();
        dados.put("nome", pessoaEntity.getNome());
        dados.put("idPessoa", pessoaEntity.getIdPessoa());
        dados.put("emailRemetente", remetente);
        String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, dados);

        helper.setText(html, true);

        emailSender.send(mimeMessage);
    }

    public void enviarEmailComTemplateScheduleAniversario(PessoaEntity pessoaEntity) throws MessagingException, IOException, TemplateException {
        MimeMessage mimeMessage = emailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setFrom(remetente);
        helper.setTo(pessoaEntity.getEmail());
        helper.setSubject("Parabéns!");

        Template template = configuration.getTemplate("schedule-template_aniversario.ftl");
        Map<String, Object> dados = new HashMap<>();
        dados.put("nome", pessoaEntity.getNome());
        dados.put("data", pessoaEntity.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM")));
        dados.put("idade", LocalDate.now().getYear() - pessoaEntity.getDataNascimento().getYear());
        String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, dados);

        helper.setText(html, true);

        emailSender.send(mimeMessage);
    }
    public EmailKafkaDTO enviarEmailComTemplateScheduleKafka(PessoaEntity pessoaEntity) {
        EmailKafkaDTO emailKafkaDTO = new EmailKafkaDTO();
        emailKafkaDTO.setDestinatario(pessoaEntity.getEmail());
        emailKafkaDTO.setAssunto("Atualize seu cadastro!");
        emailKafkaDTO.setTexto("Olá " +pessoaEntity.getNome()+ ", <br><br>" +
                "Estamos muito felizes que você está em nosso sistema. Para que possamos enviá-lo um brinde" +
                " exclusivo, por gentileza, adicione ou atualize o seu endereço no seu cadastro.");

        return emailKafkaDTO;
    }

    public EmailKafkaDTO enviarEmailComTemplateScheduleMarketingKafka(PessoaEntity pessoaEntity) {
        EmailKafkaDTO emailKafkaDTO = new EmailKafkaDTO();
        emailKafkaDTO.setDestinatario(pessoaEntity.getEmail());
        emailKafkaDTO.setAssunto("Promoção!");
        emailKafkaDTO.setTexto("Olá " +pessoaEntity.getNome()+ ", <br><br>" +
                "Selecionamos algumas das nossas super promoções de natal na nossa plataforma especialmente para você. =) <br><br>\n" +
                " - Na compra de 1 CD do Chitãozinho e Xororó, ganhe 1 do Milionário e José Rico.<br><br>\n " +
                "!!!Promoção especial para quem cantar a música 'Alô' no caixa, <br><br>" +
                " LEVA DE BRINDE UM POSTER DO XITÃOZINHO E XORORÓ!!! <br><br>" +
                " - Na locação de um filme VHS, a outra locação é grátis.<br><br>\n" +
                " - Fita de Super Nitendo com 50% de desconto.<br><br>\n" +
                " Aproveite!");

        return emailKafkaDTO;
    }

    public EmailKafkaDTO enviarEmailComTemplateScheduleAniversarioKafka(PessoaEntity pessoaEntity) {
        EmailKafkaDTO emailKafkaDTO = new EmailKafkaDTO();
        emailKafkaDTO.setDestinatario(pessoaEntity.getEmail());
        emailKafkaDTO.setAssunto("Parabéns");
        emailKafkaDTO.setTexto("Olá " +pessoaEntity.getNome()+ ", <br><br>" +
                "Essa data " +pessoaEntity.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM"))+ " também é especial para nós do Vem Ser. <br><br>\n" +
                " Estamos comemorando juntos com você. =]<br><br>\n" +
                " Desejamos um feliz aniversário, que tenham sido "+ (LocalDate.now().getYear() - pessoaEntity.getDataNascimento().getYear()) +" anos de muito<br><br>\n" +
                " sucesso, alegria, felicidade e muitas realizações.<br><br>\n" +
                " Forte Abraço! <br><br>\n" +
                " Vem Ser 2021/2.");

        return emailKafkaDTO;
    }
}
