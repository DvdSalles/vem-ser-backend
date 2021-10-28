package com.dbc.pessoaapi.controller;

import com.dbc.pessoaapi.entity.Contato;
import com.dbc.pessoaapi.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class ContatoController {
    @Autowired
    private ContatoService contatoService;


    @PostMapping("/{idPessoa}")
    public Contato create(@PathVariable("idPessoa") Integer idPessoa,
                          @RequestBody Contato contato) {
        return contatoService.create(idPessoa, contato);
    }

    @GetMapping
    public List<Contato> list() {
        return contatoService.list();
    }

    @GetMapping("/{idPessoa}")
    public List<Contato> listPorIdPessoa(@PathVariable("idPessoa") Integer idPessoa) {
        return contatoService.listPorIdPessoa(idPessoa);
    }

    @PutMapping("/{idContato}")
    public Contato update(@PathVariable("idContato") Integer idContato,
                          @RequestBody Contato contatoAtualizar) throws Exception {
        return contatoService.update(idContato, contatoAtualizar);
    }

    @DeleteMapping("/{idContato}")
    public Contato delete(@PathVariable("idContato") Integer idContato) throws Exception {
        return contatoService.delete(idContato);
    }


}
