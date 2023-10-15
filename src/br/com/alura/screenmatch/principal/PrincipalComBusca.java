package br.com.alura.screenmatch.principal;


import br.com.alura.screenmatch.excecao.AnoInvalidoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public PrincipalComBusca() {
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Busque um filme: ");
        var busca = leitura.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=40204e7a";


        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();                                  //"build, é como se fosse um grande construtor"
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);


            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE) //primeira maiuscula, respeitando boas praticas
                    .create();

            //gson serve para poder transformar json em objeto java
            //Titulo meuTitulo = gson.fromJson(json, Titulo.class);


            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);   //transformei json na minha classe titulo
            System.out.println(meuTituloOmdb);

            //Titulo meuTitulo = new Titulo(meuTituloOmdb);
            //System.out.println("Titulo Convertido");
            //System.out.println(meuTitulo);

            //try{  joguei la para cima por causa da outra excessao

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo Convertido");
            System.out.println(meuTitulo);

        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Ocorreu um problema de URI, algo assim: " + e.getMessage());
        } catch (AnoInvalidoException e) {
            System.out.println(e.getMensagem());
        }

        System.out.println("Programa finalizado com sucesso");


    }
}
