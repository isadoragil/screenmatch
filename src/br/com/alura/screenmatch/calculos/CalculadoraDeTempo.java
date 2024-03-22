package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void incluiTempo(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void incluiTempo(Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void incluiTempo(Titulo t) {
        System.out.println("Adicionando duração em minutos de " + t);
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
