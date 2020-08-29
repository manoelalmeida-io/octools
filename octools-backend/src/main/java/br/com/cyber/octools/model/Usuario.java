package br.com.cyber.octools.model;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String funcao;

    public Usuario(String nome, String email, String senha, String funcao) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }    

}