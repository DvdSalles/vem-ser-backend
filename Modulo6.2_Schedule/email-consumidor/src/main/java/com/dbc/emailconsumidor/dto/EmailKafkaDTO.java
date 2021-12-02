package com.dbc.emailconsumidor.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailKafkaDTO {
    private String destinatario;
    private String assunto;
    private String texto;
}