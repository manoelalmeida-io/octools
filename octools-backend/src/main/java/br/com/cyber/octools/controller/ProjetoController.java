package br.com.cyber.octools.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.cyber.octools.model.Projeto;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {
  List<Projeto> projetos = new ArrayList<>();

  @GetMapping
  public List<Projeto> todas() {
    return this.projetos;
  }

  @GetMapping("/{id}")
  public Projeto visualizar(@PathVariable Long id){
    return this.projetos.get(id.intValue() - 1);
  }

  @PostMapping
  public Projeto cadastrar(@RequestBody Projeto projeto) {
    this.projetos.add(projeto);
    return projeto;
  }

  @PutMapping("/{id}")
  public Projeto atualizar(@PathVariable Long id, @RequestBody Projeto projeto) {
    this.projetos.set(id.intValue() - 1, projeto);
    return this.projetos.get(id.intValue() - 1);
  }

  @DeleteMapping("/{id}")
  public void excluir(@PathVariable Long id) {
    this.projetos.remove(id.intValue() - 1);
  }
  
}