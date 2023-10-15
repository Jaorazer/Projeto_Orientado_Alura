package br.com.alura.screenmatch.excecao;

public class AnoInvalidoException extends RuntimeException {  //trocou extends do throwable, pq com ele vc é obrigado a ter um try catch
    private String mensagem;


    public AnoInvalidoException(String mensagem) {
        this.mensagem = mensagem;
    }


    public String getMensagem() {
        return this.mensagem;
    }
}
