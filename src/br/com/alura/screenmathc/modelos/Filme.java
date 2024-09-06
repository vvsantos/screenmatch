package br.com.alura.screenmathc.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public double getSomaDasAvaliacoes(){
        return  somaDasAvaliacoes;
    }
    public void  exibeFichaTecnica (){
        System.out.println("Nomde do filme: " +nome);
        System.out.println("Ano de Lançamento: "  +anoDeLancamento);
        System.out.println("Duração do br.com.alura.screenmathc.modelos.Filme: " + duracaoEmMinutos);

    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegamedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }

}
