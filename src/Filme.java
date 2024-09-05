public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracaoEmMinutos;

    void  exibeFichaTecnica (){
        System.out.println("Nomde do filme: " +nome);
        System.out.println("Ano de Lançamento: "  +anoDeLancamento);
        System.out.println("Duração do Filme: " + duracaoEmMinutos);

    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegamedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }

}
