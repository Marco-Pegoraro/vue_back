package br.edu.utfpr.server.service.serviceImpl;

import br.edu.utfpr.server.model.Pessoa;
import br.edu.utfpr.server.repository.PessoaRepository;
import br.edu.utfpr.server.service.PessoaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public Pessoa findOne(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        pessoaRepository.deleteById(id);
    }

}
