package br.com.cyber.octools.model;

import java.util.ArrayList;
import java.util.List;

public class Projeto {

	private String nome;
	private String descricao;
	private List<Usuario> membros;
	private List<Coluna> colunas;

	public Projeto(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.membros = new ArrayList<>();
		this.colunas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public List<Usuario> getMembros() {
		return membros;
	}

	public List<Coluna> getColunas() {
		return colunas;
	}
}
