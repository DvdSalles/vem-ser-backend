package com.dbc.pessoaapi.service;

import com.dbc.pessoaapi.dto.PessoaCreateDTO;
import com.dbc.pessoaapi.dto.PessoaDTO;
import com.dbc.pessoaapi.entity.PessoaEntity;
import com.dbc.pessoaapi.exceptions.RegraDeNegocioException;
import com.dbc.pessoaapi.repository.PessoaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PessoaService {
    private final PessoaRepository pessoaRepository;
    private final ObjectMapper objectMapper;


    public PessoaDTO create(PessoaCreateDTO pessoaCreateDTO) throws RegraDeNegocioException {
//        if(StringUtils.isBlank(pessoa.getNome())) {
//            throw new Exception("Nome não informado!");
//        } else if(ObjectUtils.isEmpty(pessoa.getDataNascimento())) {
//            throw new Exception("Data de nascimento não informada!");
//        }else if(StringUtils.isBlank(pessoa.getCpf()) || StringUtils.length(pessoa.getCpf()) != 11) {
//            throw new Exception("CPF não inserido corretamente.");
//        }
        PessoaEntity pessoaEntity = objectMapper.convertValue(pessoaCreateDTO, PessoaEntity.class);
        PessoaEntity pessoaCriada = pessoaRepository.create(pessoaEntity);

        PessoaDTO pessoaDTO = objectMapper.convertValue(pessoaCriada, PessoaDTO.class);
        return pessoaDTO;
    }

    public List<PessoaDTO> list(){
        return pessoaRepository.list().stream()
                .map(pessoa -> objectMapper.convertValue(pessoa, PessoaDTO.class))
                .collect(Collectors.toList());
    }

    public PessoaDTO update(Integer id,
                               PessoaCreateDTO pessoaCreateDTO) throws RegraDeNegocioException {
//        if(StringUtils.isBlank(pessoaAtualizar.getNome())) {
//            throw new RegraDeNegocioException("Nome não informado!");
//        } else if(ObjectUtils.isEmpty(pessoaAtualizar.getDataNascimento())) {
//            throw new RegraDeNegocioException("Data de nascimento não informada!");
//        }else if(StringUtils.isBlank(pessoaAtualizar.getCpf()) || StringUtils.length(pessoaAtualizar.getCpf()) != 11) {
//            throw new RegraDeNegocioException("CPF não inserido corretamente.");
//        }
        PessoaEntity pessoaEntity = objectMapper.convertValue(pessoaCreateDTO, PessoaEntity.class);
        PessoaEntity pessoaAtulizada = pessoaRepository.update(id, pessoaEntity);
        PessoaDTO pessoaDTO = objectMapper.convertValue(pessoaAtulizada, PessoaDTO.class);
        return pessoaDTO;
    }

    public void delete(Integer id) throws RegraDeNegocioException {
        pessoaRepository.delete(id);
    }

    public List<PessoaDTO> listByName(String nome) {
        return pessoaRepository.list().stream()
                .filter(pessoaEntity -> pessoaEntity.getNome().toUpperCase().contains(nome.toUpperCase()))
                .map(pessoaEntity -> objectMapper.convertValue(pessoaEntity, PessoaDTO.class))
                .collect(Collectors.toList());

    }
}
