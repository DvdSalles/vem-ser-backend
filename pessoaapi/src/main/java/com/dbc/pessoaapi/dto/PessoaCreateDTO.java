package com.dbc.pessoaapi.dto;

import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
public class PessoaCreateDTO {
    @NotEmpty
    @NotBlank
    private String nome;

    @NotNull
    @Past
    private LocalDate dataNascimento;

    @Size(max = 11, min=11, message = "CPF deve conter 11 caracteres")
    @NotNull
    private String cpf;

    @Email
    @NotNull
    private String email;
}
