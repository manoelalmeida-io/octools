package br.com.cyber.octools.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonGetter;

public class Tarefa implements Pontuavel {
  
  private String nome;
  private String descricao;
  private LocalDate dataCriacao;
  private LocalDate dataEntrega;
  private LocalDate dataFinalizacao;
  private Integer nivel;
  private Boolean concluida;
  private Prioridade prioridade;
  private Feedback feedback;

  public Tarefa(String nome, String descricao, Integer nivel, Prioridade prioridade) {
    this.nome = nome;
    this.descricao = descricao;
    this.nivel = nivel;
    this.dataCriacao = LocalDate.now();
    this.concluida = false;
    this.prioridade = prioridade;
  }

  @JsonGetter("pontuacao")
  @Override
  public Integer calcularPontuacao() {
    if (concluida) {
      return 0;
    }
    return 100; // TODO: calculo certo.
  }

  public void finalizarTarefa(Feedback feedback) {
    this.dataFinalizacao = LocalDate.now();
    this.feedback = feedback;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public LocalDate getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(LocalDate dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public LocalDate getDataEntrega() {
    return dataEntrega;
  }

  public void setDataEntrega(LocalDate dataEntrega) {
    this.dataEntrega = dataEntrega;
  }

  public LocalDate getDataFinalizacao() {
    return dataFinalizacao;
  }

  public void setDataFinalizacao(LocalDate dataFinalizacao) {
    this.dataFinalizacao = dataFinalizacao;
  }

  public Integer getNivel() {
    return nivel;
  }

  public void setNivel(Integer nivel) {
    this.nivel = nivel;
  }


  public Prioridade getPrioridade() {
    return prioridade;
  }

  public void setPrioridade(Prioridade prioridade) {
    this.prioridade = prioridade;
  }

  public Feedback getFeedback() {
    return feedback;
  }

  public void setFeedback(Feedback feedback) {
    this.feedback = feedback;
  }

  @Override
  public String toString() {
    return "Tarefa [dataCriacao=" + dataCriacao + 
      ", dataEntrega=" + dataEntrega + 
      ", dataFinalizacao=" + dataFinalizacao + 
      ", descricao=" + descricao + 
      ", feedback=" + feedback + 
      ", nivel=" + nivel + 
      ", nome=" + nome + 
      ", prioridade=" + prioridade + 
      ", concluida=" + concluida + "]";
  }
}