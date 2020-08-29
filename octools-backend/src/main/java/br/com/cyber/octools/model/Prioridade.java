package br.com.cyber.octools.model;

public enum Prioridade {
  DESEJAVEL(1),
  IMPORTANTE(2),
  ESSENCIAL(3);

  private Integer valor;

  Prioridade(Integer valor) {
    this.valor = valor;
  }

  public Integer getValor() {
    return valor;
  }
}