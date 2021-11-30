package com.dbc.chatkafka.controller;


import com.dbc.chatkafka.dto.ChatCreateDTO;
import com.dbc.chatkafka.dto.ChatDTO;
import com.dbc.chatkafka.kafka.Producer;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat-kafka")
@RequiredArgsConstructor
public class ProducerController {
    private final Producer producer;

    @PostMapping("/geral")
    private void enviar(@RequestBody ChatCreateDTO chatCreateDTO) throws JsonProcessingException {
        producer.sendChatDTO(chatCreateDTO);
    }

    @PostMapping("/privado")
    private void enviarPrivado(@RequestBody ChatCreateDTO chatCreateDTO, @RequestParam("nome da pessoa") String nome) throws JsonProcessingException {
        producer.sendChatDTOPrivado(chatCreateDTO, nome);
    }
}