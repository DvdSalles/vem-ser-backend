package com.dbc.pessoaapi.dto;

import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
public class PessoaDTO extends PessoaCreateDTO{
    private Integer idPessoa;
}
