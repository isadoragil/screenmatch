package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVsualizacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVsualizacoes() {
        return totalVsualizacoes;
    }

    public void setTotalVsualizacoes(int totalVsualizacoes) {
        this.totalVsualizacoes = totalVsualizacoes;
    }

    @Override
    public int getClassificacao() {
        if (totalVsualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
