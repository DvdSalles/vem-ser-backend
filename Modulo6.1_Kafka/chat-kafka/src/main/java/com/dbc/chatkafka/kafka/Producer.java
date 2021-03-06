package com.dbc.chatkafka.kafka;

import com.dbc.chatkafka.dto.ChatCreateDTO;
import com.dbc.chatkafka.dto.ChatDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.kafka.support.SendResult;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
@RequiredArgsConstructor
@Slf4j
public class Producer {
    private final KafkaTemplate<String, String> stringKafkaTemplate;
    private final ObjectMapper objectMapper;

    @Value(value = "${kafka.topic.geral}")
    private String topicoGeral;

    @Value(value = "${kafka.topic.david}")
    private String topicoDavid;

    private void send(String mensagem, String topico) {
        Message<String> message = MessageBuilder.withPayload(mensagem)
                .setHeader(KafkaHeaders.TOPIC, topico)
                .setHeader(KafkaHeaders.MESSAGE_KEY, UUID.randomUUID().toString())
                .build();

        ListenableFuture<SendResult<String, String>> send = stringKafkaTemplate.send(message);

        send.addCallback(new ListenableFutureCallback<>() {
            @Override
            public void onFailure(Throwable ex) {
                log.error(" Erro ao enviar mensagem ao kafka, texto: {}", mensagem);
            }

            @Override
            public void onSuccess(SendResult<String, String> result) {
                log.info(" Mensagem enviada com sucesso para o kafka com o texto: {}", mensagem);
            }
        });
    }


    public void sendMessage(String mensagem) {
        send(mensagem, topicoGeral);
    }

    public void sendChatDTO(ChatCreateDTO chatCreateDTO) throws JsonProcessingException {
        ChatDTO chatDTO = objectMapper.convertValue(chatCreateDTO, ChatDTO.class);
        chatDTO.setUsuario("David");
        chatDTO.setDataCriacao(LocalDateTime.now());
        String payload = objectMapper.writeValueAsString(chatDTO);
        send(payload, topicoGeral);
    }

    public void sendChatDTOPrivado(ChatCreateDTO chatCreateDTO, String nome) throws JsonProcessingException {
        ChatDTO chatDTO = objectMapper.convertValue(chatCreateDTO, ChatDTO.class);
        chatDTO.setUsuario("David");
        chatDTO.setDataCriacao(LocalDateTime.now());
        String payload = objectMapper.writeValueAsString(chatDTO);
        send(payload, "chat-" + nome);
    }
}