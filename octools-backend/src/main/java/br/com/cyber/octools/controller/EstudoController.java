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

import br.com.cyber.octools.model.Estudo;

@RestController
@RequestMapping("/estudos")
public class EstudoController {

  List<Estudo> estudos = new ArrayList<>();

  @GetMapping
  public List<Estudo> todas() {
    return this.estudos;
  }

  @GetMapping("/{id}")
  public Estudo visualizar(Long id){
    return this.estudos.get(id.intValue() - 1);
  }

  @PostMapping
  public Estudo cadastrar(@RequestBody Estudo estudo) {
    this.estudos.add(estudo);
    return estudo;
  }

  @PutMapping("/{id}")
  public Estudo atualizar(@PathVariable Long id, @RequestBody Estudo estudo) {
    this.estudos.set(id.intValue() - 1, estudo);
    return this.estudos.get(id.intValue() - 1);
  }

  @DeleteMapping("/{id}")
  public void excluir(@PathVariable Long id) {
    this.estudos.remove(id.intValue() - 1);
  }
}