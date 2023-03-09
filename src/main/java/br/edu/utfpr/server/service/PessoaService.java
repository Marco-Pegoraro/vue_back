package br.edu.utfpr.server.service;

import br.edu.utfpr.server.model.Pessoa;

import java.util.List;

public interface PessoaService {

    Pessoa save(Pessoa pessoa);

    Pessoa findOne(Long id);

    List<Pessoa> findAll();

    void delete(Long id);

}
