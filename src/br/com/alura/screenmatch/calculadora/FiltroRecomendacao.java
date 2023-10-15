package br.com.alura.screenmatch.calculadora;

public class FiltroRecomendacao {

    public void filtra (Classificavel informacao) {
        if (informacao.getEstrelas() >= 4) {
            System.out.println("Entre os preferidos do momento");
        } else if (informacao.getEstrelas() >= 2) {
            System.out.println("Bem avaliados hoje");
        } else {
            System.out.println("Coloque em sua lista");
        }

    }

}


