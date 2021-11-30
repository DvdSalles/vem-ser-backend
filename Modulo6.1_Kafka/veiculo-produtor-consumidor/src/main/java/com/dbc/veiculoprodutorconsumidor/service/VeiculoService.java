package com.dbc.veiculoprodutorconsumidor.service;

import com.dbc.veiculoprodutorconsumidor.entity.VeiculoEntity;
import com.dbc.veiculoprodutorconsumidor.repository.VeiculoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.bson.Document;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VeiculoService {
    private final VeiculoRepository veiculoRepository;
    private final ObjectMapper objectMapper;

    public void create(VeiculoEntity entity) {
        veiculoRepository.save(entity);
    }

    public List<Document> listarAnotacoesDoSensor() {
        return veiculoRepository.findAll().stream()
                .map(veiculoEntity -> objectMapper.convertValue(veiculoEntity, Document.class))
                .collect(Collectors.toList());
    }

    public Double mediaDeVelocidade(){
        return veiculoRepository.mediaVelocidade();
    }

    public Double mediaDeRotacao() {
        return veiculoRepository.mediaRotacao();
    }

    public Long contagemDosDocumentos() {
        return veiculoRepository.count();
    }
}
