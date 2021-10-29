package com.dbc.pessoaapi.controller;

import com.dbc.pessoaapi.dto.ContatoCreateDTO;
import com.dbc.pessoaapi.dto.ContatoDTO;
import com.dbc.pessoaapi.entity.ContatoEntity;
import com.dbc.pessoaapi.exceptions.RegraDeNegocioException;
import com.dbc.pessoaapi.service.ContatoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/contato")
@Validated
@RequiredArgsConstructor
@Slf4j
public class ContatoController {
    private final ContatoService contatoService;


    @PostMapping("/{idPessoa}")
    public ContatoDTO create(@PathVariable("idPessoa") Integer idPessoa,
                             @RequestBody @Valid ContatoCreateDTO contatoCreateDTO) throws RegraDeNegocioException {
        log.info("Criando contato.");
        ContatoDTO contatoDTO1 = contatoService.create(idPessoa, contatoCreateDTO);
        log.info("Contato criado com sucesso.");
        return contatoDTO1;
    }

    @GetMapping
    public List<ContatoDTO> list() {
        return contatoService.list();
    }

    @GetMapping("/{idPessoa}")
    public List<ContatoDTO> listPorIdPessoa(@PathVariable("idPessoa") Integer idPessoa) {
        return contatoService.listPorIdPessoa(idPessoa);
    }

    @PutMapping("/{idContato}")
    public ContatoDTO update(@PathVariable("idContato") Integer idContato,
                                @RequestBody @Valid ContatoCreateDTO contatoCreateDTOAtualizar) throws RegraDeNegocioException {
        log.info("Atualizando contato.");
        ContatoDTO contatoDTO1 = contatoService.update(idContato, contatoCreateDTOAtualizar);
        log.info("Contato atualizado com sucesso.");
        return contatoDTO1;
    }

    @DeleteMapping("/{idContato}")
    public void delete(@PathVariable("idContato") Integer idContato) throws RegraDeNegocioException {
        log.info("Deletando contato.");
        contatoService.delete(idContato);
        log.info("Contato deletado com sucesso.");
    }


}
