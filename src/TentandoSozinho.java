import jao.teste.exemplo.calculadora.CalculadoraDeTempo;
import jao.teste.exemplo.modelos.Movie;
import jao.teste.exemplo.modelos.Serie;

public class TentandoSozinho {
    public static void main(String[] args) {

        Movie movie1 = new Movie();

        movie1.setNome("Star Wars");
        movie1.setAnoDeLancamento(2007);
        movie1.setDuracaoEmMinutos(220);
        movie1.fichaTecnica();
        movie1.avalia(7);
        movie1.avalia(9);
        System.out.println("Total avaliações: " + movie1.getNumeroDeAvaliacoes());
        movie1.darMedia();
        System.out.println("Média filme: " + movie1.darMedia());

        Serie serie01 = new Serie();

        serie01.setNome("Modern Family");
        serie01.setAnoDeLancamento(2020);
        serie01.setTemporadas(9);
        serie01.setEpisodiosPorTemporada(18);
        serie01.setMinutosPorEpisodio(22);
        serie01.fichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.verTempo(serie01);
        calculadora.verTempo(movie1);
        System.out.println("Para maratonar: " + calculadora.getTempoTotal());





    }

}
