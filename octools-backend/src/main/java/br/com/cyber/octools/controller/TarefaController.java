package br.com.cyber.octools.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cyber.octools.model.Feedback;
import br.com.cyber.octools.model.Prioridade;
import br.com.cyber.octools.model.Tarefa;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
  
  private List<Tarefa> tarefas = new ArrayList<>();

  public TarefaController() {
    this.tarefas.addAll(
      List.of(new Tarefa("Tarefa 1", "Descrição da tarefa 1", 8, Prioridade.DESEJAVEL),
      new Tarefa("Tarefa 2", "Descrição da tarefa 2", 5, Prioridade.IMPORTANTE)));
  }

  @GetMapping
  public List<Tarefa> todas() {
    return this.tarefas;
  }

  @GetMapping("/{id}")
  public Tarefa visualizar(@PathVariable Long id) {
    return this.tarefas.get(id.intValue() - 1);
  }

  @PostMapping
  public Tarefa cadastrar(@RequestBody Tarefa tarefa) {
    this.tarefas.add(tarefa);
    return tarefa;
  }

  @PutMapping("/{id}")
  public Tarefa atualizar(@PathVariable Long id, @RequestBody Tarefa tarefa) {
    this.tarefas.set(id.intValue() - 1, tarefa);
    return this.tarefas.get(id.intValue() - 1);
  }

  @DeleteMapping("/{id}")
  public void excluir(@PathVariable Long id) {
    this.tarefas.remove(id.intValue() - 1);
  }

  @GetMapping("finalizar/{indice}")
  public void finalizar(@PathVariable Integer indice) {
    this.tarefas.get(indice).finalizarTarefa(Feedback.FELIZ);
  }
}