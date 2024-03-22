package br.com.alura.screenmatch.calculos;

import br.alura.screenmatch.modelos.Filme;
import br.alura.screenmatch.modelos.Serie;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluiTempo(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public void incluiTempo(Serie s) {
        tempoTotal += s.getDuracaoEmMinutos();
    }
}
