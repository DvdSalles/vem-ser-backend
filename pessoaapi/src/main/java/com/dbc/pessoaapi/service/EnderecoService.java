package com.dbc.pessoaapi.service;

import com.dbc.pessoaapi.entity.Endereco;
import com.dbc.pessoaapi.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> list() {
        return enderecoRepository.list();
    }

    public List<Endereco> listEnderecoPorPessoa(Integer idPessoa) {
        return enderecoRepository.listEnderecoPorPessoa(idPessoa);
    }

    public Endereco listEnderecoPorId(Integer idEndereco) throws Exception {
        return enderecoRepository.listEnderecoPorId(idEndereco);
    }

    public Endereco create(Integer idPessoa, Endereco endereco) {
        endereco.setIdPessoa(idPessoa);
        return enderecoRepository.create(endereco);
    }

    public Endereco update(Integer idEndereco, Endereco enderecoAtualizar) throws Exception {
        return enderecoRepository.update(idEndereco, enderecoAtualizar);
    }

    public void delete(Integer idEndereco) throws Exception {
        enderecoRepository.delete(idEndereco);
    }
}
