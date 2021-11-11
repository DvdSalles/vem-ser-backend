package com.dbc.pessoaapi.service;

import com.dbc.pessoaapi.client.DadosPessoaisClient;
import com.dbc.pessoaapi.dto.*;
import com.dbc.pessoaapi.entity.PessoaEntity;
import com.dbc.pessoaapi.exceptions.RegraDeNegocioException;
import com.dbc.pessoaapi.repository.PessoaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import freemarker.template.TemplateException;
import io.swagger.models.auth.In;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PessoaService {
    private final PessoaRepository pessoaRepository;
    private final ObjectMapper objectMapper;
    private final EmailService emailService;
    private final DadosPessoaisClient dadosPessoaisClient;


    public PessoaDTO create(PessoaCreateDTO pessoaCreateDTO) throws RegraDeNegocioException, MessagingException, TemplateException, IOException {
        PessoaEntity pessoaEntity = objectMapper.convertValue(pessoaCreateDTO, PessoaEntity.class);
        PessoaEntity pessoaCriada = pessoaRepository.save(pessoaEntity);
        PessoaDTO pessoaDTO = objectMapper.convertValue(pessoaCriada, PessoaDTO.class);
//        emailService.enviarEmailComTemplate(pessoaDTO);
        return pessoaDTO;
    }

    private PessoaEntity findById(Integer id) throws RegraDeNegocioException {
        PessoaEntity pessoaEntity = pessoaRepository.findById(id)
                .orElseThrow(() -> new RegraDeNegocioException("Pessoa não encontrada."));
        return pessoaEntity;
    }

    public List<PessoaDTO> list(){
        return pessoaRepository.findAll().stream()
                .map(pessoa -> {
                   PessoaDTO dto = objectMapper.convertValue(pessoa, PessoaDTO.class);
                   return dto;
                })
                .collect(Collectors.toList());
    }

    public PessoaDTO getById(Integer id) throws RegraDeNegocioException {
        PessoaEntity entity = findById(id);
        PessoaDTO dto = objectMapper.convertValue(entity, PessoaDTO.class);
        return dto;
    }

    public PessoaDTO update(Integer id,
                               PessoaCreateDTO pessoaCreateDTO) throws RegraDeNegocioException, MessagingException, TemplateException, IOException {
        PessoaEntity pessoaEntity = objectMapper.convertValue(pessoaCreateDTO, PessoaEntity.class);
        pessoaEntity.setIdPessoa(id);
        PessoaEntity pessoaAtualizada = pessoaRepository.save(pessoaEntity);
        PessoaDTO pessoaDTO = objectMapper.convertValue(pessoaAtualizada, PessoaDTO.class);
//        emailService.enviarEmailComTemplateUpdate(pessoaDTO);
        return pessoaDTO;
    }

    public void delete(Integer id) throws RegraDeNegocioException, MessagingException, TemplateException, IOException {
        PessoaEntity pessoaDeletada = findById(id);
        pessoaRepository.delete(pessoaDeletada);
//        PessoaDTO pessoaDTO = objectMapper.convertValue(pessoaDeletada, PessoaDTO.class);
//        emailService.enviarEmailComTemplateDelete(pessoaDTO);
    }

    public List<PessoaDTO> listByName(String nome) {
        return pessoaRepository.findAll().stream()
                .filter(pessoa -> pessoa.getNome().toUpperCase().contains(nome.toUpperCase()))
                .map(pessoa -> {
                    PessoaDTO dto = objectMapper.convertValue(pessoa, PessoaDTO.class);
                    return dto;
                })
                .collect(Collectors.toList());
    }

    public List<PessoaComContatoDTO> listarPessoaComContatoComOuSemId(Integer idPessoa) {
        if (idPessoa != null) {
            return pessoaRepository.findAll().stream()
                    .filter(pessoaEntity -> pessoaEntity.getIdPessoa().equals(idPessoa))
                    .map(pessoaEntity -> {
                        PessoaComContatoDTO dto1 = objectMapper.convertValue(pessoaEntity, PessoaComContatoDTO.class);
                        dto1.setContatos(pessoaEntity.getContatos().stream()
                                .map(contatoEntity -> objectMapper.convertValue(contatoEntity, ContatoDTO.class))
                                .collect(Collectors.toList()));
                        return dto1;
                    }).collect(Collectors.toList());
        } else {
            return pessoaRepository.findAll().stream()
                    .map(pessoaEntity -> {
                        PessoaComContatoDTO dto = objectMapper.convertValue(pessoaEntity, PessoaComContatoDTO.class);
                        dto.setContatos(pessoaEntity.getContatos().stream()
                                .map(contatoEntity -> objectMapper.convertValue(contatoEntity, ContatoDTO.class))
                                .collect(Collectors.toList()));
                        return dto;

                    })
                    .collect(Collectors.toList());
        }
    }

    public List<PessoaComEnderecoDTO> listarPessoaComEnderecoComOuSemId(Integer idPessoa) {
        if (idPessoa != null) {
            return pessoaRepository.findAll().stream()
                    .filter(pessoaEntity -> pessoaEntity.getIdPessoa().equals(idPessoa))
                    .map(pessoaEntity -> {
                        PessoaComEnderecoDTO dto1 = objectMapper.convertValue(pessoaEntity, PessoaComEnderecoDTO.class);
                        dto1.setEnderecos(pessoaEntity.getEnderecos().stream()
                                .map(endereco -> objectMapper.convertValue(endereco, EnderecoDTO.class))
                                .collect(Collectors.toList()));
                        return dto1;
                    }).collect(Collectors.toList());
        } else {
            return pessoaRepository.findAll().stream()
                    .map(pessoaEntity -> {
                        PessoaComEnderecoDTO dto = objectMapper.convertValue(pessoaEntity, PessoaComEnderecoDTO.class);
                        dto.setEnderecos(pessoaEntity.getEnderecos().stream()
                                .map(endereco -> objectMapper.convertValue(endereco, EnderecoDTO.class))
                                .collect(Collectors.toList()));
                        return dto;

                    })
                    .collect(Collectors.toList());
        }
    }
    public List<PessoaContatoEnderecoDTO> listarPessoaComContatoEnderecoComOuSemId(Integer idPessoa) {
        if (idPessoa != null) {
            return pessoaRepository.findAll().stream()
                    .filter(pessoaEntity -> pessoaEntity.getIdPessoa().equals(idPessoa))
                    .map(pessoaEntity -> {
                        PessoaContatoEnderecoDTO dto1 = objectMapper.convertValue(pessoaEntity, PessoaContatoEnderecoDTO.class);
                        dto1.setContatos(pessoaEntity.getContatos().stream()
                                .map(contatoEntity -> objectMapper.convertValue(contatoEntity, ContatoDTO.class))
                                .collect(Collectors.toList()));
                        dto1.setEnderecos(pessoaEntity.getEnderecos().stream()
                                .map(endereco -> objectMapper.convertValue(endereco, EnderecoDTO.class))
                                .collect(Collectors.toList()));
                        return dto1;
                    }).collect(Collectors.toList());
        } else {
            return pessoaRepository.findAll().stream()
                    .map(pessoaEntity -> {
                        PessoaContatoEnderecoDTO dto = objectMapper.convertValue(pessoaEntity, PessoaContatoEnderecoDTO.class);
                        dto.setContatos(pessoaEntity.getContatos().stream()
                                .map(contatoEntity -> objectMapper.convertValue(contatoEntity, ContatoDTO.class))
                                .collect(Collectors.toList()));
                        dto.setEnderecos(pessoaEntity.getEnderecos().stream()
                                .map(endereco -> objectMapper.convertValue(endereco, EnderecoDTO.class))
                                .collect(Collectors.toList()));
                        return dto;
                    })
                    .collect(Collectors.toList());
        }
    }
}
