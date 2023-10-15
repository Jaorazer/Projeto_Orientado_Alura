package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculadora.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculadora.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme filme01 = new Filme("Transformers", 2007);            //esquerda gurdando / direita criando objeto

        //sem nome, sem filme, então faz sentido colocar o construtor com nome e inclusive com lançamento
        filme01.setDuracaoEmMinutos(180);

        filme01.exibeFichaTecnica();

        filme01.avalia(7);
        filme01.avalia(10);
        filme01.avalia(8);
        System.out.println("Total de avaliações: " + filme01.getTotalDeAvaliacoes());
        System.out.println("Média de: " + filme01.mostraMedia());


        Serie serie01 = new Serie("Brooklyn 99", 2013);
        serie01.exibeFichaTecnica();
        serie01.setTemporadas(8);
        serie01.setEpisodiosPorTemporada(22);
        serie01.setMinutosPorEpisodio(24);
        System.out.println("Duração para assistir: Brooklyn 99 é de " + serie01.getDuracaoEmMinutos() + " minutos");

        Filme filme02 = new Filme("Up em altas aventuras", 2015);

        filme02.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme01);
        calculadora.inclui(filme02);
        calculadora.inclui(serie01);
        System.out.println("Para maratonar o que deseja, será preciso de " + calculadora.getTempoTotal() + " minutos");

        filme01.setDiretor("João babas");
        System.out.println("Diretor: " + filme01.getDiretor());

        FiltroRecomendacao filtro01 = new FiltroRecomendacao();
        filtro01.filtra(filme01);

        Episodios episodio01 = new Episodios();
        episodio01.setNumero(1);
        episodio01.setSerie(serie01);
        episodio01.setTotalVisualizacoes(80);
        filtro01.filtra(episodio01);

        var filme03 = new Filme("Sherek", 2001);       // ao colocar var, o java nesse caso, sabe q estou me referenciando a filme
        filme03.setDuracaoEmMinutos(90);
        filme03.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme01);
        listaDeFilmes.add(filme02);
        listaDeFilmes.add(filme03);
        System.out.println("Possui " + listaDeFilmes.size() + " filmes");
        System.out.println("Primeiro Filme é " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do " + listaDeFilmes.get(0).toString());  //tostring é da classe objetos
        // (superclasse da qual todas derivam) e as arrays derivam o tostring q nem na linha acima, eu n fiz nada


    }

}


