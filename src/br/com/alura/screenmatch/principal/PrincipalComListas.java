package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme filme01 = new Filme("Transformers", 2007);
        filme01.avalia(7);
        Filme filme02 = new Filme("Up em altas aventuras", 2015);
        filme02.avalia(9);
        var filme03 = new Filme("Sherek", 2001);       // ao colocar var, o java nesse caso, sabe q estou me referenciando a filme
        filme03.avalia(9);
        Serie serie01 = new Serie("Brooklyn 99", 2013);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme01);
        lista.add(filme02);
        lista.add(filme03);
        lista.add(serie01);

        for (Titulo item: lista) {      //para cada var "item", dentro da lista, vou dar um print, nesse caso
            System.out.println(item);
            if (item instanceof Filme filme && filme.getEstrelas() > 2  ){        //item vc vem de filme? instanceof
                //Filme filme = (Filme) item; era assim
                System.out.println("Classificação: " + filme.getEstrelas());
            }
        }


        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Gelado");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Donatello");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Lista ordenada");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista Ordenada");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por lançamento");
        System.out.println(lista);





    }
}
