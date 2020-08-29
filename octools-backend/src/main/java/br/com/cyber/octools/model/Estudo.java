package br.com.cyber.octools.model;

public class Estudo implements Pontuavel {
    
    private String nome;
    private Integer horas;
    private NivelEstudo nivelEstudo;

    public Estudo(String nome, Integer horas, NivelEstudo nivelEstudo){
        this.nome = nome;
        this.horas = horas;
        this.nivelEstudo = nivelEstudo;
    }
    
    @Override
    public Integer calcularPontuacao() {
        return 50; // TODO: calculo certo.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public NivelEstudo getNivelEstudo() {
        return nivelEstudo;
    }

    public void setNivelEstudo(NivelEstudo nivelEstudo) {
        this.nivelEstudo = nivelEstudo;
    }

    @Override
    public String toString() {
        return "Estudo [horas=" + horas + ", nivelEstudo=" + nivelEstudo + ", nome=" + nome + "]";
    }
}