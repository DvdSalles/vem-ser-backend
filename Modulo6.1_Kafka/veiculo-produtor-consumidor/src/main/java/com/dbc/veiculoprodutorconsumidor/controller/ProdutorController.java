package com.dbc.veiculoprodutorconsumidor.controller;

import com.dbc.veiculoprodutorconsumidor.dto.VeiculoDTO;
import com.dbc.veiculoprodutorconsumidor.kafka.Producer;
import com.dbc.veiculoprodutorconsumidor.service.ConsumerService;
import com.dbc.veiculoprodutorconsumidor.service.VeiculoService;
import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.RequiredArgsConstructor;
import org.bson.Document;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class ProdutorController {
    private final Producer producer;
    private final VeiculoService veiculoService;

    @PostMapping("/enviar")
    public void enviar(String mensagem) {
        producer.sendMessage(mensagem);
    }

    @PostMapping("/sensor-veiculo")
    public void sensorVeiculo(@RequestBody VeiculoDTO veiculoDTO) throws JsonProcessingException {
        producer.sendMessageDTO(veiculoDTO);
    }
    @GetMapping("/listar")
    public List<Document> listarTudo() {
       return veiculoService.listarAnotacoesDoSensor();
    }

    @GetMapping("/media-velocidade")
    public Double mediaDeVelocidade() {
        return veiculoService.mediaDeVelocidade();
    }

    @GetMapping("/media-rotacao")
    public Double mediaDeRotacao() {
        return veiculoService.mediaDeRotacao();
    }

    @GetMapping("/contagem-dos-documentos")
    public Long contagemDosDocumentos() {
        return veiculoService.contagemDosDocumentos();
    }
}