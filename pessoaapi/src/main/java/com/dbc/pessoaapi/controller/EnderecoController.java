package com.dbc.pessoaapi.controller;

import com.dbc.pessoaapi.dto.EnderecoCreateDTO;
import com.dbc.pessoaapi.dto.EnderecoDTO;
import com.dbc.pessoaapi.entity.EnderecoEntity;
import com.dbc.pessoaapi.exceptions.RegraDeNegocioException;
import com.dbc.pessoaapi.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/endereco")
@Validated
@RequiredArgsConstructor
@Slf4j
public class EnderecoController {
    private final EnderecoService enderecoService;

    @GetMapping
    public List<EnderecoDTO> list() {
        return enderecoService.list();
    }

    @GetMapping("/{idPessoa}/pessoa")
    public List<EnderecoDTO> listEnderecoPorPessoa(@PathVariable("idPessoa")Integer idPessoa) {
        return enderecoService.listEnderecoPorPessoa(idPessoa);
    }

    @GetMapping("/{idEndereco}")
    public EnderecoDTO listEnderecoPorId(@PathVariable("idEndereco") Integer idEndereco) throws RegraDeNegocioException {
        return enderecoService.listEnderecoPorId(idEndereco);
    }


    @PostMapping("/{idPessoa}")
    public EnderecoDTO create(@PathVariable("idPessoa") Integer idPessoa,
                                 @RequestBody @Valid EnderecoCreateDTO enderecoCreateDTO) throws RegraDeNegocioException {
        log.info("Criando endereço.");
        EnderecoDTO enderecoDTO1 = enderecoService.create(idPessoa, enderecoCreateDTO);
        log.info("Endereço criado com sucesso.");
        return enderecoDTO1;
    }

    @PutMapping("/{id}")
    public EnderecoDTO update(@PathVariable("id") Integer idEndereco,
                                 @RequestBody @Valid EnderecoCreateDTO enderecoCreateDTO) throws RegraDeNegocioException {
        log.info("Atualizando endereço.");
        EnderecoDTO enderecoDTO1 = enderecoService.update(idEndereco, enderecoCreateDTO);
        log.info("Endereço atualizado com sucesso.");
        return enderecoDTO1;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer idEndereco) throws RegraDeNegocioException {
        log.info("Deletando endereço");
        enderecoService.delete(idEndereco);
        log.info("Endereço deletado com sucesso.");
    }
}
