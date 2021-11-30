package com.dbc.chatkafka.service;


import com.dbc.chatkafka.dto.ChatDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
@RequiredArgsConstructor
public class ConsumerService {
    private final KafkaTemplate<String, String> stringKafkaTemplate;
    private final ObjectMapper objectMapper;

    @KafkaListener(
            topics = "${kafka.topic.geral}",
            groupId = "${kafka.group-id}",
            containerFactory = "listenerContainerFactory",
            clientIdPrefix = "geral"
    )
    public void consumeGeral(@Payload String mensagem,
                           @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
                           @Header(KafkaHeaders.OFFSET) Long offset) throws JsonProcessingException {
        ChatDTO chatDTO = objectMapper.readValue(mensagem, ChatDTO.class);
        log.info("{} {}(geral) -> disse: {}", chatDTO.getDataCriacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), chatDTO.getUsuario(), chatDTO.getMensagem());
    }

    @KafkaListener(
            topics = "${kafka.topic.david}",
            groupId = "${kafka.group-id}",
            containerFactory = "listenerContainerFactory",
            clientIdPrefix = "privado"
    )
    public void consumeDto(@Payload String mensagem,
                           @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
                           @Header(KafkaHeaders.OFFSET) Long offset) throws JsonProcessingException {
        ChatDTO chatDTO = objectMapper.readValue(mensagem, ChatDTO.class);
        log.info("{} {}(privado) -> disse: {}", chatDTO.getDataCriacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), chatDTO.getUsuario(), chatDTO.getMensagem());
    }

}