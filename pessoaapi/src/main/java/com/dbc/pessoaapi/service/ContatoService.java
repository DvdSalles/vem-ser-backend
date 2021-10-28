package com.dbc.pessoaapi.service;

import com.dbc.pessoaapi.entity.Contato;
import com.dbc.pessoaapi.entity.Pessoa;
import com.dbc.pessoaapi.exceptions.RegraDeNegocioException;
import com.dbc.pessoaapi.repository.ContatoRepository;
import com.dbc.pessoaapi.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository contatoRepository;
    @Autowired
    private PessoaRepository pessoaRepository;


    public Contato create(Integer idPessoa, Contato contato) throws RegraDeNegocioException {
        pessoaRepository.buscarPorId(idPessoa);
        contato.setIdPessoa(idPessoa);
        return contatoRepository.create(contato);
    }

    public List<Contato> list(){
        return contatoRepository.list();
    }

    public List<Contato> listPorIdPessoa(Integer idPessoa) {
        return contatoRepository.listPorIdPessoa(idPessoa);
    }

    public Contato update(Integer idContato, Contato contatoAtualizar) throws RegraDeNegocioException{
        return contatoRepository.update(idContato, contatoAtualizar);
    }

    public Contato delete(Integer idContato) throws RegraDeNegocioException{
        return contatoRepository.delete(idContato);
    }
}
