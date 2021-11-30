package com.dbc.veiculoprodutorconsumidor.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class VeiculoDTO {
    private LocalDateTime dataLeitura;
    private Double velocidade;
    private Integer rotacao;
    private Boolean sensorFrenagem;
}
