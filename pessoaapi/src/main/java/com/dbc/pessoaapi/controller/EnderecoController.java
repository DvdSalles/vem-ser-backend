package com.dbc.pessoaapi.controller;

import com.dbc.pessoaapi.entity.Endereco;
import com.dbc.pessoaapi.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
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
    public Endereco listEnderecoPorId(@PathVariable("idEndereco") Integer idEndereco) throws Exception {
        return enderecoService.listEnderecoPorId(idEndereco);
    }


    @PostMapping("/{idPessoa}")
    public Endereco create(@PathVariable("idPessoa") Integer idPessoa,
                           @RequestBody Endereco endereco) {
        return enderecoService.create(idPessoa, endereco);
    }

    @PutMapping("/{id}")
    public Endereco update(@PathVariable("id") Integer idEndereco,
                           @RequestBody Endereco enderecoAtualizar) throws Exception {
        return enderecoService.update(idEndereco, enderecoAtualizar);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer idEndereco) throws Exception {
        enderecoService.delete(idEndereco);
    }
}
