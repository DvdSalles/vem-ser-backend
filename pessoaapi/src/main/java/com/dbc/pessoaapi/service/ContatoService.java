package com.dbc.pessoaapi.service;

import com.dbc.pessoaapi.entity.Contato;
import com.dbc.pessoaapi.repository.ContatoRepository;

import java.util.List;

public class ContatoService {
    private ContatoRepository contatoRepository;

    public ContatoService() {
        contatoRepository = new ContatoRepository();
    }

    public Contato create(Integer idPessoa, Contato contato) {
        contato.setIdPessoa(idPessoa);
        return contatoRepository.create(contato);
    }

    public List<Contato> list(){
        return contatoRepository.list();
    }

    public List<Contato> listPorIdPessoa(Integer idPessoa) {
        return contatoRepository.listPorIdPessoa(idPessoa);
    }

    public Contato update(Integer idContato, Contato contatoAtualizar) throws Exception{
        return contatoRepository.update(idContato, contatoAtualizar);
    }

    public Contato delete(Integer idContato) throws Exception{
        return contatoRepository.delete(idContato);
    }
}
