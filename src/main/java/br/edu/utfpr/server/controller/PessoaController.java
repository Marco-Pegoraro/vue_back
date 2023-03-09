package br.edu.utfpr.server.controller;

import br.edu.utfpr.server.model.Pessoa;
import br.edu.utfpr.server.service.PessoaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping("/inicio")
    public String inicioController() {
        return "Rota teste";
    }

    @PostMapping
    public String create(@RequestBody @Valid Pessoa pessoa) {
        pessoaService.save(pessoa);
        return "Pessoa salva";
    }

    @GetMapping("{id}")
    public ResponseEntity<Pessoa> findOne(@PathVariable Long id) {
        return ResponseEntity.ok(pessoaService.findOne(id));
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> findAll() {
        return ResponseEntity.ok(pessoaService.findAll());
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable Long id) {
        pessoaService.delete(id);
        return "Pessoa deletada com sucesso";
    }

    @PutMapping
    public String update(@RequestBody @Valid Pessoa pessoa) {
        pessoaService.save(pessoa);
        return "Pessoa atualizada com sucesso";
    }

}
