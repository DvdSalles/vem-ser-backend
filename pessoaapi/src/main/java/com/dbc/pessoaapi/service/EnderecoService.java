package com.dbc.pessoaapi.service;

import com.dbc.pessoaapi.entity.Endereco;
import com.dbc.pessoaapi.exceptions.RegraDeNegocioException;
import com.dbc.pessoaapi.repository.EnderecoRepository;
import com.dbc.pessoaapi.repository.PessoaRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Endereco> list() {
        return enderecoRepository.list();
    }

    public List<Endereco> listEnderecoPorPessoa(Integer idPessoa) {
        return enderecoRepository.listEnderecoPorPessoa(idPessoa);
    }

    public Endereco listEnderecoPorId(Integer idEndereco) throws RegraDeNegocioException {
        return enderecoRepository.listEnderecoPorId(idEndereco);
    }

    public Endereco create(Integer idPessoa, Endereco endereco) throws RegraDeNegocioException {
        pessoaRepository.buscarPorId(idPessoa);
        endereco.setIdPessoa(idPessoa);
        return enderecoRepository.create(endereco);
    }

    public Endereco update(Integer idEndereco, Endereco enderecoAtualizar) throws RegraDeNegocioException {
        return enderecoRepository.update(idEndereco, enderecoAtualizar);
    }

    public void delete(Integer idEndereco) throws RegraDeNegocioException {
        enderecoRepository.delete(idEndereco);
    }
}
