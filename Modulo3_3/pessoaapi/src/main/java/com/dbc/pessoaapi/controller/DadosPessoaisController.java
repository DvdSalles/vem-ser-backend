package com.dbc.pessoaapi.controller;

import com.dbc.pessoaapi.dto.DadosPessoaisDTO;
import com.dbc.pessoaapi.service.DadosPessoaisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dados-pessoais")
@RequiredArgsConstructor
public class DadosPessoaisController {
    private final DadosPessoaisService dadosPessoaisService;

    @GetMapping
    public List<DadosPessoaisDTO> list() {
        return dadosPessoaisService.list();
    }

    @GetMapping("/get-por-cpf")
    public DadosPessoaisDTO getPorCpf(@RequestParam("CPF") String cpf) {
        return dadosPessoaisService.getPorCpf(cpf);
    }

    @PostMapping
    public DadosPessoaisDTO post(@RequestBody DadosPessoaisDTO dadosPessoaisDTO) {
        return dadosPessoaisService.post(dadosPessoaisDTO);
    }

    @PutMapping("/atualizar-por-cpf")
    public DadosPessoaisDTO update(@RequestParam("CPF") String cpf,@RequestBody DadosPessoaisDTO dadosPessoaisDTO) {
        return dadosPessoaisService.update(dadosPessoaisDTO, cpf);
    }

    @DeleteMapping("/deletar-por-cpf")
    public void delete(@RequestParam("CPF") String cpf) {
        dadosPessoaisService.delete(cpf);
    }
}
