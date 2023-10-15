package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculadora.Classificavel;

public class Filme extends Titulo implements Classificavel {   //filme herda titulo e ainda implementa classificavel

    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);  //como eu coloquei o contrutor la na mãe, preciso chamar ela aqui por super
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de Lançamento: " + getAnoDeLancamento());;    // OVERRIDE: reescrita de atributo ou metodo da classe mae
    }
    @Override
    public int getEstrelas() {
        return (int) mostraMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + getNome() + " (" + getAnoDeLancamento() + ")";
    }
}
