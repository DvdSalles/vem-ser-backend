package com.dbc.pessoaapi.service;

import com.dbc.pessoaapi.entity.Endereco;
import com.dbc.pessoaapi.repository.EnderecoRepository;
import org.apache.commons.lang3.StringUtils;
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

    public Endereco create(Integer idPessoa, Endereco endereco) throws Exception {
        if(StringUtils.isBlank(endereco.getLogradouro())) {
            throw new Exception("Logradouro não informado.");
        } else if (StringUtils.isBlank(endereco.getCidade())) {
            throw new Exception("Cidade não informada.");
        } else if (StringUtils.isBlank(endereco.getCep()) || StringUtils.length(endereco.getCep()) != 8) {
            throw new Exception("CEP não inserido ou Faltando digitos.");
        }
        endereco.setIdPessoa(idPessoa);
        return enderecoRepository.create(endereco);
    }

    public Endereco update(Integer idEndereco, Endereco enderecoAtualizar) throws Exception {
        if(StringUtils.isBlank(enderecoAtualizar.getLogradouro())) {
            throw new Exception("Logradouro não informado.");
        } else if (StringUtils.isBlank(enderecoAtualizar.getCidade())) {
            throw new Exception("Cidade não informada.");
        } else if (StringUtils.isBlank(enderecoAtualizar.getCep()) || StringUtils.length(enderecoAtualizar.getCep()) != 8) {
            throw new Exception("CEP não inserido ou Faltando digitos.");
        }
        return enderecoRepository.update(idEndereco, enderecoAtualizar);
    }

    public void delete(Integer idEndereco) throws Exception {
        enderecoRepository.delete(idEndereco);
    }
}
