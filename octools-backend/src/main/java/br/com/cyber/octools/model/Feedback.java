package br.com.cyber.octools.model;

public enum Feedback {
  TRISTE(1),
  INDIFERENTE(2),
  FELIZ(3);

  private Integer valor;

  Feedback(Integer valor) {
    this.valor = valor;
  }

  public Integer getValor() {
    return this.valor;
  }
}