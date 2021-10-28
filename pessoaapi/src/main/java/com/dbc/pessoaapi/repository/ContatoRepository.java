package com.dbc.pessoaapi.repository;

import com.dbc.pessoaapi.entity.Contato;
import com.dbc.pessoaapi.entity.TipoContato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Repository
public class ContatoRepository {
    private static List<Contato> listaContatos = new ArrayList<>();
    private AtomicInteger COUNTER_CONTATO = new AtomicInteger();

    public ContatoRepository() {
        listaContatos.add(new Contato(COUNTER_CONTATO.incrementAndGet(), 2, TipoContato.COMERCIAL, "999555599", "Ligue já!"));
    }

    public Contato create(Contato contato) {
        contato.setIdContato(COUNTER_CONTATO.incrementAndGet());
        listaContatos.add(contato);
        return contato;
    }

    public List<Contato> list() {
        return listaContatos;
    }

    public List<Contato> listPorIdPessoa(Integer idPessoa) {
        return listaContatos.stream()
                .filter(contato -> contato.getIdPessoa().equals(idPessoa))
                .collect(Collectors.toList());

    }

    public Contato update(Integer id, Contato contatoAtualizar) throws Exception{
        Contato contatoRecuperado = listaContatos.stream()
                .filter(contato -> contato.getIdContato().equals(id))
                .findFirst()
                .orElseThrow(() -> new Exception("Contato não encontrado."));
        contatoRecuperado.setIdPessoa(contatoAtualizar.getIdPessoa());
        contatoRecuperado.setTipoContato(contatoAtualizar.getTipoContato());
        contatoRecuperado.setNumero(contatoAtualizar.getNumero());
        contatoRecuperado.setDescricao(contatoAtualizar.getDescricao());
        return contatoRecuperado;
    }

    public Contato delete(Integer idContato) throws Exception {
        Contato contatoRecuperado = listaContatos.stream()
                .filter(contato -> contato.getIdContato().equals(idContato))
                .findFirst()
                .orElseThrow(() -> new Exception("Contato não encontrado."));
        listaContatos.remove(contatoRecuperado);
        return contatoRecuperado;
    }
}
