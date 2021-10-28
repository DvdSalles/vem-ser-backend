package com.dbc.pessoaapi.controller;

import com.dbc.pessoaapi.entity.Endereco;
import com.dbc.pessoaapi.exceptions.RegraDeNegocioException;
import com.dbc.pessoaapi.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/endereco")
@Validated
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> list() {
        return enderecoService.list();
    }

    @GetMapping("/{idPessoa}/pessoa")
    public List<Endereco> listEnderecoPorPessoa(@PathVariable("idPessoa")Integer idPessoa) {
        return enderecoService.listEnderecoPorPessoa(idPessoa);
    }

    @GetMapping("/{idEndereco}")
    public Endereco listEnderecoPorId(@PathVariable("idEndereco") Integer idEndereco) throws RegraDeNegocioException {
        return enderecoService.listEnderecoPorId(idEndereco);
    }


    @PostMapping("/{idPessoa}")
    public Endereco create(@PathVariable("idPessoa") Integer idPessoa,
                           @RequestBody @Valid Endereco endereco) throws RegraDeNegocioException {
        return enderecoService.create(idPessoa, endereco);
    }

    @PutMapping("/{id}")
    public Endereco update(@PathVariable("id") Integer idEndereco,
                           @RequestBody @Valid Endereco enderecoAtualizar) throws RegraDeNegocioException {
        return enderecoService.update(idEndereco, enderecoAtualizar);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer idEndereco) throws RegraDeNegocioException {
        enderecoService.delete(idEndereco);
    }
}
