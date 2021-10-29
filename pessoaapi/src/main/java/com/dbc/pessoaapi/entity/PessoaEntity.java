package com.dbc.pessoaapi.entity;

import lombok.*;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PessoaEntity {
    private Integer idPessoa;

    @NotEmpty
    @NotBlank
    private String nome;

    @NotNull
    @Past
    private LocalDate dataNascimento;

    @Size(max = 11, min=11, message = "CPF deve conter 11 caracteres")
    @NotNull
    private String cpf;

}