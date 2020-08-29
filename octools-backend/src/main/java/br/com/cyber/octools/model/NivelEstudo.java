package br.com.cyber.octools.model;

public enum NivelEstudo {
  BASICO(1),
  INTERMEDIARIO(2),
  AVANCADO(3);

  private Integer valor;

  private NivelEstudo(Integer valor) {
    this.valor = valor;
  }

  public Integer getValor() {
    return valor;
  }
}