package com.dbc.pessoaapi.repository;

import com.dbc.pessoaapi.entity.Endereco;
import com.dbc.pessoaapi.entity.TipoEndereco;
import com.dbc.pessoaapi.exceptions.RegraDeNegocioException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Repository
public class EnderecoRepository {
    private static List<Endereco> listaEndereco = new ArrayList<>();
    private AtomicInteger COUNTER_ENDERECO = new AtomicInteger();

    public EnderecoRepository () {
        listaEndereco.add(new Endereco(COUNTER_ENDERECO.incrementAndGet(), 2, TipoEndereco.RESIDENCIAL, "Rua das Ruas",
                55, "Casa", "72887998", "Lagoinha", "DF", "Brasil"));
    }

    public List<Endereco> list() {
        return listaEndereco;
    }

    public List<Endereco> listEnderecoPorPessoa(Integer idPessoa) {
        return listaEndereco.stream()
                .filter(endereco -> endereco.getIdPessoa().equals(idPessoa))
                .collect(Collectors.toList());
    }

    public Endereco listEnderecoPorId(Integer idEndereco) throws RegraDeNegocioException {
        Endereco enderecoRecuperado = listaEndereco.stream()
                .filter(endereco -> endereco.getIdEndereco().equals(idEndereco))
                .findFirst()
                .orElseThrow(() -> new RegraDeNegocioException("Endereço não encontrado!"));
        return enderecoRecuperado;
    }

    public Endereco create(Endereco endereco) {
        endereco.setIdEndereco(COUNTER_ENDERECO.incrementAndGet());
        listaEndereco.add(endereco);
        return endereco;
    }

    public Endereco update(Integer id, Endereco enderecoAtualizar) throws RegraDeNegocioException {
        Endereco enderecoRecuperado = listaEndereco.stream()
                .filter(endereco -> endereco.getIdEndereco().equals(id))
                .findFirst()
                .orElseThrow(() -> new RegraDeNegocioException("Endereço não encontrado!"));
        enderecoRecuperado.setIdPessoa(enderecoAtualizar.getIdPessoa());
        enderecoRecuperado.setTipo(enderecoAtualizar.getTipo());
        enderecoRecuperado.setLogradouro(enderecoAtualizar.getLogradouro());
        enderecoRecuperado.setNumero(enderecoAtualizar.getNumero());
        enderecoRecuperado.setComplemento(enderecoAtualizar.getComplemento());
        enderecoRecuperado.setCep(enderecoAtualizar.getCep());
        enderecoRecuperado.setCidade(enderecoAtualizar.getCidade());
        enderecoRecuperado.setEstado(enderecoAtualizar.getEstado());
        enderecoRecuperado.setPais(enderecoAtualizar.getPais());
        return enderecoRecuperado;
    }

    public void delete(Integer idEndereco) throws RegraDeNegocioException {
        Endereco enderecoRecuperado = listaEndereco.stream()
                .filter(endereco -> endereco.getIdEndereco().equals(idEndereco))
                .findFirst()
                .orElseThrow(() -> new RegraDeNegocioException("Endereço não encontrado!"));
        listaEndereco.remove(enderecoRecuperado);
    }
}
