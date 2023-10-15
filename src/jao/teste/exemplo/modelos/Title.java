package jao.teste.exemplo.modelos;

public class Title {

    String nome;
    int anoDeLancamento;
    double avaliacoes;
    int numeroDeAvaliacoes;
    int duracaoEmMinutos;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setAvaliacoes(double avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setNumeroDeAvaliacoes(int numeroDeAvaliacoes) {
        this.numeroDeAvaliacoes = numeroDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getNumeroDeAvaliacoes() {
        return numeroDeAvaliacoes;
    }

    public void fichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    public void avalia(double nota){
        avaliacoes += nota;
        numeroDeAvaliacoes ++;
    }
    public double darMedia(){
        return avaliacoes/numeroDeAvaliacoes;
    }
}
