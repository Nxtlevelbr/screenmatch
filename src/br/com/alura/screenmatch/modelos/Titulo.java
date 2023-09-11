package br.com.alura.screenmatch.modelos;

public abstract class Titulo {
    public int SetDuracaoEmMinutos;
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    public int SetanoDeLancamento;
    public int SetduracaoEmMinutos;
    //PRIVATE para impedir que sejam alteradas
    //PRIVATE PARA IMPEDIR QUE SEJAM ALTERADAS

    public int getSetanoDeLancamento() {
        return SetanoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme " + nome);
        System.out.println("Ano de Lançamento " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public void Setnome(String oPoderosoChefao) {
    }

    public void SetanoDeLancamento(int i) {
    }

    public abstract int getClassificacao();
}
