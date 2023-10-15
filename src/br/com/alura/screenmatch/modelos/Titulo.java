package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.AnoInvalidoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable <Titulo> {
    private String nome;
    private int anoDeLancamento;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private boolean incluidoNoPlano;
    private int duracaoEmMinutos;



    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if (meuTituloOmdb.year().length() > 4){
            throw new AnoInvalidoException("Não converti o ano, pq tem mais que 4 caracteres"); //criei uma exception

        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
                                                                 //set, defino   ambos encapsulam o codigo
    public boolean getIncluidoNoPlano() {                //get, chamo
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {

        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){                            //get n autorizo a pessoa alterar mas exibe

        return totalDeAvaliacoes;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {        //set, autorizo, mas n exibe

        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {

        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {

        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }
    public void exibeFichaTecnica(){                                           //void não retorna nenhum valor
        System.out.println(nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }
    public double mostraMedia(){

        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return getNome().compareTo(outroTitulo.getNome());  //"nome do titulo, comparado com nome de outro titulo"
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Ano de lançamento: " + anoDeLancamento +
                ", Duração em minutos: " + duracaoEmMinutos ;

    }
}

