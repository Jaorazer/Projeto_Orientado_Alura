package jao.teste.exemplo.calculadora;

import jao.teste.exemplo.modelos.Title;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void verTempo (Title titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }


}
