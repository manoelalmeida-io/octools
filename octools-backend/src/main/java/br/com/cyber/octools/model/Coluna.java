package br.com.cyber.octools.model;
public class Coluna {

	private String nome;
	private Boolean excluivel;

	public Coluna(String nome, Boolean excluivel) {
		this.nome = nome;
		this.excluivel = excluivel;
	}

	public String getNome() {
		return nome;
	}

	public Boolean getExcluivel() {
		return excluivel;
	}
}